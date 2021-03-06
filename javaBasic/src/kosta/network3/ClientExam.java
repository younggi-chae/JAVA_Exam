package kosta.network3;

import java.net.Socket;

public class ClientExam {

	public static void main(String[] args) {
		Socket socket = null;
		
		try {
			socket = new Socket("192.168.0.183", 9000);
			
			Thread sender = new ClientSender(socket);
			Thread receive = new ClientReceive(socket);
			
			sender.start();
			receive.start();					
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				//socket.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}

}