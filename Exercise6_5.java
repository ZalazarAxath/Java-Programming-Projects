import java.util.Arrays;
import java.util.Scanner;

public class Exercise6_5 {
    public static void displaySortedNumbers(double num1, double num2, double num3) {
        // Store the numbers in an array
        double[] numbers = {num1, num2, num3};

        // Sort the array
        Arrays.sort(numbers);

        // Display the sorted numbers
        System.out.println("The numbers in increasing order are: " 
                           + numbers[0] + " " + numbers[1] + " " + numbers[2]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        // Invoke the method to display the numbers in increasing order
        displaySortedNumbers(num1, num2, num3);

        scanner.close();
    }
}
