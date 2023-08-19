package ds_searching;

public class LinearSearch {

	static int search(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {

		int[] numbers = { 5, 2, 8, 25, 11, 3 };

		int target = 25;

		int index = search(numbers, target);

		if (index != -1)
			System.out.println("Target found at index : " + index);
		else
			System.out.println("Target not available in the array");

	}

}
