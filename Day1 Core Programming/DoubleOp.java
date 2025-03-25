import java.util.Scanner;
public class DoubleOp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = sc.nextDouble();
        System.out.println("Enter b: ");
        double b = sc.nextDouble();
        System.out.println("Enter c: ");
        double c = sc.nextDouble();
        double e1 = a + b * c;
        double e2 = a * b + c;
        double e3 = c + a / b;
        double e4 = a % b + c;
        System.out.println(" The results of Int Operations are "+e1+","+e2+","+e3+" and "+e4);
    }
}
