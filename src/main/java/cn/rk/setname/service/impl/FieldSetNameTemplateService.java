package cn.rk.setname.service.impl;

import cn.rk.setname.annotation.SetName;
import cn.rk.setname.service.FieldSetNameService;
import org.springframework.stereotype.Service;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by renkai on 2017/3/31.
 */
@Service
public abstract class FieldSetNameTemplateService<R,A extends Annotation> implements FieldSetNameService<R,A>{



    public <T>  void setName(T t) {
        Map<R,String> codeValue = new HashMap<R,String>();
        setName(codeValue,t);
    }




    public <T> void setName(List<T> list) {
        if(list != null && !list.isEmpty()){
            Map<R,String> codeValue = new HashMap<R,String>();
            for (T t : list) {
                setName(codeValue,t);
            }
        }
    }

    public <T> void setName(Map<R,String> codeValue , T t) {
        Map<String,R> keyCode = getkeyCode(t);
        setCodeAndValue(keyCode,codeValue,t);
    }

    private <T>void setCodeAndValue(Map<String,R> keyCode, Map<R,String> codeValue, T t){
        Class<?> aClass = t.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        //用俩map来存储数据
        if(keyCode ==null){
            keyCode = new HashMap<String,R>();
        }
        if(codeValue == null){
            codeValue = new HashMap<R,String>();
        }
        for (Field fie : declaredFields) {
            A annotation = getAnooClass(fie);
            if(annotation != null){
                if(SetName.Type.VALUE == getType(annotation) ){
                    fie.setAccessible(true);
                    String key = getKey(annotation);
                    try {
                        String value = null;
                        boolean flag = keyCode.containsKey(key);
                        if(flag){
                            R code = (R)keyCode.get(key);
                            if(codeValue.containsKey(code)){
                                value = codeValue.get(code);
                            }else{
                                value = getValueByCode(code);
                                codeValue.put(code,value);
                            }
                            fie.set(t,value);
                        }
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }

            }
        }
    }


    private <T>Map<String,R> getkeyCode(T t){
        Map<String,R> keyCode = null;
        Class<?> aClass = t.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        //用俩map来存储数据
        keyCode = new HashMap<String,R>();
        for (Field fie : declaredFields) {
            A annotation = getAnooClass(fie);
            if(annotation != null){
                if(SetName.Type.CODE == getType(annotation) ){
                    fie.setAccessible(true);
                    String key = getKey(annotation);
                    try {
                        R code = (R) fie.get(t);
                        boolean flag = keyCode.containsKey(key);
                        if(!flag){
                            keyCode.put(key ,code);
                        }
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }

            }
        }
        return keyCode;
    }
    protected abstract String getValueByCode(R r);
    protected abstract A getAnooClass(Field fie);
    protected abstract SetName.Type getType(A a);
    protected abstract String getKey(A a);

}
