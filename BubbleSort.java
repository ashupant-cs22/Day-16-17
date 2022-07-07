package Day16and17;

public class BubbleSort {

	static void bubbleSort(int[] arr) {
		int n = arr.length;
		int temp = 0;
		//outer loop
		for (int i = 0; i < n; i++) {
			//inner loop
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {
                     // Swapping
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}

			}
		}

	}

	public static void main(String[] args) {
		int arr[] = { 2, 10, 3, 25, 12, 320, 8 };

		System.out.println("Array Before Bubble Sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		bubbleSort(arr);

		System.out.println("Array After Bubble Sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}
