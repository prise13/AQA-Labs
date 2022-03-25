package day_7;

import javax.persistence.*;

@Entity
@Table(name = "storages")
public class CloudStorage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",nullable = false, unique = true, length = 11)
    private int id;

    @Column(name="storage_capacity")
    private int capacity;

    @OneToOne(mappedBy = "cloudStorage")
    private User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
