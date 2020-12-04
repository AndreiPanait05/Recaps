package algorithms;

public class NumberUtils {
    public static boolean isPalindrome(int a) {
        int[] number = new int[10];
        int contor = 0;
        //a=101
        //a = a/10 => a=12
        //a%10 = 1
        //a = a/10 => a = 1/10= 0
        while(a > 0) { // 12 !=0, 1!=0, 0!=00
            number[contor] = a%10;
            contor++;
            a = a / 10;
        }
        return ArrayUtils.isPalindrome(number, contor);
    }

    // Scrieti un program care verifica daca un numar e palindrom. (For number: n%10 = digit)
    public static boolean isPalindromeNumber(int number) {
        int originalNumber = number;
        int reversedNumber = 0;
        int reminder;
        while (number != 0) {
            reminder = number%10;
            reversedNumber = reversedNumber * 10 + reminder;
            number /= 10;
        }
        if(originalNumber == reversedNumber) {
            return true;
        } else {
            return false;
        }
    }
    // Interschimbarea a 2 numere fara variabila auxiliara
    public void swapWithoutAuxVar(int a, int b) {
        // using aux var
        // a = 2, b = 3
//        int aux = a;
//        a = b;
//        b = aux;
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//        // without aux var
        a = a + b; // 2+3 = 5 => a = 5
        b = a - b; // 5-3 = 2 => b = 2
        a = a - b; // =. a = 5-2 = 3
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    // Scrieti un program care verifica daca un numar e prim. (nr dat ca parametru)
    public static boolean isAPrimeNumber(int i) {
        int num = 0;
        int temp;
        boolean isPrime = true;
        for(i = 2; i < num / 2; i++) {
            temp = num%i;
            if(temp == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }
}
