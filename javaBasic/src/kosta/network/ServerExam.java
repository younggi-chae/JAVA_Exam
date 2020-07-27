package kosta.network;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExam {

	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(9000);
			socket = serverSocket.accept();
			
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			
			byte arr[] = new byte[100];
			in.read(arr);			
			System.out.println("클라이언트에서 보내는 메세지 : " + new String(arr));
		   
			String message = "아아아아아!";
			out.write(message.getBytes());			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
				serverSocket.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		

	}

}
