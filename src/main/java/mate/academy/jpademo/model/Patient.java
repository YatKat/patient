package mate.academy.jpademo.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "patient")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@NamedQuery(name = "Patient.getAll", query = "SELECT c from Patient c")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "age")
    private int age;

    @Column(name = "name", length = 250)
    private String name;

    @Column(name = "lastName", length = 250)
    private String lastName;

    @Column(name = "dateOfBirth")
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "patient")
    Set<Test> tests = new HashSet<>();

    public Patient(int age, String name, String lastName, Date dateOfBirth) {
        this.age = age;
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public Patient() {
    }

    public void addTest(Test test) {
        tests.add(test);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", tests=" + tests +
                '}';
    }
}
