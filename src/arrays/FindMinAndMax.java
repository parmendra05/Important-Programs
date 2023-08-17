package arrays;

public class FindMinAndMax {

	public static void main(String[] args) {

		int arr[] = { 5, 12, 85, 23, 2, 14, 23 };

		int max = arr[0];
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
			else if (arr[i] < min)
				min = arr[i];

		}
		System.out.println("Max : " + max + "  & Min : " + min);
	}

}
