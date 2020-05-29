package MediatorFactory;

public class UserF {
	
	public User createUser(String name)
	{
		return new User(name);
	}

}
