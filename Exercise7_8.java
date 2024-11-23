import java.util.Scanner;

public class Exercise7_8 {
    // Method to calculate average of int array
    public static int average(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num; // Sum the elements
        }
        return sum / array.length; // Return the average
    }

    // Method to calculate average of double array
    public static double average(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num; // Sum the elements
        }
        return sum / array.length; // Return the average
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter ten numbers
        double[] doubleArray = new double[10];
        System.out.println("Enter ten numbers:");
        for (int i = 0; i < doubleArray.length; i++) {
            doubleArray[i] = scanner.nextDouble(); // Read input values
        }

        // Calculate and display the average of the double array
        double averageValue = average(doubleArray);
        System.out.println("The average value is " + averageValue); // Display the result

        scanner.close();
    }
}
