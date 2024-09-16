import java.util.Scanner;

public class Excercise2_1 {
    public static void main (String args[])  {  
       //INITIALIZEINPUT
       Scanner tempCelsius = new Scanner(System.in);
       //USERINPUT request tempCelsius 
       System.out.println("Enter a degree in Celsius: ");
       //CALCULATEINPUT convert to fahrenheit
       int celsius = tempCelsius.nextInt();
       double fahrenheit = (celsius * 1.8) + 32;     
       //DISPLAYTEXT output
       System.out.println(celsius + " Celsius is " + fahrenheit + (" Fahrenheit"));  
    }
}
