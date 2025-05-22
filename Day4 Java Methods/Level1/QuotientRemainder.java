import java.util.*;
public class QuotientRemainder {
    public static int[] q_r(int n1, int n2){
        int q = n1 / n2;
        int r = n1 % n2;
        return new int[] {q, r};
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter n2: ");
        int n2 = sc.nextInt();
        int res[] = q_r(n1, n2);
        System.out.println("Quotient: "+res[0]);
        System.out.println("Remainder: "+res[1]);
    }
}
