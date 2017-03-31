package cn.rk.setname.service.impl;

import cn.rk.setname.annotation.OrgSetName;
import cn.rk.setname.annotation.SetName;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;

/**
 * Created by renkai on 2017/3/31.
 */
@Service
public class OrgFieldSetNameServiceImpl extends FieldSetNameTemplateService<Long,OrgSetName>{
//    @Reference
//    private OrganizationRemoteService organizationRemoteService;

    @Override
    protected String getValueByCode(Long o) {
        if(o != null){
//            Organization organization = organizationRemoteService.findByAuthKey(o, UserContext.getCurrentUser().getTenantId());
//            if(organization != null){
//                return organization.getName();
//            }
            return o+"部门的名字我得查查";
        }
        return null;
    }

    @Override
    protected OrgSetName getAnooClass(Field fie) {
        return fie.getAnnotation(OrgSetName.class);
    }

    @Override
    protected SetName.Type getType(OrgSetName orgSetName) {
        return orgSetName.type();
    }

    @Override
    protected String getKey(OrgSetName orgSetName) {
        return orgSetName.key();
    }

}
