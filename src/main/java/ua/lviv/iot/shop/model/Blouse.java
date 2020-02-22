package ua.lviv.iot.shop.model;

public class Blouse extends AbstractClothes {
  private String necklineType;
  private double sleeveLengthInCentimetres;

  public Blouse(Season season, String countryOfManufacture, String brandName, double priceInUah, Gender genderCategory,
      String material, String color, int size, int itemId, int ageGroupInYears, int heightInCentimetres,
      String clothesStyle, String printType, String necklineType, double sleeveLengthInCentimetres) {
    super(season, countryOfManufacture, brandName, priceInUah, genderCategory, material, color, size, itemId,
        ageGroupInYears, heightInCentimetres, clothesStyle, printType);
    this.necklineType = necklineType;
    this.sleeveLengthInCentimetres = sleeveLengthInCentimetres;
  }

  public String getNecklineType() {
    return necklineType;
  }

  public void setNecklineType(String necklineType) {
    this.necklineType = necklineType;
  }

  public double getSleeveLengthInCentimetres() {
    return sleeveLengthInCentimetres;
  }

  public void setSleeveLengthInCentimetres(double sleeveLengthInCentimetres) {
    this.sleeveLengthInCentimetres = sleeveLengthInCentimetres;
  }
}
