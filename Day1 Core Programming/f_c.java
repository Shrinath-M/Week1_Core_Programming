import java.util.Scanner;
public class f_c {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temp in fah: ");
        double f = sc.nextDouble();
        double c = (f - 32) * 5/9;
        System.out.println("The "+f+" fahrenheit is "+c+" celsius");
    }
}
