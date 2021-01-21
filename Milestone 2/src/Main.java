
public class Main {
	public static void main(String[] args) {
		AppCommunicator appComm = new AppCommunicator();
		new ControllerCommunicator(appComm, 1);
		appComm.getOrderInput();
	}
}
