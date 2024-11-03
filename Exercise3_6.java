import java.util.Scanner;

public class Exercise3_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Getting user input for weight, feet, and inches
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        System.out.print("Enter feet: ");
        int feet = input.nextInt();

        System.out.print("Enter inches: ");
        int inches = input.nextInt();

        // Convert height to inches
        int totalInches = (feet * 12) + inches;

        // Convert height to meters and weight to kilograms
        double heightInMeters = totalInches * 0.0254;
        double weightInKg = weight * 0.453592;

        // Calculate BMI
        double bmi = weightInKg / (heightInMeters * heightInMeters);

        // Print BMI and category
        System.out.println("BMI is " + bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 24.9) {
            System.out.println("Normal");
        } else if (bmi < 29.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }

        input.close();
    }
}