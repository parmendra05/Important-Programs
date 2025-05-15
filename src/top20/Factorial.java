package top20;

public class Factorial {

    public static int generateFactorials(int value){

        int fact = 1;

        while (value > 0){
            fact = fact * value;

            value --;
        }

        return fact;
    }

    public static void main(String[] args) {
        System.out.println(generateFactorials(5));
    }
}
