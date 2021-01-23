package algorithms;

public class ArrayUtils {
    public static boolean isPalindrome(int[] a, int n) {
        for (int i = 0, j = n - 1; i <= j; i++, j--) {
            if (a[i] != a[j]) {
                return false;
            }
        }
        return true;
    }

    public static int findMissingNumber(int[] a, int finalNumber) {
        int[] b = new int[finalNumber + 1];
        //step 1
        for (int i = 1; i <= finalNumber; i++) {
            b[i] = 0;
        }
        for (int i = 0; i < a.length; i++) {
            b[a[i]]++; // vector de frecventa
        }
        for (int i = 1; i <= finalNumber; i++) {
            if (b[i] == 0) {
                return i;
            }
        }
        return 0;
    }

    public static int findMissingNumber1(int[] a, int finalNumber) {
        int arraySum = 0;
        for (int i = 0; i < a.length; i++) {
            arraySum += a[i];
        }
        int sum = finalNumber * (finalNumber + 1) / 2;
        return sum - arraySum;
    }

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
    // Scrieti un program care afiseaza elementele duplicate dintr-un array.
    public static void isDuplicate() {
        int[] arr = {1, 2, 2, 1, 6, 7, 7, 8, 9, 7, 8, 9, 5, 5};

        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    System.out.print(arr[j]);
                }
            }
        }
        // Scrieti un program care inverseaza elementele intr-un array print-o singura parcurgere fara a folosi un array aditional

    }






}
