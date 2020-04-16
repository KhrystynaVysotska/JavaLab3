package ua.lviv.iot.shop.model;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Sweater extends AbstractClothes {
    private String knittingType;
    private double neckHeightInCentimetres;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer sweaterId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "manufacturer_id")
    @JsonIgnoreProperties("sweaters")
    private Manufacturer manufacturer;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "Sweater_Shop", joinColumns = {
            @JoinColumn(name = "sweater_id", nullable = false) }, inverseJoinColumns = {
                    @JoinColumn(name = "shop_id", nullable = false) })
    @JsonIgnoreProperties("sweaters")
    private Set<Shop> shops;

    public Sweater() {

    }

    public Sweater(Season season, String countryOfManufacture, String brandName, double priceInUah,
            Gender genderCategory, String material, String color, int size, int itemId, int ageGroupInYears,
            int heightInCentimetres, String clothesStyle, String printType, String knittingType,
            double neckHeightInCentimetres) {
        super(season, countryOfManufacture, brandName, priceInUah, genderCategory, material, color, size, itemId,
                ageGroupInYears, heightInCentimetres, clothesStyle, printType);
        this.knittingType = knittingType;
        this.neckHeightInCentimetres = neckHeightInCentimetres;
    }

    public Integer getSweaterId() {
        return sweaterId;
    }

    public void setSweaterId(Integer sweaterId) {
        this.sweaterId = sweaterId;
    }

    public String getKnittingType() {
        return knittingType;
    }

    public void setKnittingType(String knittingType) {
        this.knittingType = knittingType;
    }

    public double getNeckHeightInCentimetres() {
        return neckHeightInCentimetres;
    }

    public void setNeckHeightInCentimetres(double neckHeightInCentimetres) {
        this.neckHeightInCentimetres = neckHeightInCentimetres;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getHeaders() {
        return super.getHeaders() + "," + "knittingType, neckHeightInCentimetres \n";
    }

    public String toCSV() {
        return super.toCSV() + "," + knittingType + "," + neckHeightInCentimetres + "\n";
    }

    public Set<Shop> getShops() {
        return shops;
    }

    public void setShops(Set<Shop> shops) {
        this.shops = shops;
    }
}
