package ua.lviv.iot.shop.model;

public abstract class AbstractAccessories extends AbstractGoodsForKids {
    private String accessoriesType;
    private String printType;

    public AbstractAccessories(Season season, String countryOfManufacture, String brandName, double priceInUah,
            Gender genderCategory, String material, String color, int size, int itemId, String accessoriesType,
            String printType) {
        super(season, countryOfManufacture, brandName, priceInUah, genderCategory, material, color, size, itemId);
        this.accessoriesType = accessoriesType;
        this.printType = printType;
    }

    public String getAccessoriesType() {
        return accessoriesType;
    }

    public void setAccessoriesType(String accessoriesType) {
        this.accessoriesType = accessoriesType;
    }

    public String getPrintType() {
        return printType;
    }

    public void setPrintType(String printType) {
        this.printType = printType;
    }

    public String getHeaders() {
        return super.getHeaders() + "," + "accessoriesType, printType";
    }

    public String toCSV() {
        return super.toCSV() + "," + accessoriesType + "," + printType;
    }
}
