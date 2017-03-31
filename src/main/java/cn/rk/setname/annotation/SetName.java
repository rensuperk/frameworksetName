package cn.rk.setname.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;

/**
 * Created by renkai on 2017/3/31.
 */
@Target({TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SetName {
    Type type() default Type.NONE;

    /**
     * 类型枚举,用户和部门
     */
    public enum Type{
        CODE,VALUE,NONE
    }
}
