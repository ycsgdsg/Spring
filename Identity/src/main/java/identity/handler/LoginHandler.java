package identity.handler;

import org.springframework.stereotype.Controller;
import database.service.identity.userAccount.UserAccountService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * Created by chaoyuan on 03/11/2016.
 */
@Controller
public class LoginHandler {

    @Resource(name = "userAccountService")
    private UserAccountService userAccountService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public void createUser() {
        System.out.println("123");
    }

}
