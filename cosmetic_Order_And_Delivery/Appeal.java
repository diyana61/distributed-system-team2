package cosmetic_Order_And_Delivery;

public class Appeal {

	private int appealId;
	private int orderId;
	private int customerId;
	private int brandId;
	private int adminId;
	private String appealMessage;
	private String resolutionDetails;

	public void updateStatus(int newStatus, int adminId, int notes) {
		throw new UnsupportedOperationException();
	}

	public int getAppealId() {
		return appealId;
	}

	public void setAppealId(int appealId) {
		this.appealId = appealId;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getBrandId() {
		return brandId;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAppealMessage() {
		return appealMessage;
	}

	public void setAppealMessage(String appealMessage) {
		this.appealMessage = appealMessage;
	}

	public String getResolutionDetails() {
		return resolutionDetails;
	}

	public void setResolutionDetails(String resolutionDetails) {
		this.resolutionDetails = resolutionDetails;
	}
}
