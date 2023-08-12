public class SelectionSort {
    public static void main(String[] args) {
        int array[] = {10,6,7,5,4,8,9,1,2,3};
      
        for (int i = 0; i < array.length-1; i++) {
            int leastNumIndex = i;
            for (int j = i+1; j < array.length; j++) {
                //find the index of array with the smallest value
                if(array[leastNumIndex] > array[j]){
                    leastNumIndex = j;
                }
            }
            
            int temp = array[i];
            array[i] = array[leastNumIndex];
            array[leastNumIndex] = temp;
        }

        for (int i : array) {
            System.out.print(i+" ");
        }
    }  
}
