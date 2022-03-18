package day_6;

import org.hibernate.Session;

import java.util.Date;

public class HibernateMain {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        Country country = new Country();
        country.setName("Ukraine");
        country.setLanguage("Ukrainian");
        country.setPopulation(46000000);
        country.setInsertionTime(new Date());

        Country country2 = new Country();
        country2.setName("France");
        country2.setLanguage("French");
        country2.setPopulation(5);
        country2.setInsertionTime(new Date());

        // Create
        session.beginTransaction();
        session.save(country);
        session.save(country2);
        session.getTransaction().commit();
        session.close();

        // Read
        session.beginTransaction();
        System.out.println(session.find(Country.class, 1).toString());
        session.getTransaction().commit();
        session.close();

        // Update
        session.beginTransaction();
        Country france = session.find(Country.class, 3);
        france.setPopulation(400000000);
        session.update(france);
        session.getTransaction().commit();
        session.close();

        // Delete
        session.beginTransaction();
        Country france2 = session.find(Country.class, 3);
        session.delete(france2);
        session.getTransaction().commit();
        session.close();
    }
}
