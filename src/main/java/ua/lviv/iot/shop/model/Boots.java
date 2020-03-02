package ua.lviv.iot.shop.model;

public class Boots extends AbstractFootwear {
    private String insulationMaterial;

    public Boots(Season season, String countryOfManufacture, String brandName, double priceInUah, Gender genderCategory,
            String material, String color, int size, int itemId, String footwearStyle, String soleMaterial,
            int soleHeightInMilimetres, String liningMaterial, String insulationMaterial) {
        super(season, countryOfManufacture, brandName, priceInUah, genderCategory, material, color, size, itemId,
                footwearStyle, soleMaterial, soleHeightInMilimetres, liningMaterial);
        this.insulationMaterial = insulationMaterial;
    }

    public String getInsulationMaterial() {
        return insulationMaterial;
    }

    public void setInsulationMaterial(String insulationMaterial) {
        this.insulationMaterial = insulationMaterial;
    }

    public String getHeaders() {
        return super.getHeaders() + "," + "insulationMaterial \n";
    }

    public String toCSV() {
        return super.toCSV() + "," + insulationMaterial + "\n";
    }
}
