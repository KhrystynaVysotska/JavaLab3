package ua.lviv.iot.shop.model;

public class Backpack extends AbstractAccessories {
	private int lengthInCentimetres;
	private int widthInCentimetres;
	private int heightInCentimetres;
	private double weightInKilograms;
	private int maxCapacityInLitres;
	private int numberOfCompartments;

	public Backpack(Season season, String countryOfManufacture, String brandName, double priceInUAH,
			Gender genderCategory, String material, String color, int size, int itemId, String accessoriesType,
			String printType, int lengthInCentimetres, int widthInCentimetres, int heightInCentimetres,
			double weightInKilograms, int maxCapacityInLitres, int numberOfCompartments) {
		super(season, countryOfManufacture, brandName, priceInUAH, genderCategory, material, color, size, itemId,
				accessoriesType, printType);
		this.lengthInCentimetres = lengthInCentimetres;
		this.widthInCentimetres = widthInCentimetres;
		this.heightInCentimetres = heightInCentimetres;
		this.weightInKilograms = weightInKilograms;
		this.maxCapacityInLitres = maxCapacityInLitres;
		this.numberOfCompartments = numberOfCompartments;
	}

	public int getLengthInCentimetres() {
		return lengthInCentimetres;
	}

	public void setLengthInCentimetres(int lengthInCentimetres) {
		this.lengthInCentimetres = lengthInCentimetres;
	}

	public int getWidthInCentimetres() {
		return widthInCentimetres;
	}

	public void setWidthInCentimetres(int widthInCentimetres) {
		this.widthInCentimetres = widthInCentimetres;
	}

	public int getHeightInCentimetres() {
		return heightInCentimetres;
	}

	public void setHeightInCentimetres(int heightInCentimetres) {
		this.heightInCentimetres = heightInCentimetres;
	}

	public double getWeightInKilograms() {
		return weightInKilograms;
	}

	public void setWeightInKilograms(double weightInKilograms) {
		this.weightInKilograms = weightInKilograms;
	}

	public int getMaxCapacityInLitres() {
		return maxCapacityInLitres;
	}

	public void setMaxCapacityInLitres(int maxCapacityInLitres) {
		this.maxCapacityInLitres = maxCapacityInLitres;
	}

	public int getNumberOfCompartments() {
		return numberOfCompartments;
	}

	public void setNumberOfCompartments(int numberOfCompartments) {
		this.numberOfCompartments = numberOfCompartments;
	}
}
