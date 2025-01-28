package tecstac;

public class Product {

	private String category;
	private String packageType;
	private String displayType;
	private String isValid;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPackageType() {
		return packageType;
	}

	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}

	public String getDisplayType() {
		return displayType;
	}

	public void setDisplayType(String displayType) {
		this.displayType = displayType;
	}

	public String getIsValid() {
		return isValid;
	}

	public void setIsValid(String isValid) {
		this.isValid = isValid;
	}

	public Product(String category, String packageType, String displayType, String isValid) {
		super();
		this.category = category;
		this.packageType = packageType;
		this.displayType = displayType;
		this.isValid = isValid;
	}
	public Product() {
		super();
	}

	public Product verifyProductDetails(String productDetails) throws InvalidProductException {
		String details[] = productDetails.split(",");
		category = details[0];
		packageType = details[1];
		displayType = details[2];
		isValid = details[3];
		if (!(packageType.equals("Box") || packageType.equals("Pouch"))) {
			throw new InvalidProductException("Invalid product details");
		}
		if (!(displayType.equals("Counter top") || displayType.equals("Shelf"))) {
			throw new InvalidProductException("Invalid product details");
		}
		if (!(isValid.equals("Yes"))) {
			throw new InvalidProductException("Invalid product details");
		}
		Product p = new Product(category, packageType, displayType, isValid);

		return p;

	}
}
