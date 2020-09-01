package ex.array;
import java.util.Scanner;

public class arrayEx11 {

	public static void main(String[] args) {
		String word[][] = {
				{"chair","의자"},      //word[0][0], word[0][1]
				{"computer", "컴퓨터"}, //word[1][0], word[1][1]
				{"camera", "카메라"}    //word[2][0], word[2][1]
		};
		
		Scanner sc = new Scanner(System.in);
        
		for(int i = 0; i < word.length; i++) {  //길이 3
			System.out.println(word[i][0]+"의 뜻은?"); //1열에 있는 문제를 순차적으로 출력
			
			String tmp = sc.nextLine();
			
			if(tmp.equals(word[i][1])) { //조건문, 입력값과 2열의 값이 같다면?
				System.out.println("정답입니다!");
			} else{
				System.out.println("틀렸습니다!, 정답은 "+word[i][0]+"입니다.");
			}
		}
	}

}
