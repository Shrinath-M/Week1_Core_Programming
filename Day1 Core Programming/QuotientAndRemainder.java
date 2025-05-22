import java.util.Scanner;
public class QuotientAndRemainder{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n1: ");
        double n1 = sc.nextDouble();
        System.out.println("Enter n2: ");
        double n2 = sc.nextDouble();
        double quo = n1/n2;
        double rem = n1%n2;
        System.out.println("The Quotient is "+quo+" and Reminder is "+rem);
    }
}