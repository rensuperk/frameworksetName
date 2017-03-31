package cn.rk.setname.service;

import java.util.List;

/**
 * Created by renkai on 2017/3/31.
 */
public interface FieldSetNameService<R,A>{
    public<T> void setName(T t);
    public<T> void setName(List<T> t);

}
