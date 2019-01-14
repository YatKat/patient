package mate.academy.jpademo.model.devices.accessories;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class UltrasonicAccessory extends Accessory {
    @Column
    private String holderType;

    public UltrasonicAccessory() {
    }

    public String getHolderType() {
        return holderType;
    }

    public void setHolderType(String holderType) {
        this.holderType = holderType;
    }
}
