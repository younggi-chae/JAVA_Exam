package ex.array;

public class arrayEx5 {
       //배열을 통해 shuffle(섞기) 연습
	  public static void main(String[] args) {
    	  
		  int num[] = new int[10]; //길이가 10인 배열 생성
    	   
    	   for(int i = 0; i < num.length; i++) {
		   num[i] = i; //배열을 0~9의 숫자로 초기화, for문을 통해 0~9까지의 숫자를 하나씩 꺼내온다.
    		   System.out.print(num[i]);
    	   }
    	  System.out.println();
    	  
    	  for(int i = 0; i < num.length; i++) {
    		  int n = (int)(Math.random()*10); //0~9의 값을 임의로 얻어내는 코드
    		  int tmp = num[0]; //빈 저장소 생성, num[0]의 값을 변수 tmp에 저장
    		  num[0] = num[n]; //0과 n의 값을 서로 바꿈
    		  num[n] = tmp; // n값을 빈 저장소에 저장
    	  }
    	  for(int i = 0; i < num.length; i++) {
    		  System.out.print(num[i]);
    	  }
      }
	  
}
