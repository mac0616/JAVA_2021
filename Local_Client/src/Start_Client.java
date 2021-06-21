import java.util.Scanner;
import java.net.*;
public class Start_Client {
	public static void main(String[] args) {
		String name = "";
		System.out.println(" nickname : ");
		Scanner scanner = new Scanner(System.in);
		name = scanner.next();
		
		if(name != null) {
			try {
				Socket socket = new Socket("127.0.0.1", 32000);
				Thread thread_sender = new Client_Sender(socket, name);
				Thread thread_receiver = new Client_Receiver(socket);
				thread_sender.start();
				thread_receiver.start();
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
