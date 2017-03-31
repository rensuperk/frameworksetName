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

    /**
     * 指定类型装配name
     * @param list
     * @param clazzs
     * @param <T>
     * @param <S>
     */
    public <T,S extends FieldSetNameTemplateService>void setName(List<T> list, Class<S> ...clazzs){
        if(clazzs != null){
            for (Class<S> clazz : clazzs) {
                S bean = applicationContext.getBean(clazz);
                bean.setName(list);
            }
        }
    }

    /**
     * 指定装配对象name
     * @param t
     * @param clazzs
     * @param <T>
     * @param <S>
     */
    public <T,S extends FieldSetNameTemplateService>void setName(T t, Class<S> ...clazzs){
        if(clazzs != null){
            for (Class<S> clazz : clazzs) {
                S bean = applicationContext.getBean(clazz);
                bean.setName(t);
            }
        }
    }

    /**
     * 全部装配对象name
     * @param t
     * @param <T>
     */
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
