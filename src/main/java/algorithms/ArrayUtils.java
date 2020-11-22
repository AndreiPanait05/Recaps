package algorithms;

public class ArrayUtils {
    public static boolean isPalindrome(int[] a) {

        for (int i = 0, j = a.length -1; i <= j ;i++, j--) {
            if (a[i] != a[j]) {
                return false;
            }
        }
        return true;

    }


}
