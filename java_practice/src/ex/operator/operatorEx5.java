package ex.operator;

public class operatorEx5 {

	public static void main(String[] args) {
		char c = 'a';
		for(int i = 0; i < 26; i++) {
			System.out.print(c++);  //a~z 출력
		}
        c = 'A';
        for(int i = 0; i < 26; i++) {
        	System.out.print(c++);  //A~Z 출력
        }
        c = '0';
        for(int i = 0; i < 10; i++) {
        	System.out.print(c++); //0~9 출력
        }
	}

}
