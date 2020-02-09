package ua.lviv.iot.shop.model;

public abstract class AbstractGoodsForKids implements Comparable<AbstractGoodsForKids> {
	private Season season;
	private String countryOfManufacture;
	private String brandName;
	private double priceInUAH;
	private Gender genderCategory;
	private String material;
	private String color;
	private int size;
	private int itemId;

	public AbstractGoodsForKids(Season season, String countryOfManufacture, String brandName, double priceInUAH,
			Gender genderCategory, String material, String color, int size, int itemId) {
		this.season = season;
		this.setCountryOfManufacture(countryOfManufacture);
		this.brandName = brandName;
		this.priceInUAH = priceInUAH;
		this.genderCategory = genderCategory;
		this.setMaterial(material);
		this.setColor(color);
		this.size = size;
		this.setItemId(itemId);
	}

	@Override
	public int compareTo(AbstractGoodsForKids anotherItem) {
		return this.getBrandName().compareTo(anotherItem.getBrandName());
	}

	public double getPriceInUAH() {
		return priceInUAH;
	}

	public void setPriceInUAH(double priceInUAH) {
		this.priceInUAH = priceInUAH;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Season getSeason() {
		return season;
	}

	public void setSeason(Season season) {
		this.season = season;
	}

	public Gender getGenderCategory() {
		return genderCategory;
	}

	public void setGenderCategory(Gender genderCategory) {
		this.genderCategory = genderCategory;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getCountryOfManufacture() {
		return countryOfManufacture;
	}

	public void setCountryOfManufacture(String countryOfManufacture) {
		this.countryOfManufacture = countryOfManufacture;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
}
