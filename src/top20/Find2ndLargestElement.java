package top20;

import java.util.Arrays;

public class Find2ndLargestElement {
    static void secondElementIs(int[] input) {

        if (input.length <2) {
            System.out.println("Invalid Array"); return;
        }

        Arrays.sort(input);
        int maxValue = input[input.length-1];

        for (int i = input.length -2; i >=0; i--) {
            if (input[i] != maxValue){
                System.out.println("2nd Largest Value is : "+input[i]);
            return;
            }


        }
        System.out.println("No 2nd Largest Value available");

    }

    public static void main(String[] args) {
        int[] arr = {5, 7, 3, 9, 15, 55, 55,18, 7};
        int []arr2 = {7,7,7,7};
        int []arr3 = {7};
        secondElementIs(arr);
        secondElementIs(arr2);
        secondElementIs(arr3);
    }
}
