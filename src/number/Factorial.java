package number;

public class Factorial {

	static long factorial(int num) {
		long fact = 1;
		while (num > 0) {
			fact = fact * num;
			num--;
		}
		return fact;
	}

	public static void main(String[] args) {
		int num = 5;
		long fact = factorial(num);
		System.out.println(fact);

	}

}
