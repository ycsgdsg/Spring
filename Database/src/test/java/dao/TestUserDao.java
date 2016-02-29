package dao;

import junit.framework.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;
import org.testng.annotations.Test;
import service.identity.userAccount.UserAccountService;
import type.UserAccountEntity;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by chaoyuan on 02/23/2016.
 */
public class TestUserDao {

    ApplicationContext context = new ClassPathXmlApplicationContext("hibernate-cfg.xml", "context.xml");
    TestHelper helper = (TestHelper)context.getBean("testHelper");

    @Test
    public void testUserAccountDao() {
        UserAccountEntity type = new UserAccountEntity();
        type.setUserId(1000L);
        type.setEmail("chaoyuan1@ea.com");
        type.setPassword("123");
        type.setDateCreated(new Timestamp(new Date().getTime()));
        type.setStatus(Short.valueOf("1"));
        type.setStatusReasonCode(Short.valueOf("1"));
        type.setEmailStatus(Short.valueOf("1"));
        helper.getUserService().save(type);

        UserAccountEntity type1 = helper.getUserService().getById(1000L);
        Assert.assertNotNull(type1);
    }
}
