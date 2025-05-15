package top20;

public class Fibonacci {
    static void printFibonacci(int length){

        int a=0, b=1, c= 0;
        System.out.print(a +","+b);

        for (int i = 2; i <length ; i++) {
            c=a+b;
            System.out.print(","+c);
            a=b;
            b=c;
        }
    }

    public static void main(String[] args) {
        printFibonacci(7);
    }
}
