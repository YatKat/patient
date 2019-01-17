package mate.academy.jpademo.model.devices;

import mate.academy.jpademo.model.Test;
import mate.academy.jpademo.model.devices.accessories.Accessory;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "devices")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "device_id")
    private Integer id;
    @Column
    private String name;
    @Column
    private String model;
    @Column
    private String brand;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "deviceSet")
    private Set<Accessory> accessorySet = new HashSet<>();

    @ManyToMany(fetch = FetchType.LAZY)
    private Set<Test> setOfTests = new HashSet<>();

    public void addTest(Test test) {
        setOfTests.add(test);
    }

    public void addAccessory(Accessory accessory) {
        accessorySet.add(accessory);
    }

    public Device() {
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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Device{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", accessorySet=" + accessorySet +
                ", setOfTests=" + setOfTests +
                '}';
    }
}
//data transfer object DTO, наприклад DeviceDTO
