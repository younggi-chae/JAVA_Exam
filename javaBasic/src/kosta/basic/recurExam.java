package kosta.basic;

import java.util.Scanner;

public class recurExam {

	public static int sum(int n) {
		if(n == 0) {
			return 0;			
		} else {
			return n + sum(n-1);
		} 
	}	
		
	public static int sum2(int n, int arr[]) {
		if(n < 0 || n >= arr.length) {
			return 0;
		} else {
			return arr[n] + sum2(n-1, arr);
		}
	}
	
	public static void main(String[] args) {
		// 0~n 까지의 합계 구하기  ==> 재귀함수		
		Scanner sc = new Scanner(System.in);
		System.out.print("n : ");
		int n = sc.nextInt();
//		
//		System.out.println("0~n까지의 합계  : " + sum(n));
		
		int arr[] = {10, 20, 30, 40};
		// arr[0]에서 arr[n-1] 까지의 합을 구하라
		
		System.out.print("arr [" + n + "] 의 합계 : " + sum2(n-1, arr) );
		
		
	}

}
