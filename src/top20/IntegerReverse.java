package top20;

public class IntegerReverse {
    static int reverse(int value){
        int rev =0, rem =0;

        while (value > 0){
            rem = value % 10;
            rev = (rev * 10)+rem;
            value = value/10;
        }

        return rev;
    }

    public static void main(String[] args) {
        System.out.println(reverse(12345));
    }
}
