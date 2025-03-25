import java.util.*;
public class num_chk_3 {
    public static int count(int n){
        int temp = n, cnt= 0;
        while(temp > 0){
            temp /= 10;
            cnt++;
        }
        return cnt;
    }
    public static int[] store_digits(int n){
        int[] digits = new int[count(n)];
        int index = count(n) - 1;
        while (n > 0){
            digits[index--] = n % 10;
            n /= 10;
        }
        return digits;
    }
    public static int[] reverse_digits(int[] digits){
        int[] rev_digits = new int[digits.length];
        for (int i = 0; i < digits.length; i++){
            rev_digits[i] = digits[digits.length - 1- i];
        }
        return rev_digits;
    }
    public static void compare(int[] digits){
        int c = 0;
        int[] array = reverse_digits(digits);
        for (int i = 0; i < digits.length; i++){
            if (digits[i] != array[i]){
                c = 1;
                break;
            }
        }
        if (c == 0){
            System.out.println("Both arrays are equal");
        }
        else{
            System.out.println("Both arrays aren't equal");
        }

    }
    public static void palindrome(int[] digits){
        int[] a = reverse_digits(digits);

        int c = 0;
        for (int i = 0; i < digits.length; i++){
            if (digits[i] != a[i]){
                c = 1;
                break;
            }
        }
        if (c == 0){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
    public static void duck_num(int[] digits){
        int c = 0;
        for (int i = 0; i < digits.length; i++){
            if(digits[i] == 0){
                c = 1;
                break;
            }
        }
        if (c == 0){
            System.out.println("Duck number");
        }
        else{
            System.out.println("Not a duck number");
        }
    }

    public static void main(String[] args){
        Scanner sc  =new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        int c = count(n);
        System.out.println("No of digits: "+c);

        int[] digits = store_digits(n);
        System.out.println("Digits of the number stored in array: "+Arrays.toString(digits));

        int[] rev_res = reverse_digits(digits);
        System.out.println("Reversed digits: "+Arrays.toString(rev_res));

        compare(digits);
        palindrome(digits);
        duck_num(digits);
    }
}
