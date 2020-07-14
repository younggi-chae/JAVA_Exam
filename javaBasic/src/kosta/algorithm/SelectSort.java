package kosta.algorithm;

public class SelectSort {

	public static void selectionSort(int arr[], int start) {
		if (start < arr.length - 1) {
			int min_index = start;
			for (int i = start; i < arr.length; i++) {
				if (arr[i] < arr[min_index])
					min_index = i;
			}
			swap(arr, start, min_index);
			selectionSort(arr, start+1);
		}
	}
 
	public static void swap(int arr[], int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
	public static void printArray(int arr[]) {
		for (int data : arr) {
			System.out.print(data + ", ");
		}

		System.out.println();
	}

	public static void main(String[] args) {

		int arr[] = { 3, 6, 2, 4, 7, 8 };
		printArray(arr);
		selectionSort(arr, 0);
		printArray(arr);
	}

}
