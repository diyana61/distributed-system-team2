package cosmetic_Order_And_Delivery;

public class User {

	private int id;
	private String fullName;
	private String passwordHash;
	private boolean isActive;

	public void changePassword(int newPassword) {
		throw new UnsupportedOperationException();
	}

	public void logout() {
		throw new UnsupportedOperationException();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPasswordHash() {
		return passwordHash;
	}

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
}
