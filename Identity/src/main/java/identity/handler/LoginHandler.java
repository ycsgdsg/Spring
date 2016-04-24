package identity.handler;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import database.service.identity.userAccount.UserAccountService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by chaoyuan on 03/11/2016.
 */
@Controller
public class LoginHandler {

    Logger logger = Logger.getLogger(LoginHandler.class);

    @Resource(name = "userAccountService")
    private UserAccountService userAccountService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    @ResponseBody
    public void createUser() {
        logger.info("user logged in");
        System.out.println("123");
    }

}
