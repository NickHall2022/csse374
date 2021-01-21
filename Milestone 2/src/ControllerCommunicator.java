
public class ControllerCommunicator implements Observer{

	private AppCommunicator appComm;
	private int controllerId;
	private Command command;

	public ControllerCommunicator(AppCommunicator appComm, int controllerId) {
		this.controllerId = controllerId;
		this.appComm = appComm;
		appComm.registerObserver(this);
	}

	@Override
	public void update(Command command) {
		if(command.getControllerId() == controllerId) {
			this.command = command;
			System.out.println("sending command to controller");
			sendCommandToController(command);
		}
	}
	
	public void sendCommandToController(Command command) {
		// send command over network
		// wait for response
		// parse JSON into DrinkResponse
		DrinkResponse drinkResponse = new DrinkResponse(1, 0, null, null);
		System.out.println("recieved response from controller");
		appComm.takeDrinkResponse(drinkResponse);
	}
}
