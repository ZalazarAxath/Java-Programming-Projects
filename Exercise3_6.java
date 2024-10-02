import java.util.Scanner;

public class Exercise3_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter weight in pounds: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter feet: ");
        int feet = scanner.nextInt();

        System.out.print("Enter inches: ");
        int inches = scanner.nextInt();

        // Convert height to inches
        int totalInches = (feet * 12) + inches;

        // Convert height to meters
        double heightInMeters = totalInches * 0.0254;

        // Calculate BMI
        double bmi = weight / (heightInMeters * heightInMeters);

        // Output BMI
        System.out.println("BMI is " + bmi);

        // Determine BMI category
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Normal");
        } else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }

        scanner.close();
    }
}