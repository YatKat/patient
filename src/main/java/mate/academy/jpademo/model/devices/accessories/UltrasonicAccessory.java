package mate.academy.jpademo.model.devices.accessories;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class UltrasonicAccessory extends Accessory {
    @Column
    private String holderType;
    @Column
    private String probeType;
    @Column
    private String classOfMonitor;

    public UltrasonicAccessory() {
    }

    public String getHolderType() {
        return holderType;
    }

    public void setHolderType(String holderType) {
        this.holderType = holderType;
    }

    public String getProbeType() {
        return probeType;
    }

    public void setProbeType(String probeType) {
        this.probeType = probeType;
    }

    public String getClassOfMonitor() {
        return classOfMonitor;
    }

    public void setClassOfMonitor(String classOfMonitor) {
        this.classOfMonitor = classOfMonitor;
    }

    @Override
    public String toString() {
        return "UltrasonicAccessory{" +
                "holderType='" + holderType + '\'' +
                ", probeType='" + probeType + '\'' +
                ", classOfMonitor='" + classOfMonitor + '\'' +
                '}';
    }
}
