package mate.academy.jpademo.model;

import javax.persistence.*;

@Entity
@Table(name = "bloodTest")
public class BloodTest extends Test {
    @Column
    private Integer leikozyty;

    @Column
    private Double glukose;

    public BloodTest() {
    }

    public Integer getLeikozyty() {
        return leikozyty;
    }

    public void setLeikozyty(Integer leikozyty) {
        this.leikozyty = leikozyty;
    }

    public Double getGlukose() {
        return glukose;
    }

    public void setGlukose(Double glukose) {
        this.glukose = glukose;
    }

    @Override
    public String toString() {
        return "BloodTest{" +
                "leikozyty=" + leikozyty +
                ", glukose=" + glukose +
                ", date=" + date +
                '}';
    }
}
