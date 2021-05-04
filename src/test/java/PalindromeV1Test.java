import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.*;

public class PalindromeV1Test {

    PalindromeV1 palindromeV1 = new PalindromeV1();

    @Test
    public void isPalindrome() {

        String inputTest = "madam";
        InputStream in = new ByteArrayInputStream(inputTest.getBytes());
        System.setIn(in);
        assertTrue(palindromeV1.isPalindrome());

        //assertEquals(true,palindromeV1.isPalindrome());
        // source https://stackoverflow.com/questions/31635698/junit-testing-for-user-input-using-scanner
        // source https://www.youtube.com/watch?v=b5W8bR4y-g4
    }

    @Test
    public void isNotPalindrome() {

        String inputTest = "Pedro";
        InputStream in = new ByteArrayInputStream(inputTest.getBytes());
        System.setIn(in);
        assertFalse(palindromeV1.isPalindrome());

    }

    @Test
    public void shouldBePalindromeWithUpperCaseInput() {

        String inputTest = "Ana";
        InputStream in = new ByteArrayInputStream(inputTest.getBytes());
        System.setIn(in);
        assertTrue(palindromeV1.isPalindrome());

    }

}