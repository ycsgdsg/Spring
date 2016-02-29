package dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by yc on 2016/1/30.
 */
public class BaseDaoImpl<T> implements BaseDao<T> {

    private Class<T> clazz;

    /**
     * 通过构造方法指定DAO的具体实现类
     */
    public BaseDaoImpl() {
        ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
        clazz = (Class<T>) type.getActualTypeArguments()[0];
    }

    /**
     * 向DAO层注入SessionFactory
     */
    @Resource(name = "sessionFactory")
    private SessionFactory sessionFactory;

    protected Session getSession() {
        return this.sessionFactory.openSession();
    }

    public void save(T entity) {
        this.getSession().save(entity);
    }

    public void update(T entity) {
        this.getSession().update(entity);
    }

    public void delete(Long id) {
        this.getSession().delete(this.findById(id));
    }

    public T findById(Long id) {
        return (T) this.getSession().get(this.clazz, id);
    }

}