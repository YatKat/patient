package mate.academy;

import mate.academy.jpademo.model.Patient;
import mate.academy.jpademo.model.SuperPatient;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.Date;
import java.util.List;

public class Main {
    private static EntityManager em;

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PatientPU");
        em = emf.createEntityManager();

        Patient createdPatient = createPatient(25, "Bob", "UserLastName");
        SuperPatient createdPatient0 = createPatient(45, "SuperBob", "UserLastName",
                "strong", "analgin");
        Patient createdPatient1 = createPatient(20, "Rob", "LastName");
        Patient createdPatient2 = createPatient(18, "Mob", "LastLastName");
        Patient updatedPatient2 = createPatient(18, "Mob", "NewLastName");
        System.out.println(getPatient(1));
        //deletePatient(1);
        System.out.println(getAll());

    }

    private static Patient createPatient (int age, String firstName, String lastName){
        Date dateOfBirth = new Date();
        em.getTransaction().begin();
        Patient pat = new Patient(age, firstName, lastName, dateOfBirth);
        em.persist(pat);
        em.flush();
        em.getTransaction().commit();
        return pat;
    }

    private static SuperPatient createPatient (int age, String firstName, String lastName,
                                               String power, String drugs){
        Date dateOfBirth = new Date();
        em.getTransaction().begin();
        SuperPatient patient = new SuperPatient(age, firstName, lastName, dateOfBirth, power, drugs);
        em.persist(patient);
        em.flush();
        em.getTransaction().commit();
        return patient;
    }

    private static Patient updatePatient (int age, String name, String lastName){
        Date dateOfBirth = new Date();
        em.getTransaction().begin();
        Patient pat = new Patient(age, name, lastName, dateOfBirth);
        em.merge(pat);
        em.getTransaction().commit();
        return pat;
    }

    private static Patient getPatient(long id){
        return em.find(Patient.class, id);
    }

    private static void deletePatient(long id){
        em.getTransaction().begin();
        em.remove(getPatient(id));
        em.getTransaction().commit();
    }

    private static List<Patient> getAll(){
        TypedQuery<Patient> namedQuery = em.createNamedQuery("Patient.getAll", Patient.class);
        return namedQuery.getResultList();
    }
}
