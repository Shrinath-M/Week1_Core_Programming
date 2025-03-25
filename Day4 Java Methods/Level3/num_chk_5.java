import java.util.*;
public class num_chk_5 {
    public static int[] factors(int n){
        int c = 0;
        for (int i = 1; i <= n/2 ; i++){
            if (n % i == 0){
                c++;
            }
        }
        int[] a = new int[c];
        int index = 0;
        for (int i = 1; i <= n/2 ; i++){
            if (n % i == 0){
                a[index++] = i;
            }
        }
        return a;
    }
    public static int greatest_factor(int[] a){
        return a[a.length - 1];
    }
    public static int sum_factors(int n){
        int[] array = factors(n);
        int s = 0;
        for (int i = 0; i <= array.length - 1; i++){
            s += array[i];
        }
        return s;
    }
    public static int product_factors(int n){
        int[] array = factors(n);
        int p = 1;
        for (int i = 1; i <= array.length - 1; i++){
            p *= array[i];
        }
        return p;
    }
    public static int product_cube_factors(int n){
        int[] array = factors(n);
        int p = 1;
        for (int i = 1; i <= array.length - 1; i++){
            array[i] = (int) Math.pow(i, 3);
            p *= array[i];
        }
        return p;
    }
    public static void perfect_number(int n){
        int sum = sum_factors(n);
        if (sum == n){
            System.out.println("Perfect number");
        }
        else{
            System.out.println("Not a prefect number");
        }
    }
    public static void abundant_number(int n){
        int sum = sum_factors(n);
        if (sum > n){
            System.out.println("Abundant number");
        }
        else{
            System.out.println("Not an abundant number");
        }
    }
    public static void deficient_number(int n){
        int sum = sum_factors(n);
        if (sum < n){
            System.out.println("Deficient number");
        }
        else{
            System.out.println("Not an deficient number");
        }
    }
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void strong_number(int n){
        int temp = n, sum = 0;
        while(temp > 0){
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        if (sum == n){
            System.out.println("Strong number");
        }
        else{
            System.out.println("Not a strong number");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        int[] fac_res = factors(n);
        System.out.println(Arrays.toString(fac_res));

        int greatest_fac = greatest_factor(fac_res);
        System.out.println("The greatest factor is: "+greatest_fac);

        int sum_fac_res = sum_factors(n);
        System.out.println("Sum of factors: "+sum_fac_res);

        int pdt_fac = product_factors(n);
        System.out.println("Product of factors: "+pdt_fac);

        int pdt_cube_fac = product_cube_factors(n);
        System.out.println("Product of cube of factors: "+pdt_cube_fac);

        perfect_number(n);
        abundant_number(n);
        deficient_number(n);
        strong_number(n);
    }
}
