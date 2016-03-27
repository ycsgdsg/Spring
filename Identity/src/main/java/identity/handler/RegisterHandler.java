package identity.handler;

import org.springframework.web.HttpRequestHandler;
import database.service.identity.userAccount.UserAccountService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by chaoyuan on 03/11/2016.
 */
public class RegisterHandler implements HttpRequestHandler {private UserAccountService userAccountService;

    public void setUserAccountService(UserAccountService userAccountService) {
        this.userAccountService = userAccountService;
    }

    public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
