package top20;

public class ArraySorting {
// BubbleSort
    public static void main(String[] args) {
        int []arr = {5,11,3,9};

        for (int i = 0; i < arr.length; i++) {

            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]){ // Swapping
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i :arr) System.out.print(i);
    }
}
