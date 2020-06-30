package ex.operator;

public class operatorEx6 {

	public static void main(String[] args) {
		//비교 연산자
		System.out.println(10 == 10.0f);
		System.out.println('0' == 0); //문자와 숫자는 다르다. false
        System.out.println('A' == 65); //'A'는 유니코드 10진수로 65, true
        System.out.println('A' > 'B');
        System.out.println('A'+1 == 'B'); //'B'는 유니코드 10진수로 66이다.
        
        String str1 = "abc";
        String str2 = new String("abc");
        
        System.out.println("abc" == "abc"); //true
        System.out.println(str1 == "abc"); //true
        System.out.println(str2 == "abc"); //false, str2는 객체
        System.out.println(str1 == str2); //false 서로 다른 객체 비교
        System.out.println(str1.equals("abc")); //true 
        System.out.println(str2.equals("abc")); //true
        System.out.println(str2.equals("ABC")); //false, 대소문자 구분o
        System.out.println(str2.equalsIgnoreCase("ABC")); //true, 대소문자 구분 x
        //equals는 객체가 달라도 내용이 같다면 true를 반환한다.
	}

}
