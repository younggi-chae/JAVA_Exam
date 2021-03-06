package algo;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = {3, 6 ,2 , 8, 4 ,1};
		printArray(arr);
		bubbleSort(arr, arr.length - 1);
		printArray(arr);
	}
	
	public static void bubbleSort(int arr[], int last) {
		if(last > 0) {
			for(int i = 0; i < last; i++) {
				if(arr[i] > arr[i+1]) {
					swap(arr, i , i+1);
				}
			}
			bubbleSort(arr, last-1);
		}
	}
	
	public static void swap(int arr[], int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
	public static void printArray(int arr[]) {
		for(int data : arr) {
			System.out.print(data + ", ");
		}
		System.out.println();
	}

}
