package ex.I_O;
import java.io.*;
import java.util.*;

public class Data_IO_StreamEx1 {

	public static void main(String[] args) {
		ByteArrayOutputStream bos1 = null;
		DataOutputStream dos1 = null;
		
		byte[] result = null;
		
		try {
			bos1 = new ByteArrayOutputStream();
			dos1 = new DataOutputStream(bos1);
			dos1.writeInt(10);
			dos1.writeFloat(20.0f);
			dos1.writeBoolean(true);
			
			result = bos1.toByteArray();
			
			String [] hex = new String[result.length];
			
			for(int i = 0; i < result.length; i++) {
				if(result[i] < 0) {
					hex[i] = String.format("%02x", result[i]+256 );
				} else {
					hex[i] = String.format("%02x", result[i]);
				}
			}
			
			System.out.println("10진수 : " + Arrays.toString(result));
			System.out.println("16진수 : " + Arrays.toString(hex));
			
			dos1.close();
		}catch (IOException e) {
			e.printStackTrace();
		}

	}

}
