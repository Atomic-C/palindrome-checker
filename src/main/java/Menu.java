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
    }
}
