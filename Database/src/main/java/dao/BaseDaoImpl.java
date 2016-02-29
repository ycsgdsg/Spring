package dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by yc on 2016/1/30.
 */
public class BaseDaoImpl<T> extends HibernateDaoSupport implements BaseDao<T> {

    private Class<T> clazz;

    public BaseDaoImpl() {
        ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
        clazz = (Class<T>) type.getActualTypeArguments()[0];
    }

//    private Session session;
//    protected Session getSession() {
//        if (session == null) {
//            session = sessionFactory.openSession();
//        }
//        return session;
//        return sessionFactory.openSession();
//    }

    @Transactional(readOnly = false)
    public void save(T entity) {
        this.getHibernateTemplate().save(entity);
    }

    @Transactional(readOnly = false)
    public void update(T entity) {
        this.getHibernateTemplate().update(entity);
    }

    @Transactional(readOnly = false)
    public void delete(Long id) {
        this.getHibernateTemplate().delete(this.findById(id));
    }

    @Transactional(readOnly = true)
    public T findById(Long id) {
        return (T) this.getHibernateTemplate().get(this.clazz, id);
    }

}