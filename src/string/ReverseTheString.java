package string;

public class ReverseTheString {
	public static void main(String[] args) {
		
		String str="welcome";
		
		// First way with StringBuffer Or StringBuilder
		StringBuffer buffer=new StringBuffer(str);
		System.out.println(buffer.reverse());
		
		// 2nd Way 
		char[] charr=str.toCharArray();
		for(int i=charr.length-1; i>=0; i--)
			System.out.print(charr[i]);
		
		System.out.println("");
		// 3rd Way
		for(int i=str.length()-1; i>=0; i--)
			System.out.print(str.charAt(i));
	}

}
