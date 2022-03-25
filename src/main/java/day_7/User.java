package day_7;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false, unique = true, length = 11)
    private int user_id;
    @Column(name = "first_name", length = 20, nullable = true)
    private String firstName;
    @Column(name = "last_name", length = 20, nullable = true)
    private String last_name;
    @Column(name = "mail", length = 20, nullable = true)
    private String mail;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="storage_id", referencedColumnName = "id")
    private CloudStorage cloudStorage;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public CloudStorage getCloudStorage() {
        return cloudStorage;
    }

    public void setCloudStorage(CloudStorage cloudStorage) {
        this.cloudStorage = cloudStorage;
    }
}
