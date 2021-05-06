import java.util.Scanner;

public class PalindromeV3 {

    public boolean isPalindrome() {

        Scanner userInput = new Scanner(System.in); // Receive user input ere
        System.out.println("Insert a word");


        String stringHolder = userInput.nextLine().toLowerCase(); // Read user input "RACECAR"
        String reversedString = "";
        System.out.println("You've inserted: " + stringHolder); // Output user input "RACECAR"

        StringBuffer sBReverse = new StringBuffer(stringHolder);
        System.out.println(sBReverse.reverse());
        return false;
    }

}
