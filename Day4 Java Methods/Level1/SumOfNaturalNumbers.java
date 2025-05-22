import java.util.*;
public class SumOfNaturalNumbers {
    public static int Sum_Nat(int n){
        int s = 0;
        for (int i = 1; i <= n; i++){
            s += i;
        }
        return s;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int n = sc.nextInt();
        int num = Sum_Nat(n);
        System.out.println(num);
    }
}
