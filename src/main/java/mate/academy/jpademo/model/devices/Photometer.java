package mate.academy.jpademo.model.devices;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Photometer extends Device {
    @Column
    private String scanner;
    @Column
    private int ultraVioletLevel;
    @Column
    private int infraRedLevel;

    public Photometer() {
    }

    public String getScanner() {
        return scanner;
    }

    public void setScanner(String scanner) {
        this.scanner = scanner;
    }

    public int getUltraVioletLevel() {
        return ultraVioletLevel;
    }

    public void setUltraVioletLevel(int ultraVioletLevel) {
        this.ultraVioletLevel = ultraVioletLevel;
    }

    public int getInfraRedLevel() {
        return infraRedLevel;
    }

    public void setInfraRedLevel(int unfraRedlevel) {
        this.infraRedLevel = unfraRedlevel;
    }

    @Override
    public String toString() {
        return "Photometer{" +
                "scanner='" + scanner + '\'' +
                ", ultraVioletLevel=" + ultraVioletLevel +
                ", infraRedLevel=" + infraRedLevel +
                '}';
    }
}
