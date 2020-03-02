package ua.lviv.iot.shop.model;

public class Scarf extends AbstractAccessories {
    private double widthInCentimetres;
    private double lengthInCentimetres;

    public Scarf(Season season, String countryOfManufacture, String brandName, double priceInUah, Gender genderCategory,
            String material, String color, int size, int itemId, String accessoriesType, String printType,
            double widthInCentimetres, double lengthInCentimetres) {
        super(season, countryOfManufacture, brandName, priceInUah, genderCategory, material, color, size, itemId,
                accessoriesType, printType);
        this.widthInCentimetres = widthInCentimetres;
        this.lengthInCentimetres = lengthInCentimetres;
    }

    public double getWidthInCentimetres() {
        return widthInCentimetres;
    }

    public void setWidthInCentimetres(double widthInCentimetres) {
        this.widthInCentimetres = widthInCentimetres;
    }

    public double getLengthInCentimetres() {
        return lengthInCentimetres;
    }

    public void setLengthInCentimetres(double lengthInCentimetres) {
        this.lengthInCentimetres = lengthInCentimetres;
    }

    public String getHeaders() {
        return super.getHeaders() + "," + "widthInCentimetres, lengthInCentimetres \n";
    }

    public String toCSV() {
        return super.toCSV() + "," + widthInCentimetres + "," + lengthInCentimetres + "\n";
    }
}
