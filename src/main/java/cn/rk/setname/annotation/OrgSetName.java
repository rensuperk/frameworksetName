package cn.rk.setname.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;

/**
 * Created by renkai on 2017/3/31.
 */

@Target({FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@SetName
public @interface OrgSetName {
    SetName.Type type() default SetName.Type.NONE;
    String key() default "";
}
