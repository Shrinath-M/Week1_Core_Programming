import java.util.Scanner;
public class CelsiusToFahrenheit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temp in celsius: ");
        double c = sc.nextDouble();
        double f = (c * 9/5) + 32;
        System.out.println("The "+c+" celsius is "+f+" fahrenheit");
    }
}
