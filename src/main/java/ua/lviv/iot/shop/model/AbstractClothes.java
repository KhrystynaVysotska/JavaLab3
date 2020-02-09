package ua.lviv.iot.shop.model;

public abstract class AbstractClothes extends AbstractGoodsForKids {
	private int ageGroupInYears;
	private int heightInCentimetres;
	private String clothesStyle;
	private String printType;
	
	public AbstractClothes(Season season, String countryOfManufacture, String brandName, double priceInUAH,
			Gender genderCategory, String material, String color, int size, int itemId, int ageGroupInYears,
			int heightInCentimetres, String clothesStyle, String printType) {
		super(season, countryOfManufacture, brandName, priceInUAH, genderCategory, material, color, size, itemId);
		this.ageGroupInYears = ageGroupInYears;
		this.heightInCentimetres = heightInCentimetres;
		this.clothesStyle = clothesStyle;
		this.printType = printType;
	}

	public int getAgeGroupInYears() {
		return ageGroupInYears;
	}

	public void setAgeGroupInYears(int ageGroupInYears) {
		this.ageGroupInYears = ageGroupInYears;
	}

	public int getHeightInCentimetres() {
		return heightInCentimetres;
	}

	public void setHeightInCentimetres(int heightInCentimetres) {
		this.heightInCentimetres = heightInCentimetres;
	}

	public String getClothesStyle() {
		return clothesStyle;
	}

	public void setClothesStyle(String clothesStyle) {
		this.clothesStyle = clothesStyle;
	}

	public String getPrintType() {
		return printType;
	}

	public void setPrintType(String printType) {
		this.printType = printType;
	}
}
