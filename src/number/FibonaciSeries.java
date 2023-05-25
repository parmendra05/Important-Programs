package number;

import java.util.Scanner;

public class FibonaciSeries {
	
	static void printFibonaci(int length) {
		int a=0,b=1,c=0;
		System.out.print(a+", "+b);
		for(int i=0; i<length -2; i++) {
			c=a+b;
			System.out.print(", "+c);
			a=b;
			b=c;
		}
	}

	public static void main(String[] args) {
		System.out.println("Please enter length for fibonaci");
		Scanner sc = new Scanner(System.in);

		int length=sc.nextInt();
		printFibonaci(length);
	}

}
