import java.util.Scanner;

public class Excercise2_1 {
    public static void main (String args[])  {  
       Scanner tempCelsius = new Scanner(System.in);
       System.out.println("Enter a degree in Celsius: ");
       int celsius = tempCelsius.nextInt();
       double fahrenheit = (celsius * 1.8) + 32;     
       System.out.println(celsius + " Celsius is " + fahrenheit + (" Fahrenheit"));  
    }
}
