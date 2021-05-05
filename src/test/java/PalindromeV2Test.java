import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.*;

public class PalindromeV2Test {

    PalindromeV2 palindromeV2 = new PalindromeV2();

    @Test
    public void isPalindrome() {

        String inputTest = "madam";
        InputStream in = new ByteArrayInputStream(inputTest.getBytes());
        System.setIn(in);
        assertTrue(palindromeV2.isPalindrome());

    }

    @Test
    public void isNotPalindrome() {

        String inputTest = "Pedro";
        InputStream in = new ByteArrayInputStream(inputTest.getBytes());
        System.setIn(in);
        assertFalse(palindromeV2.isPalindrome());

    }

    @Test
    public void shouldBePalindromeWithUpperCaseInput() {

        String inputTest = "Ana";
        InputStream in = new ByteArrayInputStream(inputTest.getBytes());
        System.setIn(in);
        assertTrue(palindromeV2.isPalindrome());

    }
}