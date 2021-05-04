import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.*;

public class PalindromeV1Test {

    PalindromeV1 palindromeV1 = new PalindromeV1();

    @Test
    public void isPalindrome() throws Exception {

        String inputTest = "madam";
        InputStream in = new ByteArrayInputStream(inputTest.getBytes());
        System.setIn(in);

        //assertEquals(true,palindromeV1.isPalindrome());
        assertTrue(palindromeV1.isPalindrome());
        // source https://stackoverflow.com/questions/31635698/junit-testing-for-user-input-using-scanner
    }
}