package MediatorFactory;

public class Main {
	
	public static void main(String[] args) {
		Factory factory = new MainF();
		User user1 = factory.createUser("Milena");
		User user2 = factory.createUser("Ivan");
		User user3 = factory.createUser("Marin");

		ChatRoom.AddUser(user1);
		ChatRoom.AddUser(user2);
		ChatRoom.AddUser(user3);
		
		user1.sendMessage("addBot");
		user1.sendMessage("Hi, how are ya?");
		user2.sendMessage("Great! Marin, what is your new pet?");
		user3.sendMessage("cat");
		//bot: cat is forbidden word
		//the user has been removed and banned from the chat
		user3.sendMessage(";(");

	}

}
