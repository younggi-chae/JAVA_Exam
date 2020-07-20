package kosta.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExam2 {

	public static void main(String[] args) {
		
		String data[] = {
				"bat", "bba", "bbg", "bonus",
				"CA", "ca", "c232", "car",
				"date", "dic", "diraaa"
		};
		
	 Pattern pt = Pattern.compile("c[a-z]*");
	 
	 for(int i = 0; i <data.length; i++) {
		 Matcher m = pt.matcher(data[i]);
		 if(m.matches()) {
			 System.out.println(data[i]);
		 }
	 }
		
		String source = "abc?de?fgh";
		String reg = "(\\w*)";  //그룹 괄호()로 표현
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(source);
		
		while(m.find()) {
			System.out.println(m.group());
		}
		
		String source2 = "HP:010-1111-1111, HOME:02-222-2222";
		String reg2 = "(0\\d{1,2}-\\d{3,4}-\\d{4})";
		Pattern p2 = Pattern.compile(reg2);
		Matcher m2 = p2.matcher(source2);
		
		while(m.find()) {
			System.out.println(m2.group());
		}
	}

}
