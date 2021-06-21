import java.net.*;
public class Start_Server {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket(32000);
			System.out.println("Server Start!");
			
			while(true) {
				Socket socket = serverSocket.accept();  //클라이언트 접속할 때까지 밑에꺼 실행 안함
				System.out.println("Clint 접속 완료: " + socket.getInetAddress().getHostAddress());
				Thread thread = new Client_Thread(socket);
				thread.start();
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
}
