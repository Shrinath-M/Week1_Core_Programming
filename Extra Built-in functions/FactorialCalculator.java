import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        int number = getUserInput("Enter a number to calculate its factorial: ");

        long factorial = calculateFactorial(number);
        displayResult(number, factorial);
    }
    public static int getUserInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextInt();
    }
    public static long calculateFactorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * calculateFactorial(num - 1);
    }
    public static void displayResult(int num, long factorial) {
        System.out.println("The factorial of " + num + " is: " + factorial);
    }
}
