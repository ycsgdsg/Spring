package dao;

import org.springframework.stereotype.Repository;
import database.service.BaseService;
import database.type.UserAccountEntity;

import javax.annotation.Resource;

/**
 * Created by chaoyuan on 02/29/2016.
 */
@Repository
public class TestHelper {

    private BaseService<UserAccountEntity> userService;

    public BaseService<UserAccountEntity> getUserService() {
        return userService;
    }

    @Resource(name = "userAccountService")
    void setUserService(BaseService<UserAccountEntity> userService) {
        this.userService = userService;
    }
}
