package ua.lviv.iot.shop.model;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String adress;
    private String name;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "Sweater_Shop", joinColumns = {
            @JoinColumn(name = "shop_id", nullable = false) }, inverseJoinColumns = {
                    @JoinColumn(name = "sweater_id", nullable = false) })
    @JsonIgnoreProperties("shops")
    private Set<Sweater> sweaters;

    public Shop() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Sweater> getSweaters() {
        return sweaters;
    }

    public void setSweaters(Set<Sweater> sweaters) {
        this.sweaters = sweaters;
    }

}
