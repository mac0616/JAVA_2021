import java.net.*;
import java.io.*;
public class Client_Receiver extends Thread {
	Socket socket;
	
	public Client_Receiver(Socket socket) {
		this.socket = socket;
	}
	public void run() {
		try {
			BufferedReader reader = new BufferedReader (new InputStreamReader(socket.getInputStream()));
			while(true) {
				String receive_msg = reader.readLine();
				if (receive_msg == null) break;
				System.out.println(receive_msg);
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
}

