import java.util.*;
public class SimInt {
    public static double Int(double p, double n, double r){
        return  (p * n * r) / 100;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amnt: ");
        double p = sc.nextDouble();
        System.out.println("Enter rate of interest: ");
        double r = sc.nextDouble();
        System.out.println("Enter no. of yrs: ");
        double n = sc.nextDouble();


        double sim_int = Int( p, n, r);
        System.out.println("Simple interest: "+sim_int);



    }
}
