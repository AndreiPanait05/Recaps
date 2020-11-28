package algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberUtilsTest {
    @Test
    public void giveNumberWhenIsPalindromeThenTrue() {
        int c = 1221;
        int d = 12321;
        assertTrue(NumberUtils.isPalindrome(c));
        assertTrue(NumberUtils.isPalindrome(d));
    }
    @Test
    public void givenArrayFindMissingNumberShouldReturnTheMissingNumber() {
        int[] a ={1, 2, 4, 5};
        assertEquals(ArrayUtils.findMissingNumber(a, 5),3);
    }
    @Test
    public void givenArrayFindMissingNumberWithSumShouldReturnTheMissingNumber() {
        int[] a ={1, 2, 4, 5};
        assertEquals(ArrayUtils.findMissingNumber1(a, 5),3);
    }
    @Test
    public void givenNumberFindPalindromeNumber() {
        int number = 1221;
        assertTrue(NumberUtils.isPalindromeNumber(1221));
    }


}