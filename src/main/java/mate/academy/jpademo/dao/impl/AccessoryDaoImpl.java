package mate.academy.jpademo.dao.impl;

import mate.academy.jpademo.dao.AbstractDao;
import mate.academy.jpademo.dao.AccessoryDao;
import mate.academy.jpademo.model.devices.accessories.Accessory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class AccessoryDaoImpl extends AbstractDao implements AccessoryDao {

    public AccessoryDaoImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Accessory save(Accessory entity) {
        Session session = sessionFactory.openSession();
        session.save(entity);
        session.close();
        return entity;
    }

    @Override
    public Accessory findById(Integer integer) {
        return null;
    }

    @Override
    public List<Accessory> getAll() {
        return null;
    }

    @Override
    public void delete(Accessory entity) {

    }

    @Override
    public Accessory update(Accessory entity) {
        return null;
    }
}
