package mate.academy.jpademo.service;

import java.io.Serializable;
import java.util.List;

public interface Service<T, ID extends Serializable> {

    void save(T t);

    T find(ID id);

    List<T> getAll();

    void delete(T entity);

    T update(T t);
}
