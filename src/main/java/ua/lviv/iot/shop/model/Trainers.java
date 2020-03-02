package ua.lviv.iot.shop.model;

public class Trainers extends AbstractFootwear {
    private String fastenerType;

    public Trainers(Season season, String countryOfManufacture, String brandName, double priceInUah,
            Gender genderCategory, String material, String color, int size, int itemId, String footwearStyle,
            String soleMaterial, int soleHeightInMilimetres, String liningMaterial, String fastenerType) {
        super(season, countryOfManufacture, brandName, priceInUah, genderCategory, material, color, size, itemId,
                footwearStyle, soleMaterial, soleHeightInMilimetres, liningMaterial);
        this.fastenerType = fastenerType;
    }

    public String getFastenerType() {
        return fastenerType;
    }

    public void setFastenerType(String fastenerType) {
        this.fastenerType = fastenerType;
    }

    public String getHeaders() {
        return super.getHeaders() + "," + "fastenerType \n";
    }

    public String toCSV() {
        return super.toCSV() + "," + fastenerType + "\n";
    }
}
