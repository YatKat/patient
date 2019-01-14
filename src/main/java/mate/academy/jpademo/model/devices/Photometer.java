package mate.academy.jpademo.model.devices;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
public class Photometer extends Device {
    @Column
    private String scanner;

    public Photometer() {
    }

    public String getScanner() {
        return scanner;
    }

    public void setScanner(String scanner) {
        this.scanner = scanner;
    }

    @Override
    public String toString() {
        return "Photometer{" +
                "scanner='" + scanner + '\'' +
                '}';
    }
}
