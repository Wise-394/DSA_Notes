import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int arraySize;
        System.out.println("how many element?");
        arraySize = scn.nextInt();
        int array[] = new int[arraySize];
        System.out.println("Enter elements");
        for (int i = 0; i < arraySize; i++) {
            array[i] = scn.nextInt();
        }
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
       for (int i : array) {
        System.out.print(i);
       }
    }
}
