package database.service.identity.userAccount;

import database.dao.BaseDao;
import database.service.BaseServiceImpl;
import database.type.UserAccountEntity;

import javax.annotation.Resource;

/**
 * Created by chaoyuan on 02/23/2016.
 */
public class UserAccountService extends BaseServiceImpl<UserAccountEntity> {

    @Resource(name = "userAccountDao")
    public void setDao(BaseDao<UserAccountEntity> dao) {
        super.setDao(dao);
    }
}
