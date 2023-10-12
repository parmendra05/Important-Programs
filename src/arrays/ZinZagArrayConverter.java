package arrays;

import java.util.Arrays;

public class ZinZagArrayConverter {

	public static void main(String[] args) {

		int[] arr = { 5, 6, 1, 9, 10, 7, 25, 13, 22 };

		System.out.println("Before Sorting  : ");
		for (int a : arr)
			System.out.print(a + ", ");

		// Sorting
		Arrays.sort(arr);

		System.out.println("\nAfter Sorting  : ");
		for (int a : arr)
			System.out.print(a + ", ");

		System.out.println("\nAfter ZigZag Conversion : ");
		for (int i = 1; i < arr.length - 1; i += 2) {
			int temp = arr[i];
			arr[i] = arr[i + 1];
			arr[i + 1] = temp;
		}

		for (int a : arr)
			System.out.print(a + ", ");

	}

}
