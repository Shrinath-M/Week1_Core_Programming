import java.util.Scanner;
public class GreatestFactorUsingFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();
        int greatf = 0;
        if (num > 0) {
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    greatf = i;
                }
            }
            System.out.println("Greatest factor: " + greatf);
        } else {
            System.out.println("Enter a positive number");
        }
    }
}
