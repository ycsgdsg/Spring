package dao;

import junit.framework.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;
import type.UserAccountEntity;

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
        for (long i = 1000; i <= 100000; i+=1000) {
            UserAccountEntity type = new UserAccountEntity();
            type.setUserId(i);
            String email = "chaoyuan" + String.valueOf(i) + "@ea.com";
            type.setEmail(email);
            type.setPassword("123");
            type.setDateCreated(new Timestamp(new Date().getTime()));
            type.setStatus(Short.valueOf("1"));
            type.setStatusReasonCode(Short.valueOf("1"));
            type.setEmailStatus(Short.valueOf("1"));
            helper.getUserService().save(type);

            UserAccountEntity type1 = helper.getUserService().getById(i);
            Assert.assertNotNull(type1);
        }
    }
}
