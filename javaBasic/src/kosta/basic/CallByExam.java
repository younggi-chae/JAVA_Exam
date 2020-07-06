package kosta.basic;

public class CallByExam {

//	public static int change(int num) {
//		num += 100;
//		return num; 
//	}
//	
//	public static void change2(int[] brr) {
//		brr[0] = 300;
//	}

	public static void main(String[] args) {
//		//Call By Value : 값에 의한 호출		
//		int num = 100;
//		
//		//Call By Reference : 주소값에 의한 호출
//		int arr[] = {10};
//		
//		num = change(num);
//		change2(arr);
//		System.out.println(num);
//		System.out.println(arr[0]);

		int num1[] = { 1, 2, 3, 4, 5 };
		int num2[] = { 1, 2, 3, 4, 5, 6 };

		if (equals(num1, num2)) {
			System.out.println("서로 같다.");
		} else {
			System.out.println("서로 다르다.");
		}
	}
	// 서로 자리수도 같고 값이 같으면 "서로 같다" 메서드 만들기
	public static boolean equals(int num1[], int num2[]) {
		if(num1.length != num2.length) {
			return false;
		}
		for(int i = 0; i < num1.length; i++) {
			if(num1[i] != num2[i]) {
				return false;
			}
		}
		return true;
	}
}
