
public class DrinkOnlyCommand implements Command {
	private int controller_id;
	private int coffee_machine_id;
	private int orderID;
	private String drinkName;
	private String requestType;
	
	public DrinkOnlyCommand(int controller_id, int coffee_machine_id, int orderID, String drinkName, String requestType) {
		this.controller_id = controller_id;
		this.coffee_machine_id = coffee_machine_id;
		this.orderID = orderID;
		this.drinkName = drinkName;
		this.requestType = requestType;
	}

	@Override
	public int getControllerId() {
		return controller_id;
	}

	@Override
	public int getMachineId() {
		return coffee_machine_id;
	}
}
