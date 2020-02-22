package ua.lviv.iot.shop.model;

public class Trousers extends AbstractClothes {
  private double waistHeightInCentimetres;
  private String tailoringType;

  public Trousers(Season season, String countryOfManufacture, String brandName, double priceInUah,
      Gender genderCategory, String material, String color, int size, int itemId, int ageGroupInYears,
      int heightInCentimetres, String clothesStyle, String printType, double waistHeightInCentimetres,
      String tailoringType) {
    super(season, countryOfManufacture, brandName, priceInUah, genderCategory, material, color, size, itemId,
        ageGroupInYears, heightInCentimetres, clothesStyle, printType);
    this.waistHeightInCentimetres = waistHeightInCentimetres;
    this.tailoringType = tailoringType;
  }

  public double getWaistHeightInCentimetres() {
    return waistHeightInCentimetres;
  }

  public void setWaistHeightInCentimetres(double waistHeightInCentimetres) {
    this.waistHeightInCentimetres = waistHeightInCentimetres;
  }

  public String getTailoringType() {
    return tailoringType;
  }

  public void setTailoringType(String tailoringType) {
    this.tailoringType = tailoringType;
  }
}
