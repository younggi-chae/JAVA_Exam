package kosta.mission;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Mission05 {

	public static void main(String[] args) {

		// 국어, 영어, 수학 점수 입력 => 총점, 평균
		// 2명 이상의 성적을 입력 받음 => 2차원 배열 구현
		// 국어, 영어, 수학, 총점, 평균
		// 과목 => 1차원 배열
		// 학생 1 국어 :

		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[2][5];
		String subjects[] = { "국어", "영어", "수학", "총점", "평균" };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("학생 " + (i + 1) + subjects[j] + " 입력 : ");
				arr[i][j] = sc.nextInt();
				arr[i][3] += arr[i][j]; // 총점
			}
			arr[i][4] = arr[i][3] / 3; // 평균
		}
		
		// 정렬(평균을 기준으로 오름/ 내림)
		for(int i =0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i][4] < arr[j][4]) {
					int temp[];
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}		
		
//		Arrays.sort(arr, new Comparator<int[]>() {
//
//			@Override
//			public int compare(int[] o1, int[] o2) {
//				if(o1[4] < o2[4]) {
//					return 1;
//				} else if(o1[4] > o2[4]) {
//					return -1;
//				} else {
//					return 0;
//				}				
//			}
//		});
		
		// 출력
		for (String s : subjects) {
			System.out.print(s + "\t");
		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
		

//		String oldArr[] = new String[3];
//			oldArr[0] = "10";
//			oldArr[1] = "20";
//
//		String newArr[] = new String[2];
//			System.arraycopy(oldArr, 0, newArr, 0, newArr.length);
//			System.out.println(Arrays.toString(newArr));

	}

