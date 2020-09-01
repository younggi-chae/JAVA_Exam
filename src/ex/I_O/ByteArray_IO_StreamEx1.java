package ex.I_O;

import java.io.*;
import java.util.*;

public class ByteArray_IO_StreamEx1 {
       //문자기반 스트림  CharArrayReader, CharArrayWriter
	public static void main(String[] args) {
		byte[] inSrc = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		byte[] outSrc = null;

		byte[] temp = new byte[4];

		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;

		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();

		try {
			while (input.available() > 0) {   //available = 읽어올 수 있는 데이터의 크기 반환
				int len = input.read(temp);   // 읽어 온 데이터의 개수를 반환
				output.write(temp, 0, len);   // 읽어 온 만큼만 write한다. 
				// System.out.println("temp : " + Arrays.toString(temp));

				outSrc = output.toByteArray();  // output을 byte 배열에 담아 outSrc에 저장

			}
		} catch (IOException e) {
		}

		System.out.println("Input Source : " + Arrays.toString(inSrc));
		System.out.println("temp : " + Arrays.toString(temp));
		System.out.println("Output Source : " + Arrays.toString(outSrc));
	}

}
