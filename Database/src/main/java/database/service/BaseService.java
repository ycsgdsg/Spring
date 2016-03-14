package database.service;


/**
 * Created by yc on 2016/1/30.
 */


public interface BaseService<T> {

    public void save(T entity);

    public void update(T entity);

    public void delete(Long id);

    public T getById(Long id);

}
