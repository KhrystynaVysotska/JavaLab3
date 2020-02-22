package ua.lviv.iot.shop.model;

public class Jacket extends AbstractOuterwear {
  private String fillerType;

  public Jacket(Season season, String countryOfManufacture, String brandName, double priceInUah, Gender genderCategory,
      String material, String color, int size, int itemId, int ageGroupInYears, int heightInCentimetres,
      String clothesStyle, String printType, String fastenerType, int numberOfPockets, String liningMaterial,
      String fillerType) {
    super(season, countryOfManufacture, brandName, priceInUah, genderCategory, material, color, size, itemId,
        ageGroupInYears, heightInCentimetres, clothesStyle, printType, fastenerType, numberOfPockets, liningMaterial);
    this.fillerType = fillerType;
  }

  public String getFillerType() {
    return fillerType;
  }

  public void setFillerType(String fillerType) {
    this.fillerType = fillerType;
  }
}
