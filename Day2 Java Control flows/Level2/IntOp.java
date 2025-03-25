import java.util.Scanner;
public class IntOp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        System.out.println("Enter c: ");
        int c = sc.nextInt();
        int e1 = a + b * c;
        int e2 = a * b + c;
        int e3 = c + a / b;
        int e4 = a % b + c;
        System.out.println(" The results of Int Operations are "+e1+","+e2+","+e3+" and "+e4);
    }
}
