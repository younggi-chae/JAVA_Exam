package ex.loop;

public class loopEx5 {
      //for문과 if문 중첩
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				if(i == j) {  // if문으로 같은 값의 쌍만 출력
				System.out.print("[" +i+ ", " + j + "]");
			} else {
				System.out.print(" ");
			}
			
		  }
			System.out.println();
		}
	}

}
