package ua.lviv.iot.shop.model;

public class Trainers extends AbstractFootwear {
	private String fastenerType;

	public Trainers(Season season, String countryOfManufacture, String brandName, double priceInUAH,
			Gender genderCategory, String material, String color, int size, int itemId, String footwearStyle,
			String soleMaterial, int soleHeightInMilimetres, String liningMaterial, String fastenerType) {
		super(season, countryOfManufacture, brandName, priceInUAH, genderCategory, material, color, size, itemId,
				footwearStyle, soleMaterial, soleHeightInMilimetres, liningMaterial);
		this.fastenerType = fastenerType;
	}

	public String getFastenerType() {
		return fastenerType;
	}

	public void setFastenerType(String fastenerType) {
		this.fastenerType = fastenerType;
	}
}
