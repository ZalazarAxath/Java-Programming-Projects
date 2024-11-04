import java.util.Scanner;

public class Exercise4_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a letter
        System.out.print("Enter a letter: ");
        String letter = input.next();

        // Check if the input is a valid letter
        if (letter.length() != 1 || !Character.isLetter(letter.charAt(0))) {
            System.out.println(letter + " is an invalid input");
        } else {
            char ch = letter.charAt(0);
            char originalCh = ch;

            // Convert the character to lower case for checking
            ch = Character.toLowerCase(ch);

            // Use switch to determine vowel or consonant
            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println(originalCh + " is a vowel");
                    break;
                default:
                    System.out.println(originalCh + " is a consonant");
                    break;
            }
        }

        input.close();
    }
}
