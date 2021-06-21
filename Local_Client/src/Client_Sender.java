import java.net.*;
import java.io.*;
public class Client_Sender extends Thread{
	private Socket socket;
	private String name = "";
	public Client_Sender(Socket socket, String name) {
		this.socket = socket;
		this.name = name;
	}
	public void run() {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			
			writer.println(name);
			writer.flush();
			
			while(true) {
				String str = reader.readLine();
				if(str.contentEquals("exit"))
					break;
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {socket.close();}
			catch(Exception iggnored) {}
		}
		
	}
}
