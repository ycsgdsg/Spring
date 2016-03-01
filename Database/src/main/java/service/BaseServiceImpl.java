package service;

import dao.BaseDao;

/**
 * Created by yc on 2016/1/30.
 */
public class BaseServiceImpl<T> implements BaseService<T> {

    private BaseDao<T> dao;
    public void setDao(BaseDao<T> dao) {
        this.dao = dao;
    }

    public void save(T entity) {
        dao.save(entity);
    }

    public void update(T entity) {
        dao.update(entity);
    }

    public void delete(Long id) {
        dao.delete(id);
    }

    public T getById(Long id) {
        return dao.findById(id);
    }

}
