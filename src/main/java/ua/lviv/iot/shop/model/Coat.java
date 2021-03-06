package ua.lviv.iot.shop.model;

public class Coat extends AbstractOuterwear {
    private int lengthInCentimetres;

    public Coat(Season season, String countryOfManufacture, String brandName, double priceInUah, Gender genderCategory,
            String material, String color, int size, int itemId, int ageGroupInYears, int heightInCentimetres,
            String clothesStyle, String printType, String fastenerType, int numberOfPockets, String liningMaterial,
            int lengthInCentimetres) {
        super(season, countryOfManufacture, brandName, priceInUah, genderCategory, material, color, size, itemId,
                ageGroupInYears, heightInCentimetres, clothesStyle, printType, fastenerType, numberOfPockets,
                liningMaterial);
        this.lengthInCentimetres = lengthInCentimetres;
    }

    public int getLengthInCentimetres() {
        return lengthInCentimetres;
    }

    public void setLengthInCentimetres(int lengthInCentimetres) {
        this.lengthInCentimetres = lengthInCentimetres;
    }

    public String getHeaders() {
        return super.getHeaders() + "," + "lengthInCentimetres \n";
    }

    public String toCSV() {
        return super.toCSV() + "," + lengthInCentimetres + "\n";
    }
}
