package service.identity.userAccount;

import dao.BaseDao;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import service.BaseServiceImpl;
import type.UserAccountEntity;

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
