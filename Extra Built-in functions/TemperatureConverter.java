import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Convert Fahrenheit to Celsius");
        System.out.println("2. Convert Celsius to Fahrenheit");
        System.out.print("Choose an option (1 or 2): ");
        int choice = scanner.nextInt();

        System.out.print("Enter the temperature value: ");
        double temperature = scanner.nextDouble();

        double convertedTemperature;
        if (choice == 1) {
            convertedTemperature = fahrenheitToCelsius(temperature);
            System.out.printf("%.2f Fahrenheit is %.2f Celsius%n", temperature, convertedTemperature);
        } else if (choice == 2) {
            convertedTemperature = celsiusToFahrenheit(temperature);
            System.out.printf("%.2f Celsius is %.2f Fahrenheit%n", temperature, convertedTemperature);
        } else {
            System.out.println("Invalid choice. Please select 1 or 2.");
        }

        scanner.close();
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
