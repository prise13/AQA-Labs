package day_7;


import org.hibernate.Session;

import java.util.HashSet;
import java.util.Set;

public class RelatedMain {
    public static void main(String[] args) {
        Session session = RelatedUtil.getSessionFactory().openSession();


        // OneToOne
        User user = new User();
        user.setFirstName("Sasha");
        user.setLast_name("Shlyapik");
        user.setMail("shlyapiksupermegacool2018");
        CloudStorage cloudStorage = new CloudStorage();
        cloudStorage.setCapacity(20000);
        cloudStorage.setUser(user);
        user.setCloudStorage(cloudStorage);
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        session.close();

        // OneToMany
        Cart cart = new Cart();
        Set<Item> items = new HashSet<Item>();
        Item item1 = new Item();
        Item item2 = new Item();
        item1.setCart(cart);
        item1.setItemName("Apple");
        item2.setCart(cart);
        item2.setItemName("Banana");
        items.add(item1);
        items.add(item2);
        cart.setItems(items);
        session.beginTransaction();
        session.save(cart);
        session.save(item1);
        session.save(item2);
        session.getTransaction().commit();
        session.close();
    }
}
