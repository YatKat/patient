package mate.academy.jpademo.dao;

import mate.academy.jpademo.model.Patient;

import javax.persistence.criteria.CriteriaBuilder;

public interface PatientDao extends CRUDDao<Patient, Integer> {

}
