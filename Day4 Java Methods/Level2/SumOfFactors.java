import java.util.*;
public class SumOfFactors {
    public static int[] factors(int n){

        int cnt = 0;
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                cnt++;
            }
        }
        int fac[] = new int[cnt];
        int index = 0;
        for (int i = 1; i <= n ; i++){
            if (n % i == 0){
                fac[index++] = i;
            }
        }
        return fac;
    }
    public static int sum_fac(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                sum += i;
            }
        }
        return sum;
    }
    public static int sum_sq(int n){
        int sq = 0;
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                sq += i*i;
            }
        }
        return sq;
    }
    public static int pdt(int n){
        int p = 1;
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                p *= i;
            }

        }
        return p;
    }
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        System.out.println("Enter num: ");
        int n = sc.nextInt();
        int res[] = factors(n);
        int s = sum_fac(n);
        int squares = sum_sq(n);
        int pd = pdt(n);
        System.out.println("Array of factors: "+Arrays.toString(res));
        System.out.println("Sum of factors: "+s);
        System.out.println("Sum of squares of factors: "+squares);
        System.out.println("Product of factors: "+pd);
    }

}