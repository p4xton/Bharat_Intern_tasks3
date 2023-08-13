import java.util.InputMismatchException;
import java.util.Scanner;

public class TempConverter {

public static void main(String[] args) 
{

      Scanner scanner = new Scanner(System.in);
      boolean running = true;

    while (running) 
    {
        System.out.println("Temperature Converter Application");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");
        System.out.println("3. Convert Celsius to Kelvin"); 
        System.out.println("4. Convert Kelvin to Celsius");
        System.out.println("5. Convert Fahrenheit to Kelvin");
        System.out.println("6. Convert Kelvin to Fahrenheit");
        System.out.println("7. Quit");
        System.out.print("Enter your choice (1-7): ");

     int choice = getInputInt(scanner);

      switch (choice) 
      {
       case 1:
       convertCelsiusToFahrenheit(scanner);
       break;

       case 2:
       convertFahrenheitToCelsius(scanner);
       break;

       case 3:
       convertCelsiusToKelvin(scanner);
       break;

       case 4:
       convertKelvinToCelsius(scanner);
       break;

       case 5:
       convertFahrenheitToKelvin(scanner);
       break;

       case 6:
       convertKelvinToFahrenheit(scanner);
       break;

       case 7:
       running = false;
       break;

       default:
       System.out.println("Invalid choice. Please try again.");

      }

    }

   System.out.println("Thank you for using this Application!");
}


private static void convertCelsiusToFahrenheit(Scanner scanner) 
{

       System.out.print("Enter the temperature in Celsius: ");
       double celsius = getInputDouble(scanner);
       double fahrenheit = (celsius * 9 / 5) + 32;
       System.out.println("Temperature in Fahrenheit: " + fahrenheit);

}


private static void convertFahrenheitToCelsius(Scanner scanner) 
{

        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = getInputDouble(scanner);
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Temperature in Celsius: " + celsius);

}

private static void convertCelsiusToKelvin(Scanner scanner) 
{

       System.out.print("Enter the temperature in Celsius: ");
       double celsius = getInputDouble(scanner);
       double kelvin = celsius + 273.15;
       System.out.println("Temperature in Kelvin: " + kelvin);

}

private static void convertKelvinToCelsius(Scanner scanner) 
{

       System.out.print("Enter the temperature in Kelvin: ");
       double kelvin = getInputDouble(scanner);
       double celsius = kelvin - 273.15;
       System.out.println("Temperature in Celsius: " + celsius);

}

private static void convertFahrenheitToKelvin(Scanner scanner) 
{

        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = getInputDouble(scanner);
        double celsius = (fahrenheit - 32) * 5 / 9;
        double kelvin = celsius + 273.15;
        System.out.println("Temperature in Kelvin: " + kelvin);

}

private static void convertKelvinToFahrenheit(Scanner scanner) 
{

       System.out.print("Enter the temperature in Kelvin: ");
       double kelvin = getInputDouble(scanner);
       double celsius = kelvin - 273.15;
       double fahrenheit = (celsius * 9 / 5) + 32;
       System.out.println("Temperature in Fahrenheit: " + fahrenheit);

}

private static double getInputDouble(Scanner scanner) 
{

   while (true) 
   {
    try 
    {
       return scanner.nextDouble();
    } 
    catch (InputMismatchException e) 
    {
      scanner.nextLine(); // Clear the input buffer
      System.out.print("Invalid input. Please enter a valid number: ");
    }
   }
}


private static int getInputInt(Scanner scanner) 
{
    while (true) 
    {
      try {
            return scanner.nextInt();
          } 
     catch (InputMismatchException e) 
     {
       scanner.nextLine(); // Clear the input buffer
       System.out.print("Invalid input. Please enter a valid number: ");
     }
    }
}

}