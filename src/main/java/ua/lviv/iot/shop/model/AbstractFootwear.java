package ua.lviv.iot.shop.model;

public abstract class AbstractFootwear extends AbstractGoodsForKids {
  private String footwearStyle;
  private String soleMaterial;
  private int soleHeightInMilimetres;
  private String liningMaterial;

  public AbstractFootwear(Season season, String countryOfManufacture, String brandName, double priceInUah,
      Gender genderCategory, String material, String color, int size, int itemId, String footwearStyle,
      String soleMaterial, int soleHeightInMilimetres, String liningMaterial) {
    super(season, countryOfManufacture, brandName, priceInUah, genderCategory, material, color, size, itemId);
    this.footwearStyle = footwearStyle;
    this.soleMaterial = soleMaterial;
    this.soleHeightInMilimetres = soleHeightInMilimetres;
    this.liningMaterial = liningMaterial;
  }

  public String getFootwearStyle() {
    return footwearStyle;
  }

  public void setFootwearStyle(String footwearStyle) {
    this.footwearStyle = footwearStyle;
  }

  public String getSoleMaterial() {
    return soleMaterial;
  }

  public void setSoleMaterial(String soleMaterial) {
    this.soleMaterial = soleMaterial;
  }

  public int getSoleHeightInMilimetres() {
    return soleHeightInMilimetres;
  }

  public void setSoleHeightInMilimetres(int soleHeightInMilimetres) {
    this.soleHeightInMilimetres = soleHeightInMilimetres;
  }

  public String getLiningMaterial() {
    return liningMaterial;
  }

  public void setLiningMaterial(String liningMaterial) {
    this.liningMaterial = liningMaterial;
  }

}
