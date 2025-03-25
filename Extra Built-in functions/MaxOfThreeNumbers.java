import java.util.Scanner;

public class MaxOfThreeNumbers {
    public static void main(String[] args) {
        int num1, num2, num3;

        num1 = getUserInput("Enter the first number: ");
        num2 = getUserInput("Enter the second number: ");
        num3 = getUserInput("Enter the third number: ");

        int maxNumber = findMax(num1, num2, num3);
        System.out.println("The maximum of the three numbers is: " + maxNumber);
    }

    public static int getUserInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextInt();
    }


    public static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}
