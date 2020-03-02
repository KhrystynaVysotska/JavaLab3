package ua.lviv.iot.shop.model;

public class Gloves extends AbstractAccessories {
    private int fingersNumber;

    public Gloves(Season season, String countryOfManufacture, String brandName, double priceInUah,
            Gender genderCategory, String material, String color, int size, int itemId, String accessoriesType,
            String printType, int fingersNumber) {
        super(season, countryOfManufacture, brandName, priceInUah, genderCategory, material, color, size, itemId,
                accessoriesType, printType);
        this.fingersNumber = fingersNumber;
    }

    public int getFingersNumber() {
        return fingersNumber;
    }

    public void setFingersNumber(int fingersNumber) {
        this.fingersNumber = fingersNumber;
    }

    public String getHeaders() {
        return super.getHeaders() + "," + "fingersNumber \n";
    }

    public String toCSV() {
        return super.toCSV() + "," + fingersNumber + "\n";
    }
}
