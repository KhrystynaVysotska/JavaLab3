package ua.lviv.iot.shop.model;

public class Sweater extends AbstractClothes {
	private String knittingType;
    private double neckHeightInCentimetres;
    
	public Sweater(Season season, String countryOfManufacture, String brandName, double priceInUAH,
			Gender genderCategory, String material, String color, int size, int itemId, int ageGroupInYears,
			int heightInCentimetres, String clothesStyle, String printType, String knittingType,
			double neckHeightInCentimetres) {
		super(season, countryOfManufacture, brandName, priceInUAH, genderCategory, material, color, size, itemId,
				ageGroupInYears, heightInCentimetres, clothesStyle, printType);
		this.knittingType = knittingType;
		this.neckHeightInCentimetres = neckHeightInCentimetres;
	}

	public String getKnittingType() {
		return knittingType;
	}

	public void setKnittingType(String knittingType) {
		this.knittingType = knittingType;
	}

	public double getNeckHeightInCentimetres() {
		return neckHeightInCentimetres;
	}

	public void setNeckHeightInCentimetres(double neckHeightInCentimetres) {
		this.neckHeightInCentimetres = neckHeightInCentimetres;
	}
}