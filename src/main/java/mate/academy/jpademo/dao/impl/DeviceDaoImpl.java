package mate.academy.jpademo.dao.impl;

import mate.academy.jpademo.dao.AbstractDao;
import mate.academy.jpademo.dao.DeviceDao;
import mate.academy.jpademo.model.devices.Device;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class DeviceDaoImpl extends AbstractDao implements DeviceDao {

    public DeviceDaoImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Device save(Device device) {
        Session session = sessionFactory.openSession();
        session.merge(device);
        session.close();
        return device;
    }

    @Override
    public Device findById(Integer id) {
        Session session = sessionFactory.openSession();
        Device device = session.load(Device.class, id);
        session.close();
        return device;
    }

    @Override
    public List<Device> getAll() {
        Session session = sessionFactory.openSession();
        List<Device> list = session.createNamedQuery("from" +
                Device.class.getName(), Device.class).getResultList();
        session.close();
        return list;
    }

    @Override
    public void delete(Device device) {
        Session session = sessionFactory.openSession();
        session.delete(device);
        session.close();
    }

    @Override
    public Device update(Device device) {
        Session session = sessionFactory.openSession();
        session.update(device);
        session.close();
        return device;
    }
}
