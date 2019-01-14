package mate.academy.jpademo.service.impl;

import mate.academy.jpademo.dao.PatientDao;
import mate.academy.jpademo.model.Patient;
import mate.academy.jpademo.service.ServicePatient;
import java.util.List;

public class ServicePatientImpl implements ServicePatient {
    private final PatientDao patientDao;

    public ServicePatientImpl(PatientDao patientDao) {
        this.patientDao = patientDao;
    }

    @Override
    public void save(Patient patient) {
        patientDao.save(patient);
    }

    @Override
    public Patient find(Integer id) {
        return patientDao.findById(id);
    }

    @Override
    public List<Patient> getAll() {
        return patientDao.getAll();
    }

    @Override
    public void delete(Patient patient) {
        patientDao.delete(patient);
    }

    @Override
    public Patient update(Patient patient) {
        return patientDao.update(patient);
    }
}
