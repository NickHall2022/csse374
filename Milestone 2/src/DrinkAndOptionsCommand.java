
public class DrinkAndOptionsCommand implements Command{
	
	private int controller_id;
	private int coffee_machine_id;
	
	@Override
	public int getControllerId() {
		return controller_id;
	}

	@Override
	public int getMachineId() {
		return coffee_machine_id;
	}

}
