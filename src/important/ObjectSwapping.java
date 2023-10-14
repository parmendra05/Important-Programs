package important;

public class ObjectSwapping {

	public static void main(String[] args) {
		
		// Swapping the integer without 3rd variable
		int a=10;
		int b=15;
		System.out.printf("Before Swapping =>\nFirst num : %d & Second num : %d",a,b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.printf("\nAfter Swapping =>\nFirst num : %d & Second num : %d",a,b);
		
		// Swapping the String without 3rd variable
		String str1="Hello";
		String str2="Java";
		System.out.printf("\nBefore Swapping =>\nFirst String : %s & Second String : %s",str1,str2);
		
		str1=str1+str2;
		str2=str1.substring(0,str1.length()-str2.length());
		str1=str1.substring(str2.length());
		System.out.printf("\nAfter Swapping =>\nFirst String : %s & Second String : %s",str1,str2);

	}

}
