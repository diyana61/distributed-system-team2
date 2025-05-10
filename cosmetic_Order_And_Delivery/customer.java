package cosmetic_Order_And_Delivery;

public class customer extends User {

	private String email;
	private int createAt;

	public void register() {
		throw new UnsupportedOperationException();
	}

	public void placeOrders(int cart) {
		throw new UnsupportedOperationException();
	}

	public void viewOrder() {
		throw new UnsupportedOperationException();
	}

	public void contactAdmin(int subject, int message) {
		throw new UnsupportedOperationException();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCreateAt() {
		return createAt;
	}

	public void setCreateAt(int createAt) {
		this.createAt = createAt;
	}
}
