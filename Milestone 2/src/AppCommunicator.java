
import java.util.ArrayList;

public class AppCommunicator implements Subject {
	private Order order;
	private Command command;
	private ArrayList<Observer> observers;
	
	public AppCommunicator() {
		observers = new ArrayList<Observer>();
	}
	
	public void getOrderInput() {
		// recieve order from network and parse json file
		this.order = new Order(1, "200 N Main", 47803, "Americano");
		System.out.println("getting order input");
		createCommandFromInput();
	}
	
	public void createCommandFromInput() {
		// use database to select controller and machine based on the order
		this.command = new DrinkOnlyCommand(1, 2, order.getOrderID(), "Expresso", "Simple");
		System.out.println("creating command");
		sendCommand();
	}
	
	public void sendCommand() {
		System.out.println("sending command");
		notifyObservers();
	}
	
	public void takeDrinkResponse(DrinkResponse response) {
		int status = response.getStatus();
		String str = status == 0 ? "Your coffee has been prepared with your desired options." : "Your coffee order has been cancelled.";
		UserResponse userResponse = new UserResponse(response.getOrderId(), command.getMachineId(), status, str);
		System.out.println("recieving response");
		sendUserResponse(userResponse);
	}
	
	public void sendUserResponse(UserResponse userResponse) {
		System.out.println("sending user response");
		// convert userResponse to JSON file
		// send over network
	}
	
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int index = observers.indexOf(o);
		if(index >= 0) {
			observers.remove(index);
		}
	}

	@Override
	public void notifyObservers() {
		for(Observer o : observers) {
			o.update(command);
		}
	}

}
