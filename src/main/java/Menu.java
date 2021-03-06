import java.util.Scanner;

public class Menu {

    public void selectPalindromeVersion() {

        Scanner userInput = new Scanner(System.in); // Receive user input here
        System.out.println("Chose your Palindrome-checker software: ");
        System.out.println("PalindromeV1");
        System.out.println("PalindromeV2");
        System.out.println("PalindromeV3");
        System.out.println("Exit");

        String stringHolder = userInput.nextLine().toLowerCase(); // Read user input
        System.out.println("You've selected: " + stringHolder); // Output user input

        while (stringHolder.equals("Exit") == false) {

        if (stringHolder.equals("palindromev1")) {
            PalindromeV1 palindromeChecker = new PalindromeV1(); // Creates new instance of PalindromeV1
            palindromeChecker.isPalindrome(); // Calls method isPalindrome() of palindromeChecker of type PalindromeV1

            Menu menu = new Menu();
            menu.selectPalindromeVersion();
            break;
        }
        else if (stringHolder.equals("palindromev2")) {
            PalindromeV2 palindromeChecker2 = new PalindromeV2();
            palindromeChecker2.isPalindrome();

            Menu menu = new Menu();
            menu.selectPalindromeVersion();
            break;
        }
        else if (stringHolder.contains("palindromev3")) {
            PalindromeV3 palindromeChecker3 = new PalindromeV3();
            palindromeChecker3.isPalindrome();

            Menu menu = new Menu();
            menu.selectPalindromeVersion();
            break;
        }
        else if (stringHolder.equals("exit")) {
            break;
        }
        else {
            System.out.println("Read the menu again.");
            Menu menu = new Menu();
            menu.selectPalindromeVersion();
            break;
        }
        }
    }
}
