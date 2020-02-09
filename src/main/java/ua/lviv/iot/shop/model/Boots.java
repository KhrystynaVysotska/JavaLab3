package ua.lviv.iot.shop.model;

public class Boots extends AbstractFootwear {
	private String insulationMaterial;

	public Boots(Season season, String countryOfManufacture, String brandName, double priceInUAH, Gender genderCategory,
			String material, String color, int size, int itemId, String footwearStyle, String soleMaterial,
			int soleHeightInMilimetres, String liningMaterial, String insulationMaterial) {
		super(season, countryOfManufacture, brandName, priceInUAH, genderCategory, material, color, size, itemId,
				footwearStyle, soleMaterial, soleHeightInMilimetres, liningMaterial);
		this.insulationMaterial = insulationMaterial;
	}

	public String getInsulationMaterial() {
		return insulationMaterial;
	}

	public void setInsulationMaterial(String insulationMaterial) {
		this.insulationMaterial = insulationMaterial;
	}
	
	
}
