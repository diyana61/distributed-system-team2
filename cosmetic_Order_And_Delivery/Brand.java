package cosmetic_Order_And_Delivery;

public class Brand extends User {

	private int BrandId;
	private String brandName;
	private String brandEmail;
	private String brandDescription;
	private String accountNumber;

	public void updateCosmetic(int cosmetic) {
		throw new UnsupportedOperationException();
	}

	public void addCosmetic(int cosmeticDetails) {
		throw new UnsupportedOperationException();
	}

	public void deleteCosmetic(int cosmeticid) {
		throw new UnsupportedOperationException();
	}

	public void viewOwnOrders() {
		throw new UnsupportedOperationException();
	}

	public void viewDashboardData() {
		throw new UnsupportedOperationException();
	}

	public void updateProfile() {
		throw new UnsupportedOperationException();
	}

	public void contactAdmin(int subject, int message) {
		throw new UnsupportedOperationException();
	}

	public int getBrandId() {
		return BrandId;
	}

	public void setBrandId(int brandId) {
		BrandId = brandId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getBrandEmail() {
		return brandEmail;
	}

	public void setBrandEmail(String brandEmail) {
		this.brandEmail = brandEmail;
	}

	public String getBrandDescription() {
		return brandDescription;
	}

	public void setBrandDescription(String brandDescription) {
		this.brandDescription = brandDescription;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
}
