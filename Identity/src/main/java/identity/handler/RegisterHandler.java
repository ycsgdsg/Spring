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
public class RegisterHandler {

    private Logger logger = Logger.getLogger(RegisterHandler.class);

    @Resource(name = "userAccountService")
    private UserAccountService userAccountService;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    @ResponseBody
    public void createUser() {
        logger.info("user registered");
        System.out.println("456");
    }
}
