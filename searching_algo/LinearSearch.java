package searching_algo;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int array[] = {10,6,7,5,4,8,9,1,2,3};
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number to search: ");
        int numToSearch = scn.nextInt();

        for (int i : array) {
            if(i == numToSearch){
                System.out.println("found the number " + i);
                System.exit(0);
            }
        }
        System.out.println("entered number not found");
    }
}
