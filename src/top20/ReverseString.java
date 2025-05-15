package top20;

import java.util.function.Function;

public class ReverseString {

    static Function<String , StringBuffer> myjava8Converter = str -> new StringBuffer(str).reverse();

    static String loopConverter(String input){
        String output = "";

        for (int i = input.length() -1; i >=0 ; i--) {
            output+= input.charAt(i);
        }

        return output;
    }

    public static void main(String[] args) {

        String input = "bangalore";

        System.out.println( myjava8Converter.apply(input));
        System.out.println( loopConverter(input) );


           }
}
