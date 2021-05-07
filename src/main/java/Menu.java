import java.util.Scanner;

public class Menu {

    public void selectPalindromeVersion() {

        Scanner userInput = new Scanner(System.in); // Receive user input here
        System.out.println("Chose your Palindrome-checker software: ");
        System.out.println("PalindromeV1");
        System.out.println("PalindromeV2");
        System.out.println("PalindromeV3");

        String stringHolder = userInput.nextLine().toLowerCase(); // Read user input
        System.out.println("You've selected: " + stringHolder); // Output user input

        if (stringHolder.equals("PalindromeV1")) {
            PalindromeV1 palindromeChecker = new PalindromeV1(); // Creates new instance of PalindromeV1
            palindromeChecker.isPalindrome(); // Calls method isPalindrome() of palindromeChecker of type PalindromeV1
        }
        else if (stringHolder.equals("PalindromeV2")) {
            PalindromeV2 palindromeChecker2 = new PalindromeV2();
            palindromeChecker2.isPalindrome();
        }
        else if (stringHolder.contains("PalindromeV3")) {
            PalindromeV3 palindromeChecker3 = new PalindromeV3();
            palindromeChecker3.isPalindrome();
        }
    }
}
