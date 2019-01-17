package mate.academy.jpademo.model;

import mate.academy.jpademo.model.devices.Device;
import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "tests")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer id;

    @Column
    private String type;

    @Column
    @Temporal(TemporalType.DATE)
    Date date;

    @Column
    private String result;

    @ManyToOne(fetch = FetchType.LAZY)
    private Patient patient;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "setOfTests")
    private Set<Device> deviceSet = new HashSet<>();

    public void addDevice(Device device) {
        deviceSet.add(device);
    }

    public Test() {
    }

    public Integer getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Set<Device> getDeviceSet() {
        return deviceSet;
    }

    public void setDeviceSet(Set<Device> deviceSet) {
        this.deviceSet = deviceSet;
    }

    @Override
    public String toString() {
        return "Test{" +
                "type='" + type + '\'' +
                ", date=" + date +
                ", result='" + result + '\'' +
                ", patient=" + patient +
                ", deviceSet=" + deviceSet +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test test = (Test) o;
        return id.equals(test.id) &&
                Objects.equals(type, test.type) &&
                Objects.equals(date, test.date) &&
                Objects.equals(result, test.result) &&
                Objects.equals(patient, test.patient) &&
                Objects.equals(deviceSet, test.deviceSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, date, result, patient);
    }
}


