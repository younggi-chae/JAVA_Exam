package ex.loop;

public class loopEx6 {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
				
		for(int i = 0; i< arr.length; i++) {  // length를 통해 배열 안에 값 개수 확인
			System.out.println(arr[i]);
		}
        for(int tmp : arr) {         //  for(타입 변수명 : 배열 or 컬렉션) { 반복할 문장}  JDK1.5부터 사용가능
        	System.out.println(tmp);
        }
	}

}
