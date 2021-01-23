package algorithms;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
    @Test
    public void givenStringShouldReturnTheVowels() {
        String s1 = "afara ploua";
        assertTrue(StringUtils.numberOfVowelsFromAString());
    }

}