package top20;

public class ReverseTheWord {

    static void reverse( String str){
        String[] words = str.split(" ");

        for (int i = words.length -1; i >=0 ; i--) {
            System.out.print(words [i] +" ");
        }

    }

    public static void main(String[] args) {
        String theString = "I love java";
        reverse(theString);

    }

}
