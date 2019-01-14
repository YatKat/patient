package mate.academy.jpademo.dao.impl;

import mate.academy.jpademo.dao.AbstractDao;
import mate.academy.jpademo.dao.PatientDao;
import mate.academy.jpademo.model.Patient;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import java.util.List;

public class PatientDaoImpl extends AbstractDao implements PatientDao {

    public PatientDaoImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Patient save(Patient entity) {
        Session session = sessionFactory.openSession();
        session.save(entity);
        session.close();
        return entity;
    }

    @Override
    public Patient findById(Integer integer) {
        Session session = sessionFactory.openSession();
        Patient patient = session.find(Patient.class, integer);//can be used load method
        session.close();
        return patient;
    }

    @Override
    public List<Patient> getAll() {
        Session session = sessionFactory.openSession();
        List<Patient> list = session.createNamedQuery("from" +
                Patient.class.getName(), Patient.class).getResultList();
        session.close();
        return list;
    }

    @Override
    public void delete(Patient entity) {
        Session session = sessionFactory.openSession();
        session.delete(entity);
        session.close();
    }

    @Override
    public Patient update(Patient entity) {
        Session session = sessionFactory.openSession();
        session.update(entity);
        session.close();
        return entity;
    }
}
