package database.dao;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.lang.reflect.ParameterizedType;

/**
 * Created by yc on 2016/1/30.
 */
public class BaseDaoImpl<T> extends HibernateDaoSupport implements BaseDao<T> {

    private Class<T> clazz;

    public BaseDaoImpl() {
        ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
        clazz = (Class<T>) type.getActualTypeArguments()[0];
    }

    @Resource(name = "sessionFactory")
    private SessionFactory sessionFactory;

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