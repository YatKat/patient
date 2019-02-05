package mate.academy.jpademo.dao.impl;

import mate.academy.jpademo.dao.AbstractDao;
import mate.academy.jpademo.dao.TestDao;
import mate.academy.jpademo.model.Test;
import org.hibernate.SessionFactory;

import java.util.List;

public class TestDaoImpl extends AbstractDao implements TestDao {

    public TestDaoImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }


    @Override
    public Test save(Test entity) {
        return null;
    }

    @Override
    public Test findById(Integer integer) {
        return null;
    }

    @Override
    public List<Test> getAll() {
        return null;
    }

    @Override
    public void delete(Test entity) {

    }

    @Override
    public Test update(Test entity) {
        return null;
    }
}
