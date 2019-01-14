package mate.academy.jpademo.dao.util;

import mate.academy.jpademo.model.Patient;
import mate.academy.jpademo.model.SkinTest;
import mate.academy.jpademo.model.Test;
import mate.academy.jpademo.model.devices.Device;
import mate.academy.jpademo.model.devices.UltrasonicDevice;
import mate.academy.jpademo.model.devices.accessories.Accessory;
import mate.academy.jpademo.model.devices.accessories.UltrasonicAccessory;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

        private static final SessionFactory sessionFactory = createSessionFactory();

        private HibernateUtil() {}

        private static SessionFactory createSessionFactory() {
            try {
                Configuration configuration = new Configuration().configure();
                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
                configuration.addAnnotatedClass(Device.class);
                configuration.addAnnotatedClass(Patient.class);
                configuration.addAnnotatedClass(Test.class);
                configuration.addAnnotatedClass(SkinTest.class);
                configuration.addAnnotatedClass(Accessory.class);
                configuration.addAnnotatedClass(UltrasonicAccessory.class);
                configuration.addAnnotatedClass(UltrasonicDevice.class);
                SessionFactory newSessionFactory = configuration.buildSessionFactory(serviceRegistry);
                return newSessionFactory;
            } catch (Exception ex) {
                System.err.println("Initial SessionFactory creation failed." + ex);
                throw new ExceptionInInitializerError(ex);
            }
        }

        public static SessionFactory getSessionFactory() {
            return sessionFactory;
        }

        public static void shutdown() {
            getSessionFactory().close();
        }
    }
