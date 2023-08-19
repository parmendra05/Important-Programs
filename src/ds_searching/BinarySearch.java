package ds_searching;

import java.util.Arrays;

public class BinarySearch {

	static int bSearch(int[] arr, int target) {

		int left = 0;
		int right = arr.length - 1;
		int mid;

		while (left <= right) {
			mid = left + (right - left) / 2;

			if (arr[mid] == target)
				return mid;

			else if (arr[mid] < target)
				left = mid + 1;

			else
				right = mid - 1;
		}
		return -1;
	}

	public static void main(String[] args) {

		int[] numbers = { 5, 2, 8, 25, 11, 3 };
		int target = 25;

		Arrays.sort(numbers); // Binary search always search on sorted array.
		System.out.println("Your given arrays are");
		for (int num : numbers)
			System.out.print(num + ", ");

		int index = bSearch(numbers, target); // method calling

		if (index != -1)
			System.out.println("\nTarget found at index : " + index);
		else
			System.out.println("\nTarget not available in the array");

	}

}
