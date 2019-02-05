package mate.academy.jpademo.model.devices;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class UltrasonicDevice extends Device {
    @Column
    private String holder;
    @Column
    private String probeType;
    @Column
    private double frequency;

    public UltrasonicDevice() {
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public String getProbeType() {
        return probeType;
    }

    public void setProbeType(String probeType) {
        this.probeType = probeType;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "UltrasonicDevice{" +
                "holder='" + holder + '\'' +
                ", probeType='" + probeType + '\'' +
                ", frequency=" + frequency +
                '}';
    }
}
