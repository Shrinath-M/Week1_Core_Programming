import java.util.Scanner;
public class sim_int {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount: ");
        float P = sc.nextFloat();
        System.out.println("Enter the interest: ");
        float R = sc.nextFloat();
        System.out.println("Enter the time: ");
        float N = sc.nextFloat();
        float interest = ((P * N * R) / 100);
        System.out.println("Simple interest: " + interest);
    }
}
