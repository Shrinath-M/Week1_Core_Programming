import java.util.Scanner;
public class salary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sal: ");
        double s = sc.nextDouble();
        System.out.println("enter bonus amt: ");
        double b = sc.nextDouble();
        double total = s+b;
        System.out.println("The salary is INR "+s+" and bonus is INR "+b+". Hence Total Income is INR "+total);
    }
}
