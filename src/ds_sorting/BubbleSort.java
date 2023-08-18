package ds_sorting;
// In bubble sort we push the largest element at the end.
public class BubbleSort {

	public static void main(String[] args) {

		int arr[] = { 11, 5, 19, 3, 12, 7, 2 };

		// Time complexity = 0(n^2)
		for (int i = 0; i < arr.length - 1; i++) { // length -1

			for (int j = 0; j < arr.length - i - 1; j++) { // length -1, -2 ,-3 ,..
				if (arr[j] > arr[j + 1]) { // swapping
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		for (int value : arr)
			System.out.print(value + ", ");
	}

}
