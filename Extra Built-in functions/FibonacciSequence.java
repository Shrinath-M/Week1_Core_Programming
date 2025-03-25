import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        int terms = getUserInput("Enter the number of terms for the Fibonacci sequence: ");

        generateFibonacci(terms);
    }

    public static int getUserInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextInt();
    }

    public static void generateFibonacci(int n) {
        int first = 0, second = 1, next;
        System.out.println("Fibonacci sequence up to " + n + " terms:");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }
}
