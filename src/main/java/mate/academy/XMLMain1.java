package mate.academy;

import mate.academy.jpademo.model.devices.Device;
import mate.academy.jpademo.dao.util.HibernateUtil;
import org.hibernate.Session;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class XMLMain1 {

    public static void main(String[] args) {
        //Integer id = createDevice();
        //Device device = getDevice(id);

//        System.out.println(device.toString());
//        writeDeviceToXmlFile(device, new File("device1.xml"));
    }

//    public static Integer createDevice(){
//        return HibernateMain.createDevice();
//    }

    public static Device getDevice (Integer id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        return  session.load(Device.class, id);
    }

    public static void writeDeviceToXmlFile(Device device, File file){
        JAXBContext jaxbContent = null;
        try {
            jaxbContent = JAXBContext.newInstance(Device.class);
            Marshaller marshaller = ((JAXBContext) jaxbContent).createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(device, file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        System.out.println(device);
    }

    public static Device readDeviceFromXML(File file){
        return null;
    }
}
