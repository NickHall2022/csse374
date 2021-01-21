
public class UserResponse {
	
	private int orderID;
	private int coffee_machine_id;
	private int status;
	private String statusMessage;
	
	public UserResponse(int orderID, int coffee_machine_id, int status, String statusMessage) {
		this.orderID = orderID;
		this.coffee_machine_id = coffee_machine_id;
		this.status = status;
		this.statusMessage = statusMessage;
	}

}
