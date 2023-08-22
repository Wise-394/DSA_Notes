public class BubbleSort {
    public static void main(String[] args) {
        int array[] = {10,6,7,5,4,8,9,1,2,3};
        
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
