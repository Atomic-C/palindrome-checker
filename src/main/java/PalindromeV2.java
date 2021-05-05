import java.util.Scanner;

public class PalindromeV2 {

    public boolean isPalindrome() {

        Scanner userInput = new Scanner(System.in); // Receive user input here
        System.out.println("Insert a word");

        String stringHolder = userInput.nextLine().toLowerCase(); // Read user input "RACECAR"
        String reversedString = "";
        System.out.println("You've inserted: " + stringHolder); // Output user input "RACECAR"

        char array[] = stringHolder.toCharArray();
        int arrayLength = array.length;

        for (int i = arrayLength -1; i >= 0; i--) {

            reversedString = reversedString + array[i];


        }
        System.out.println(reversedString);
        return false;
    }

}

