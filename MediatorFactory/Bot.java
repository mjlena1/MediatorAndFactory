package MediatorFactory;

public class Bot {
	
	public void printMessage() {
		System.out.println("Bot: Cat is forbidden word!!!");
	}
	public void removeUser(User user) {
		ChatRoom.RemoveUser(user);
	}

}
