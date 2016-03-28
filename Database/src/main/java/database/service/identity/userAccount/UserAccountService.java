package database.service.identity.userAccount;

import database.dao.BaseDao;
import database.service.BaseServiceImpl;
import database.type.UserAccountEntity;
import org.springframework.beans.factory.annotation.Required;

import javax.annotation.Resource;

/**
 * Created by chaoyuan on 02/23/2016.
 */
public class UserAccountService extends BaseServiceImpl<UserAccountEntity> {

    @Required
    public void setDao(BaseDao<UserAccountEntity> dao) {
        super.setDao(dao);
    }
}
