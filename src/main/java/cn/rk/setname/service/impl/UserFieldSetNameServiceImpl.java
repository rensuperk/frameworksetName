package cn.rk.setname.service.impl;

import cn.rk.setname.annotation.SetName;
import cn.rk.setname.annotation.UserSetName;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;

/**
 * Created by renkai on 2017/3/31.
 */
@Service
public class UserFieldSetNameServiceImpl extends FieldSetNameTemplateService<String,UserSetName>{
//    @Reference
//    private UserRemoteService userRemoteService;

    @Override
    protected java.lang.String getValueByCode(String o) {
        if(StringUtils.isNotBlank(o)){
//            User user = userRemoteService.findByPK(o);
//            if(user != null){
//                return user.getName();
//            }
            return o+"用户的名字我得查查";
        }
        return null;
    }

    @Override
    protected UserSetName getAnooClass(Field fie) {
        return fie.getAnnotation(UserSetName.class);
    }

    @Override
    protected SetName.Type getType(UserSetName userSetName) {
        return userSetName.type();
    }

    @Override
    protected String getKey(UserSetName userSetName) {
        return userSetName.key();
    }

}
