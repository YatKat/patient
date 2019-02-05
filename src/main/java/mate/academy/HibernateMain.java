package mate.academy;

import mate.academy.jpademo.dao.AccessoryDao;
import mate.academy.jpademo.dao.impl.AccessoryDaoImpl;
import mate.academy.jpademo.dao.impl.DeviceDaoImpl;
import mate.academy.jpademo.dao.impl.PatientDaoImpl;
import mate.academy.jpademo.dao.impl.TestDaoImpl;
import mate.academy.jpademo.model.Patient;
import mate.academy.jpademo.model.SkinTest;
import mate.academy.jpademo.model.Test;
import mate.academy.jpademo.model.devices.Device;
import mate.academy.jpademo.dao.util.HibernateUtil;
import mate.academy.jpademo.model.devices.UltrasonicDevice;
import mate.academy.jpademo.model.devices.accessories.Accessory;
import mate.academy.jpademo.model.devices.accessories.UltrasonicAccessory;
import mate.academy.jpademo.service.ServiceDevice;
import mate.academy.jpademo.service.ServicePatient;
import mate.academy.jpademo.service.ServiceTest;
import mate.academy.jpademo.service.impl.ServiceDeviceImpl;
import mate.academy.jpademo.service.impl.ServicePatientImpl;
import mate.academy.jpademo.service.impl.ServiceTestImpl;
import org.hibernate.Session;

import java.util.Date;

public class HibernateMain {
    public static void main(String[] args) {
        System.out.println(doTest(createPatient(new Patient()), new SkinTest()));
        HibernateUtil.shutdown();
    }

    public static Patient createPatient(Patient patient){
        patient.setName("Vasia");
        patient.setAge(19);
        patient.setLastName("Pupkin");
        patient.setDateOfBirth(new Date(1996, 05, 02));
        ServicePatient servicePatient = new ServicePatientImpl
                (new PatientDaoImpl(HibernateUtil.getSessionFactory()));
        servicePatient.save(patient);
        return patient;
    }

    public static Patient doTest (Patient patient, Test test){
        ServiceTest serviceTest = new ServiceTestImpl
                (new TestDaoImpl(HibernateUtil.getSessionFactory()));
        Device device = createDevice(new UltrasonicDevice());
        test.setType("SkinTest");
        test.setPatient(patient);
        test.setDate(new Date());
        test.setResult("negative");
        test.addDevice(device);
        serviceTest.save(test);
        patient.addTest(test);
        ServicePatient servicePatient = new ServicePatientImpl
                (new PatientDaoImpl(HibernateUtil.getSessionFactory()));
        servicePatient.update(patient);
        return patient;
    }

    public static Device createDevice(Device device) {
        device.setName("Ultrsonic Turbo");
        device.setBrand("Samsung");
        device.setModel("Es-115");
        device.addAccessory(createAccessory(new UltrasonicAccessory()));
        ServiceDevice serviceDevice = new ServiceDeviceImpl
                (new DeviceDaoImpl(HibernateUtil.getSessionFactory()));
        serviceDevice.save(device);
        return device;
    }

    public static Accessory createAccessory(Accessory accessory){
        accessory.setName("SuperAccess");
        accessory.setModel(56);
        AccessoryDao accessoryDao = new AccessoryDaoImpl(HibernateUtil.getSessionFactory());
        accessoryDao.save(accessory);
        return  accessory;
    }

    public static Device getDevice(int id) {
        System.out.println("First level cache example");
        Session session = HibernateUtil.getSessionFactory().openSession();
        Device device = session.load(Device.class, id);
        System.out.println(device.getName());
        session.close();

        System.out.println("Second level cache example");
        Session session1 = HibernateUtil.getSessionFactory().openSession();
        Device device1 = session1.load(Device.class, id);
        System.out.println(device1.getName());
        session1.close();
        return device;
    }
}
