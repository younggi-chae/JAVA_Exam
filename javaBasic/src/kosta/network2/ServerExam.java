package kosta.network2;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerExam {

	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(7000);
			socket = serverSocket.accept();
			
			Thread receive = new ServerReceive(socket);
			Thread sender = new ServerSender(socket);
			
			receive.start();
			sender.start();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				//socket.close();
				//serverSocket.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		

	}

}
