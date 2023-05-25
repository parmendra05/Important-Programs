package number;

public class ReverseTheInteger {

	static int reverse(int value) {
		int rev = 0;
		int rem = 0;
		while (value > 0) {
			
			rem = value % 10;
			rev = (rev * 10) + rem;

			value = value / 10;
		}
		return rev;
	}

	public static void main(String[] args) {
		int value = 123655;
		System.out.println("Reverse is : " + reverse(value));
	}

}
