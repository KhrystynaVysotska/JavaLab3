package ua.lviv.iot.shop.model;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractClothes extends AbstractGoodsForKids {
    private int ageGroupInYears;
    private int heightInCentimetres;
    private String clothesStyle;
    private String printType;

    public AbstractClothes() {
        
    }
    
    public AbstractClothes(Season season, String countryOfManufacture, String brandName, double priceInUah,
            Gender genderCategory, String material, String color, int size, int itemId, int ageGroupInYears,
            int heightInCentimetres, String clothesStyle, String printType) {
        super(season, countryOfManufacture, brandName, priceInUah, genderCategory, material, color, size, itemId);
        this.ageGroupInYears = ageGroupInYears;
        this.heightInCentimetres = heightInCentimetres;
        this.clothesStyle = clothesStyle;
        this.printType = printType;
    }

    public int getAgeGroupInYears() {
        return ageGroupInYears;
    }

    public void setAgeGroupInYears(int ageGroupInYears) {
        this.ageGroupInYears = ageGroupInYears;
    }

    public int getHeightInCentimetres() {
        return heightInCentimetres;
    }

    public void setHeightInCentimetres(int heightInCentimetres) {
        this.heightInCentimetres = heightInCentimetres;
    }

    public String getClothesStyle() {
        return clothesStyle;
    }

    public void setClothesStyle(String clothesStyle) {
        this.clothesStyle = clothesStyle;
    }

    public String getPrintType() {
        return printType;
    }

    public void setPrintType(String printType) {
        this.printType = printType;
    }

    public String getHeaders() {
        return super.getHeaders() + "," + "ageGroupInYears, heightInCentimetres, clothesStyle, printType";
    }

    public String toCSV() {
        return super.toCSV() + "," + ageGroupInYears + "," + heightInCentimetres + "," + clothesStyle + "," + printType;
    }
}
