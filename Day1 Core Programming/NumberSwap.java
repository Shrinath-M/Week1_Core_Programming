import java.util.Scanner;
public class NumberSwap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter n2: ");
        int n2 = sc.nextInt();
        n1 = n1 ^ n2;
         n2 = n1^n2;
         n1 = n1^n2;
        System.out.println("The swapped numbers are "+n1+" and "+n2);
    }
}
