package searching_algo;
public class BinarySearch {
    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 5;
        binarySearch(sortedArray, key);
    }

    public static void binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;
        boolean found = false;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == key) {
                found = true;
                System.out.println("Element found at index: " + mid);
                break;
            }

            if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Element not found.");
        }
    }
}
