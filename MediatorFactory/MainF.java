package MediatorFactory;

public class MainF extends Factory{
	public MainF() {
		botFactory = new BotF();
		userFactory = new UserF();
	}
}