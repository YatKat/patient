package mate.academy.jpademo.model.devices.accessories;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
public class PhotometerAccessory extends Accessory {
    @Column
    private String type;

    public PhotometerAccessory() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
