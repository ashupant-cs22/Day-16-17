package Day16and17;

public class InsertionSort {

	public class InsertionSortExample {
		public static void insertionSort(int array[]) {
			int n = array.length;
			// Insertion Sort
			for (int j = 1; j < n; j++) {
				int key = array[j];
				int i = j - 1;
				while ((i > -1) && (array[i] > key)) {
					array[i + 1] = array[i];
					i--;
				}
				// Placement
				array[i + 1] = key;
			}
		}

		public static void main(String a[]) {
			int[] arr1 = { 3, 10, 5, 21, 38, 11, 55, 28, 7 };
			System.out.println("Before Insertion Sort");
			for (int i : arr1) {
				System.out.print(i + " ");
			}
			System.out.println();

			insertionSort(arr1);

			System.out.println("After Insertion Sort");
			for (int i : arr1) {
				System.out.print(i + " ");
			}
		}
	}
}

// Before Insertion Sort
// { 3, 10, 5, 21, 38, 11, 55, 28, 7 }

// After Insertion Sort
//  {3, 5, 7, 10, 11, 21, 28, 38 }



