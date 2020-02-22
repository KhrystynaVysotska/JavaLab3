package ua.lviv.iot.shop.model;

public class Hat extends AbstractAccessories {
  private int headCircumferenceInCentimetres;
  private String hatType;

  public Hat(Season season, String countryOfManufacture, String brandName, double priceInUah, Gender genderCategory,
      String material, String color, int size, int itemId, String accessoriesType, String printType,
      int headCircumferenceInCentimetres, String hatType) {
    super(season, countryOfManufacture, brandName, priceInUah, genderCategory, material, color, size, itemId,
        accessoriesType, printType);
    this.headCircumferenceInCentimetres = headCircumferenceInCentimetres;
    this.hatType = hatType;
  }

  public int getHeadCircumferenceInCentimetres() {
    return headCircumferenceInCentimetres;
  }

  public void setHeadCircumferenceInCentimetres(int headCircumferenceInCentimetres) {
    this.headCircumferenceInCentimetres = headCircumferenceInCentimetres;
  }

  public String getHatType() {
    return hatType;
  }

  public void setHatType(String hatType) {
    this.hatType = hatType;
  }
}
