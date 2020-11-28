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

    public static void main(String[] args) {
        System.out.println(powerNumber(2, 3));
    }
}
