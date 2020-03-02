package ua.lviv.iot.shop.model;

public abstract class AbstractOuterwear extends AbstractClothes {
    private String fastenerType;
    private int numberOfPockets;
    private String liningMaterial;

    public AbstractOuterwear(Season season, String countryOfManufacture, String brandName, double priceInUah,
            Gender genderCategory, String material, String color, int size, int itemId, int ageGroupInYears,
            int heightInCentimetres, String clothesStyle, String printType, String fastenerType, int numberOfPockets,
            String liningMaterial) {
        super(season, countryOfManufacture, brandName, priceInUah, genderCategory, material, color, size, itemId,
                ageGroupInYears, heightInCentimetres, clothesStyle, printType);
        this.fastenerType = fastenerType;
        this.numberOfPockets = numberOfPockets;
        this.liningMaterial = liningMaterial;
    }

    public String getFastenerType() {
        return fastenerType;
    }

    public void setFastenerType(String fastenerType) {
        this.fastenerType = fastenerType;
    }

    public int getNumberOfPockets() {
        return numberOfPockets;
    }

    public void setNumberOfPockets(int numberOfPockets) {
        this.numberOfPockets = numberOfPockets;
    }

    public String getLiningMaterial() {
        return liningMaterial;
    }

    public void setLiningMaterial(String liningMaterial) {
        this.liningMaterial = liningMaterial;
    }

    public String getHeaders() {
        return super.getHeaders() + "," + "fastenerType, numberOfPockets, liningMaterial";
    }

    public String toCSV() {
        return super.toCSV() + "," + fastenerType + "," + numberOfPockets + "," + liningMaterial;
    }
}
