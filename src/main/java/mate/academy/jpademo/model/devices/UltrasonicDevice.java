package mate.academy.jpademo.model.devices;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class UltrasonicDevice extends Device {
    @Column
    private String holder;

    public UltrasonicDevice() {
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    @Override
    public String toString() {
        return "UltrasonicDevice{" +
                "holder='" + holder + '\'' +
                '}';
    }
}
