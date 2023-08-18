package ds_sorting;

public class SelectionSort {
	public static void main(String[] args) {

		int arr[] = { 11, 5, 19, 3, 12, 7, 20 };

		for (int i = 0; i < arr.length; i++) {

			int smallIndex = i; // we assume that 1st element is small.

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[smallIndex] > arr[j]) {
					smallIndex = j;
				}
			}

			int temp = arr[smallIndex];
			arr[smallIndex] = arr[i];
			arr[i] = temp;
		}

		for (int value : arr)
			System.out.print(value + ", ");
	}
}
