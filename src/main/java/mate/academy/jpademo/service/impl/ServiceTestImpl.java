package mate.academy.jpademo.service.impl;

import mate.academy.jpademo.dao.TestDao;
import mate.academy.jpademo.model.Test;
import mate.academy.jpademo.service.ServiceTest;

import java.util.List;

public class ServiceTestImpl implements ServiceTest {
    private final TestDao testDao;

    public ServiceTestImpl(TestDao testDao) {
        this.testDao = testDao;
    }

    @Override
    public void save(Test test) {
        testDao.save(test);
    }

    @Override
    public Test find(Integer id) {
        return testDao.findById(id);
    }

    @Override
    public List<Test> getAll() {
        return testDao.getAll();
    }

    @Override
    public void delete(Test test) {
        testDao.delete(test);
    }

    @Override
    public Test update(Test test) {
        return testDao.update(test);
    }
}
