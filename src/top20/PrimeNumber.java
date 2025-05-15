package top20;

public class PrimeNumber {
    static boolean primeChecker(int input){

        for (int i = 2; i < input/2; i++) {
            if(input % i ==0)
                return false;
        }

        return true;
    }

    static boolean perfectChecker(int input){
        int sum =0;
        for (int i = 1; i <= (input /2); i++) {
            if (input % 2 == 0) sum+=i;
        }
        if (sum == input) return true;
        else return false;
    }

    public static void main(String[] args) {
        System.out.println(primeChecker(28));
        System.out.println(perfectChecker(9));
    }
}
