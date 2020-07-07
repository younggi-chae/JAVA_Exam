package kosta.basic;

import java.util.Scanner;

public class Fibonacci {

	public static int fibo(int n) {
		if(n >= 2) {
			return fibo(n-1) + fibo(n-2);
		} else {
			return n;
		}
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("n : ");
		int n = sc.nextInt();
		
		System.out.println(fibo(n));

	}

}
