package ex.collection6;
import java.util.*;

public class PropertiesEx1 {

	public static void main(String[] args) {
		Properties prop = new Properties();
		
		prop.setProperty("timeout", "30");
		prop.setProperty("language", "kr");
		prop.setProperty("size", "10");
		prop.setProperty("capacity", "10");
		
		//Enumeration을 통해 prop에 저장된 요소를 출력
		Enumeration e = prop.propertyNames();
		
		while(e.hasMoreElements()) {  // Vetor로 부터 생성된 Enumeration의 요소가 있는지 확인
			String element = (String)e.nextElement(); // 다음 요소를 반환
			System.out.println(element + " = " + prop.getProperty(element));
		}
		
		System.out.println();
		prop.setProperty("size", "20");  //size의 값을 20으로 변경
		System.out.println("size = " + prop.getProperty("size"));
		System.out.println("capacity = " + prop.getProperty("capacity", "20"));
		System.out.println("loadfactor = " + prop.getProperty("loadfactor", "0.75"));
		System.out.println(prop);
		prop.list(System.out);

	}

}
