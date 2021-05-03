import java.util.Scanner;

public class PalindromeV1 {

    public boolean isPalindrome() {

        Scanner userInput = new Scanner(System.in); // Receive user input ere
        System.out.println("Insert a word");


        String stringHolder = userInput.nextLine().toLowerCase(); // Read user input "RACECAR"
        String reversedString = "";
        System.out.println("You've inserted: " + stringHolder); // Output user input "RACECAR"

        int stringSize = stringHolder.length(); // 2

        for (int i = stringSize - 1; i >= 0; i--) {
            reversedString = reversedString + stringHolder.charAt(i);
        }
        System.out.println(stringHolder + " reversed is: " + reversedString);

        if (stringHolder.equals(reversedString)) {
            System.out.println("Is palindrome!");
            return true;
        } else {
            System.out.println("Is not palindrome.");
            return false;
        }
    }

}
