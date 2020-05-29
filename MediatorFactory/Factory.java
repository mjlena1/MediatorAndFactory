package MediatorFactory;

public class Factory {
	
	protected UserF userFactory;
	protected BotF botFactory;
	
	public User createUser(String name)
	{
		return userFactory.createUser(name);		
	}
	public Bot createBot()
	{
		return botFactory.createBot();
	}

}
