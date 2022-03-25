package day_7;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class RelatedUtil {
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if(sessionFactory==null) {
            sessionFactory=initSessionFactory();
        }
        return sessionFactory;
    }

    private static SessionFactory initSessionFactory() {
        Configuration configuration = new Configuration();
        try {
            Properties props = new Properties();
            props.load(new FileInputStream("src/main/resources/config.properties"));
            configuration.setProperties(props);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        // Adding classes to Hibernate
        configuration.addAnnotatedClass(User.class);
        configuration.addAnnotatedClass(CloudStorage.class);
        configuration.addAnnotatedClass(Cart.class);
        configuration.addAnnotatedClass(Item.class);

        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        return configuration.buildSessionFactory(serviceRegistry);
    }
}
