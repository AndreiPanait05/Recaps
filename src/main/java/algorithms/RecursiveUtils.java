package algorithms;

public class RecursiveUtils {
    //Scrieti o functie pentru a calcula puterea unui numar.
    public static int powerNumber(int number, int power) {
        // 2^3 -> 2*2*2
        int result = 1;
        for(; power != 0; --power) {
            result = result * number;
        }
        return result;
    }
    // Scrieti o functie recursiva pentru a gasi un nr intr-un array sortat. (binary search)
    public static int arrayBinarySearch(int arr[], int a, int h, int key) {  // Return index of key in arr[a...h]
        if(a > h) {
            return  -1;
        }
        int mid = (a + h) / 2;
        if(arr[mid] == key) {
            return mid;
        }
        if(arr[a] <= arr[mid]) {
            if(key >= arr[a] && key <= arr[mid]) {
                return arrayBinarySearch(arr, a, mid - 1, key);
            }
            if(key >= arr[mid] && key <= arr[h]) {
                return arrayBinarySearch(arr, a, mid + 1, key);
            }
        }
        return arrayBinarySearch(arr, a, mid - 1, key);
    }
}
