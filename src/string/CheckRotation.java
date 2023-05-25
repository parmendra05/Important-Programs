package string;

public class CheckRotation {
	static boolean isRotation(String str1, String str2) {
		return (str1.length() == str2.length() && (str1 + str1).contains(str2));
	}

	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "avaj";

		if (isRotation(s1, s2))
			System.out.println("yes");
		else
			System.out.println("No");

	}
}
