package string;

public class InternMethod {

	public static void main(String[] args) {

		String s1 = "hello"; // stored in constant pool
		String s2 = "hello"; // stored in constant pool
		String s3 = new String("hello"); // // stored in Heap

		System.out.println(s1 == s2); // true, because they share the same reference

		System.out.println(s1 == s3); // false, because they share the different reference

		String s4 = s3.intern(); // return a reference of "hello" string in the SCP.
		System.out.println(s1 == s4); // true
		// intern() creates an exact copy of heap string object in string constant pool.

	}

}
