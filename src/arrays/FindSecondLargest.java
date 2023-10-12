package arrays;

import java.util.Arrays;

public class FindSecondLargest {
	static void printSecondLagest(int[] arr) {

		int length = arr.length;

		if (length < 2) {
			System.out.println("Invalid Array");
			return;
		}
		// Sorting the Arrays
		Arrays.sort(arr);

		for (int i = length - 2; i >= 0; i--) {

			if (arr[i] != arr[length - 1]) {
				System.out.printf("Second Largest Element Is : %d ", arr[i]);
				return;
			}

		}
		System.out.println("\nNo Second Largest Element Exist");
	}

	public static void main(String[] args) {

		int[] arr = { 5};
		int[] brr = { 5, 6, 1, 9, 10, 7, 25, 13, 22  };
		int[] crr = { 7, 7, 7, 7 };
		int[] drr = { 7, 7, 7, 3 };

		printSecondLagest(arr); // Invalid array
		printSecondLagest(brr); // 22
		printSecondLagest(crr); // NO Second Largest Element
		printSecondLagest(drr); // 3
	}

}
