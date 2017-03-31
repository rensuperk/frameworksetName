package cn.rk.setname;

import cn.rk.setname.model.Project;
import cn.rk.setname.service.impl.SetNameConfigServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by renkai on 2017/3/31.
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-service.xml");
        SetNameConfigServiceImpl bean = context.getBean(SetNameConfigServiceImpl.class);
        Project project = new Project();
        project.setCreateUserId("1234");
        bean.setName(project);
        System.out.println(project.getCreateUserName());
    }
}
