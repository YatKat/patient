package mate.academy.jpademo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "superPatient")
public class SuperPatient extends Patient {
    @Column(name = "power")
    private String power;
    @Column(name = "drugs")
    private String drugs;

    public SuperPatient(int age, String name, String lastName, Date dateOfBirth, String power, String drugs) {
        super(age, name, lastName, dateOfBirth);
        this.power = power;
        this.drugs = drugs;
    }

    public SuperPatient() {
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getDrugs() {
        return drugs;
    }

    public void setDrugs(String drugs) {
        this.drugs = drugs;
    }

    @Override
    public String toString() {
        return "SuperPatient{" +
                "power='" + power + '\'' +
                ", drugs='" + drugs + '\'' +
                '}';
    }
}
