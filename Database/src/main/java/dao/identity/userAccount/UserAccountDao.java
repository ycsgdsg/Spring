package dao.identity.userAccount;

import dao.BaseDaoImpl;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import type.UserAccountEntity;

import javax.annotation.Resource;

/**
 * Created by yc on 2016/1/30.
 */
public class UserAccountDao extends BaseDaoImpl<UserAccountEntity>{
}
