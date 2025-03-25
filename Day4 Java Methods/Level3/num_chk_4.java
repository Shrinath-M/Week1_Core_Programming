import java.util.*;
public class num_chk_4 {
    public static void prime(int n){
        int c = 0;
        for (int i = 2; i * i <= n; i++){
            if (n % i == 0){
                c = 1;
                break;
            }
        }
        if (c == 0){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not a Prime number");
        }
    }
    public static void neon_number(int n){
        int sq = n * n, sum = 0;
        while(sq > 0){
            sum = sum + (sq % 10);
            sq /= 10;
        }
        if (sum == n){
            System.out.println("Neon number");
        }
        else{
            System.out.println("Not a neon number");
        }
    }
    public static void spy_number(int n){
        int sum = 0, pdt = 1, temp = n;
        while(temp > 0){
            int digit = temp % 10;
            sum += digit;
            pdt *= digit;
            temp /= 10;
        }
        if (sum == pdt){
            System.out.println("Spy number");
        }
        else{
            System.out.println("Not a spy number");
        }
    }
    public static void automorphic_number(int n){
        int square = n * n;
        int last_digit = square % 10;
        if (n == last_digit){
            System.out.println("Automorphic number");
        }
        else{
            System.out.println("Not an Automorphic number");
        }
    }
    public static void buzz_number(int n){
        if (n % 7 == 0 || n % 10 == 7){
            System.out.println("Buzz number");
        }
        else{
            System.out.println("Not a buzz number");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        prime(n);
        neon_number(n);
        spy_number(n);
        automorphic_number(n);
        buzz_number(n);
    }
}
