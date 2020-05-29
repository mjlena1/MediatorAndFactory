package MediatorFactory;
import java.util.ArrayList;

public class ChatRoom {
	
	private static ArrayList<User> users = new ArrayList();
	private static Bot bot;
	private static MainF factory = new MainF();
	
	public static void showMessage(User user, String message){
		if(!users.contains(user)){
			System.out.println("System: "+ user.getName()+ " was banned!");
			return;
		}	
            System.out.println("[" + user.getName()+"] "+ ": " + message);
		
		if(bot != null && message.contains("cat")){
			bot.removeUser(user);
			bot.printMessage();			
		}		
		else if(message.equalsIgnoreCase("addBot")){
			bot = factory.createBot();		
		}
	}
	
	public static void AddUser(User user) {
		if(user!= null) {
			users.add(user);
		}
	}
	
	public static void RemoveUser(User user) {
		if(user!= null && users.contains(user)) {
			users.remove(user);
			System.out.println(user.getName() + " has been removed from the chat!");
		}
	}

}
