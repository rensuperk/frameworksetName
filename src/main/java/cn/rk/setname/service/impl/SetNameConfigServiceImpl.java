package cn.rk.setname.service.impl;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by renkai on 2017/3/31.
 */
@Service
public class SetNameConfigServiceImpl implements ApplicationContextAware{
    private ApplicationContext applicationContext;
    public <T,S extends FieldSetNameTemplateService>void setName(List<T> list, Class<S> clazz){
        S bean = applicationContext.getBean(clazz);
        bean.setName(list);
    }
    public <T,S extends FieldSetNameTemplateService>void setName(T t, Class<S> clazz){
        S bean = applicationContext.getBean(clazz);
        bean.setName(t);
    }
    public <T>void setName(T t){
        UserFieldSetNameServiceImpl user = applicationContext.getBean(UserFieldSetNameServiceImpl.class);
        user.setName(t);
        OrgFieldSetNameServiceImpl org = applicationContext.getBean(OrgFieldSetNameServiceImpl.class);
        org.setName(t);
    }


    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
