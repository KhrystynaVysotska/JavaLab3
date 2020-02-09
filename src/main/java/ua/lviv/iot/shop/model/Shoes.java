package ua.lviv.iot.shop.model;

public class Shoes extends AbstractFootwear {
	private String shoesType;
    private double ankleHeightInCentimetres;
	public Shoes(Season season, String countryOfManufacture, String brandName, double priceInUAH, Gender genderCategory,
			String material, String color, int size, int itemId, String footwearStyle, String soleMaterial,
			int soleHeightInMilimetres, String liningMaterial, String shoesType, double ankleHeightInCentimetres) {
		super(season, countryOfManufacture, brandName, priceInUAH, genderCategory, material, color, size, itemId,
				footwearStyle, soleMaterial, soleHeightInMilimetres, liningMaterial);
		this.shoesType = shoesType;
		this.ankleHeightInCentimetres = ankleHeightInCentimetres;
	}
	public String getShoesType() {
		return shoesType;
	}
	public void setShoesType(String shoesType) {
		this.shoesType = shoesType;
	}
	public double getAnkleHeightInCentimetres() {
		return ankleHeightInCentimetres;
	}
	public void setAnkleHeightInCentimetres(double ankleHeightInCentimetres) {
		this.ankleHeightInCentimetres = ankleHeightInCentimetres;
	}
}
