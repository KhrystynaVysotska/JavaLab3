package ua.lviv.iot.shop.model;

public class Coat extends AbstractOuterwear {
	private int lengthInCentimetres;

	public Coat(Season season, String countryOfManufacture, String brandName, double priceInUAH, Gender genderCategory,
			String material, String color, int size, int itemId, int ageGroupInYears, int heightInCentimetres,
			String clothesStyle, String printType, String fastenerType, int numberOfPockets, String liningMaterial,
			int lengthInCentimetres) {
		super(season, countryOfManufacture, brandName, priceInUAH, genderCategory, material, color, size, itemId,
				ageGroupInYears, heightInCentimetres, clothesStyle, printType, fastenerType, numberOfPockets,
				liningMaterial);
		this.lengthInCentimetres = lengthInCentimetres;
	}

	public int getLengthInCentimetres() {
		return lengthInCentimetres;
	}

	public void setLengthInCentimetres(int lengthInCentimetres) {
		this.lengthInCentimetres = lengthInCentimetres;
	}
}
