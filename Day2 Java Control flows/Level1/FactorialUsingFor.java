import java.util.Scanner;
public class FactorialUsingFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int fact = 1;
        for (int i=1; i <= n; i++){
            fact*=i;

        }
        System.out.println("Factorial value of the num is "+fact);
    }
}
