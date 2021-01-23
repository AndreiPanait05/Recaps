package algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayUtilsTest {
    @Test
    public void givenArrayIsPalindromeShouldBeTrue() {
        int[] a = {1,2,2,1};
        int[] b = {1,2,3,2,1};
        Assertions.assertTrue(ArrayUtils.isPalindrome(a, a.length));
        Assertions.assertTrue(ArrayUtils.isPalindrome(b, b.length));
    }


}