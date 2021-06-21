import java.net.*;
import java.io.*;
import java.util.*;
public class Client_Thread extends Thread  {
							//extends Thread ¶Ç´Â implements Runnable
	static List<PrintWriter> list = Collections.synchronizedList(new ArrayList<PrintWriter>());
	Socket socket;
	PrintWriter writer;
	
	public Client_Thread(Socket socket) {
		this.socket = socket;
		try {
			writer = new PrintWriter(socket.getOutputStream());
			list.add(writer);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	public void run() {
		String name = null;
		
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			name = reader.readLine();
			sendAll("*** [" + name + "] ´Ô ÀÔÀå !*");
			while(true) {
				String msg = reader.readLine();
				if(msg ==null)
					break;
				sendAll(name + ">" + msg);
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally {
			list.remove(writer);
			sendAll("***" + name + "] ´Ô ÅðÀå !*");
			try {
				socket.close();
			}catch(Exception ignored) {}
		}
	}
	private void sendAll(String msg) {
		for(PrintWriter writer : list) {
			writer.println(msg);
			writer.flush();
		}
	}
}
