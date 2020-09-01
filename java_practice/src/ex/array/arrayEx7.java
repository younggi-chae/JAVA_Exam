package ex.array;

public class arrayEx7 {
        //배열을 통해 배열의 값 빈도수 구하기
	public static void main(String[] args) {
		 int num[] = new int[10];
		 int counter[] = new int[10];
		 
		 for(int i = 0; i < num.length; i++) { 
			 num[i] = (int)(Math.random()*10); // 0~9까지의 임의의 숫자를 i배열에 저장
			 System.out.print(num[i]);
		 }
		 System.out.println(); //줄바꿈
		 
		 for(int i = 0; i < num.length; i++) {
			 counter[num[i]]++;  // num에 저장된 값과 일치하는 인덱스의 요소에 저장된 값을 1씩 증가시킨다.
		 }
		 for(int i = 0; i < num.length ; i++) {
			 System.out.println(i+"의 개수 : "+counter[i]);
		 }
	}

}
