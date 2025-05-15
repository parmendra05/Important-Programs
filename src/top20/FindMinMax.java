package top20;

public class FindMinMax {
    public static void main(String[] args) {
        int []arr = {5,7,3,9,15,55,18,7};

        int min = arr[0];
        int max=arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >max) max = arr[i];
            else if (arr[i] < min) min = arr[i];
        }

        System.out.println("Min : "+min +",  Max : "+max);
    }
}
