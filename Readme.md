# 项目的目的
 # [项目地址](https://github.com/rensuperk/frameworksetName)
  ## 实现dto自动根据code值装配value值
  ### 1. 痛点
为了保证数据的准确性,对象的数据库表没有冗余字段,
往往需要根据id查询名称,或者根据code查询名称,
这样就会产生大量的无用代码,
影响美观.
so...我就想写个自动的架构来实现这一个功能
  ### 2. 这个项目的特点
1. 基于自定义注解利用反射机制来实现字段的自动装配
2. 使用了模版方法模式,组装模式等设计模式,其他的设计模式我也没看出来
3. 依赖于spring框架的依赖注入来实现这个功能
4. 现在手动启用装配,以后可以用aop来实现次功能
5. 项目没有依赖数据库和缓存,为了保证查询的效率,可以将查询到的code和value存入缓存中.
6. 大概就这么多,强行第六条

![uml](http://upload-images.jianshu.io/upload_images/5116036-f38d9877656812c2.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
    
### 3. 使用方法
1. 新建查询的类型的注解,方法type获取注解的类型,key获取注解的key
2. 在model中需要code和value对应的字段,分别在字段上添加注解,暂时只支持字段上的注解,以后也是,分别标记type=code或者value,如果同一个类型多次出现,就指定key值加以区分
3. 新建类继承cn.rk.setname.service.impl.FieldSetNameTemplateService,重写要实现的方法
    1. 根据code查询value的方法
    2. 获取注解对象的方法
    3.获取注解对象的类型的方法
    4.获取注解对象的key的方法
4. 实例化bean:cn.rk.setname.service.impl.SetNameConfigServiceImpl使用响应的方法来实现想要实现的功能
    1. 列表全部装配value
    2. 指定类型装配value
    3. 对象装配value