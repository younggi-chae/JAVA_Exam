package ex.operator;

public class operatorEx1 {

	public static void main(String[] args) {
		int i = 5 , j = 0;
		
		j = i++; // 후위형, 참조하여 대입 후에 증가
		System.out.println("j=i++; 실행 후,  i="+i+", j="+j);
		// 결과 i=6, j=5
		i = 5;
		j = 0;
		
		j = ++i; // 전위형, 증가 후에 참조하여 대입
		System.out.println("j=i++; 실행 후,  i="+i+", j="+j);
		//결과 i=6, j=6
	}

}
