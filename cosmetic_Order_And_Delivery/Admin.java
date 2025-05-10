package cosmetic_Order_And_Delivery;

public class Admin extends User {

	private String userName;

	public void manageCosmetic(int cosmetic) {
		throw new UnsupportedOperationException();
	}

	public void manageCategory(int category) {
		throw new UnsupportedOperationException();
	}

	public void viewAllOrders() {
		throw new UnsupportedOperationException();
	}

	public void contactBrand(int brand, int message) {
		throw new UnsupportedOperationException();
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
