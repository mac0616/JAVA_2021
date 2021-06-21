import java.net.*;
public class Start_Server {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket(32000);
			System.out.println("Server Start!");
			
			while(true) {
				Socket socket = serverSocket.accept();  //Ŭ���̾�Ʈ ������ ������ �ؿ��� ���� ����
				System.out.println("Clint ���� �Ϸ�: " + socket.getInetAddress().getHostAddress());
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
