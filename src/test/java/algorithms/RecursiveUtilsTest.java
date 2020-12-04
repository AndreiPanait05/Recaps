package algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursiveUtilsTest {
    @Test
    public void givenNumberFindPowerNumberShouldReturnThePowerNumber(){
        int number = 2;
        int powerNumber = 3;
        assertEquals(RecursiveUtils.powerNumber(2, 3));

    }
    
    @Test
    public void givenNumberToFindWithBinarySearchShouldReturnWithKey() {
        int arr[] = {2, 3, 4, 5, 6, 7, 8, 9, 1};
        int n = arr.length;
        int key = 5;
        assertEquals(RecursiveUtils.arrayBinarySearch(arr, 0, n -1, key));
    }

    private void assertEquals(int arrayBinarySearch) {
    }


}