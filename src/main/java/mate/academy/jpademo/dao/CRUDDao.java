package mate.academy.jpademo.dao;

import java.io.Serializable;
import java.util.List;

public interface CRUDDao<T, ID extends Serializable> {

    T save(T entity);

    T findById(ID id);

    List<T> getAll();

    void delete(T entity);

    T update(T entity);
}
