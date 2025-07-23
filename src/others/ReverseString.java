package others;

import java.util.function.Function;

public class ReverseString {
    public static void main(String[] args) {

        String str= "Hello";

        Function<String, StringBuffer> myConverter = a -> new StringBuffer(a).reverse();

        System.out.println(myConverter.apply(str));
    }
}
