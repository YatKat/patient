package mate.academy.jpademo.model.devices.accessories;

import mate.academy.jpademo.model.devices.Device;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "accessory")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Accessory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "accessory_id")
    private Integer id;
    @Column
    private String name;
    @Column
    private int model;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Device> deviceSet = new HashSet<>();

    public void addDevice(Device device) {
        deviceSet.add(device);
    }

    public Accessory() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Accessory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", model=" + model +
                ", deviceSet=" + deviceSet +
                '}';
    }
}
