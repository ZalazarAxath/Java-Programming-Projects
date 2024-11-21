import java.util.Scanner;

public class Exercise6_2 {
    public static int sumDigits(long n) {
        int sum = 0;

        // Use a loop to repeatedly extract and remove digits
        while (n != 0) {
            // Extract the last digit and add to sum
            sum += n % 10;
            // Remove the last digit from n
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        // Compute the sum of the digits
        int result = sumDigits(number);
        System.out.println("The sum of the digits in " + number + " is " + result);

        scanner.close();
    }
}
