import java.util.Scanner;
import java.util.ArrayList;

public class Exercise7_15 {
    // Method to eliminate duplicates from an array
    public static int[] eliminateDuplicates(int[] list) {
        ArrayList<Integer> uniqueList = new ArrayList<>();

        // Iterate through the list and add only unique elements to the ArrayList
        for (int num : list) {
            if (!uniqueList.contains(num)) {
                uniqueList.add(num);
            }
        }

        // Convert ArrayList back to an array
        int[] result = new int[uniqueList.size()];
        for (int i = 0; i < uniqueList.size(); i++) {
            result[i] = uniqueList.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter ten numbers
        int[] numbers = new int[10];
        System.out.println("Enter ten numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt(); // Read the input values
        }

        // Eliminate duplicates and get the result
        int[] distinctNumbers = eliminateDuplicates(numbers);

        // Display the distinct numbers
        System.out.print("The distinct numbers are:");
        for (int num : distinctNumbers) {
            System.out.print(" " + num);
        }

        scanner.close(); // Close the Scanner
    }
}
