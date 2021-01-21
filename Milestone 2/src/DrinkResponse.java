
public class DrinkResponse {
	
	private int orderID;
	private int status;
	private String errordesc;
	private String errorcode;

	public DrinkResponse(int orderID, int status, String errordesc, String errorcode) {
		this.orderID = orderID;
		this.status = status;
		this.errordesc = errordesc;
		this.errorcode = errorcode;
	}
	
	public int getOrderId() {
		return orderID;
	}
	
	public int getStatus() {
		return status;
	}
}
