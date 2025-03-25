import java.util.Scanner;

public class GCD_LCM_Calculator {
    public static void main(String[] args) {
        int num1 = getUserInput("Enter the first number: ");
        int num2 = getUserInput("Enter the second number: ");

        int gcd = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1, num2, gcd);

        displayResults(num1, num2, gcd, lcm);
    }

    public static int getUserInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextInt();
    }

    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int calculateLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }
    public static void displayResults(int num1, int num2, int gcd, int lcm) {
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
}
