package service;

import dao.BaseDao;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yc on 2016/1/30.
 */
@Transactional
public class BaseServiceImpl<T> implements BaseService<T> {

    /**
     * 注入BaseDao
     */
    @Resource
    private BaseDao<T> dao;


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

    public List<T> getByHQL(String hql, Object... params) {
        return dao.findByHQL(hql, params);
    }
}
