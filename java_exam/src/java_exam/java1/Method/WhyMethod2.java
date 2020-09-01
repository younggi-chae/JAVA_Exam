package java_exam.java1.Method;

public class WhyMethod2 {           //매개변수, parameter
	public static void printTwoTimesA(String text, String delimiter) {
		System.out.println(delimiter);
		System.out.println(text);
		System.out.println(text);
		
		
	}
	public static void main(String[] args) {
          	       
		                  //인자, argument
		    printTwoTimesA("a","-");
	        printTwoTimesA("a","*");
	        printTwoTimesA("a","&");
	        printTwoTimesA("a","!");
	}
}
