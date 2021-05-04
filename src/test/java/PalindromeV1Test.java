import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeV1Test {

    PalindromeV1 palindromeV1 = new PalindromeV1();

    @Test
    public void isPalindrome() throws Exception {
        String inputTest = "madam";
        assertTrue(palindromeV1.isPalindrome());
    }
}