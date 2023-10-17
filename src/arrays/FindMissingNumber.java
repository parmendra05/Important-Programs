package arrays;

public class FindMissingNumber {

	static int missingValueFinder(int[] arr) {
		int n = arr.length + 1; // expectedLength
		int expectedSum = (n * (n + 1)) / 2;

		int actual_sum = 0;

		for (int a : arr) {
			actual_sum += a;
		}

		return expectedSum - actual_sum;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 8 };

		int missingNum = missingValueFinder(arr);
		System.out.println(missingNum);

	}

}
