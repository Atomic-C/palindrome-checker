import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.*;

public class PalindromeV3Test {

    PalindromeV3 palindromeV3 = new PalindromeV3();

    @Test
    public void isPalindrome() {

        String inputTest = "madam";
        InputStream in = new ByteArrayInputStream(inputTest.getBytes());
        System.setIn(in);
        assertTrue(palindromeV3.isPalindrome());

    }
}