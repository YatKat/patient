package mate.academy.jpademo.dao;

import java.util.List;

public interface CRUDDao<T, ID> {

    T save(T entity);

    T findById(ID id);

    List<T> getAll();

    void delete(T entity);

    T update(T entity);
}
