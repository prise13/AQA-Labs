package day_6;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="countries")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="country_id", nullable = false, unique = true, length = 11)
    private int country_id;
    @Column(name = "name", length = 20, nullable = true)
    private String name;
    @Column(name = "population", length = 20, nullable = true)
    private int population;
    @Column(name = "language", length = 20, nullable = true)
    private String language;
    @Column(name = "insertion_time", nullable = true)
    private Date insertionTime;

    public int getCountry_id() {
        return country_id;
    }

    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Date getInsertionTime() {
        return insertionTime;
    }

    public void setInsertionTime(Date insertionTime) {
        this.insertionTime = insertionTime;
    }

    @Override
    public String toString() {
        return   "name: " + this.name + " population: " + this.population + " language: " + this.language + " insertion time: " + this.insertionTime + "\n";
    }
}
