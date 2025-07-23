package top20;

public class FrequencyOfArray {
    static void printIndex(int [] arr , int value){

        boolean matching = false;

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 1; j < arr.length ; j++) {
                if (arr[i] + arr[j] == value){
                    matching = true;
                    System.out.println("Index has been found : "+i +" & "+j); return;
                }
            }
        }
        if (matching) System.out.println("Thanks ");
        else System.out.println("No Index found");

    }

    public static void main(String[] args) {
        int [] arr={1,4,6,7,2,5,10};
        printIndex(arr,110);
        //printIndex(arr,25);
    }
}
