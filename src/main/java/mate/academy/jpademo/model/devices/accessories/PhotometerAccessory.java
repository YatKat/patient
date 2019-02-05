package mate.academy.jpademo.model.devices.accessories;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class PhotometerAccessory extends Accessory {
    @Column
    private String type;
    @Column
    private String mode;
    @Column
    private String monitorType;

    public PhotometerAccessory() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getMonitorType() {
        return monitorType;
    }

    public void setMonitorType(String monitorType){

    }

    @Override
    public String toString() {
        return "PhotometerAccessory{" +
                "model='" + type + '\'' +
                ", mode='" + mode + '\'' +
                ", monitorType='" + monitorType + '\'' +
                '}';
    }
}
