package algorithms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringUtils {
    public static boolean preCircularPermuted(String s1, String s2) {
        //mare
        //rema
        if(s1.length() != s2.length())
        return false;
        s1 += s2;
        return s1.contains(s2);
    }

    // Scrieti un program care determina daca 2 stringuri sunt anagrame.
    public static boolean isAnagram() {
        String s1 = "acasa";
        String s2 = "asaca";

        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1, a2);
    }

}
