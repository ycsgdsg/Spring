package dao;

import junit.framework.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
import org.testng.annotations.Test;
import service.identity.userAccount.UserAccountService;
import type.UserAccountEntity;

/**
 * Created by chaoyuan on 02/23/2016.
 */
@ContextConfiguration(locations = {"classpath:/context.xml", "classpath:/hibernate-cfg.xml"})
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
@Transactional
public class TestUserDao {
    ApplicationContext context = new ClassPathXmlApplicationContext("hibernate-cfg.xml", "context.xml");

    private UserAccountService userService = (UserAccountService)context.getBean("userAccountService");

    @Test
    public void testUserAccountDao() {
        UserAccountEntity type = new UserAccountEntity();
        type.setUserId(1000L);
        type.setEmail("chaoyuan@ea.com");
        userService.save(type);

        UserAccountEntity type1 = userService.getById(1000L);
        Assert.assertNotNull(type1);
    }
}
