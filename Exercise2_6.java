import java.util.Scanner;

public class Exercise2_6 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        //USERINPUT request subtotal AND gratuity rate
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = userInput.nextDouble();
        double gratuityRate = userInput.nextDouble();
        //COMPUTEINPUT gratuity and total
        double gratuity = subtotal * (gratuityRate / 100);
        double total = subtotal + gratuity;
        //DISPLAYTEXT output
        System.out.printf("The gratuity is $%.2f and total is $%.2f%n", gratuity, total);
    }
}
