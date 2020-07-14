package kosta.algorithm;

public class BubbleSort {

	public static void main(String[] args) {

		int arr[] = { 3, 6, 2, 8, 4, 1 };
		printArray(arr);
		bublleSort(arr, arr.length - 1);
		printArray(arr);
	}

	public static void bublleSort(int arr[], int last) {
		if (last > 0) {
			for (int i = 1; i <= last; i++) {
				if (arr[i - 1] > arr[i]) {
					swap(arr, i - 1, i);
				}
			}
			bublleSort(arr, last - 1);
		}
	}
	public static void swap(int arr[], int index1, int index2) {

		int tmp;
		tmp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = tmp;
	}

	public static void printArray(int arr[]) {
		for (int data : arr) {
			System.out.print(data + ", ");
		}
		System.out.println();
	}
}// end class
