import java.util.*;
public class num_chk {
    public static int count_digits(int num){
        int cnt = 0;
        int temp = num;
        while (temp > 0){
            temp = temp / 10;
            cnt++;
        }
        return cnt;
    }
    public static int[] store_digits(int num){
        int[] digits = new int[count_digits(num)];
        int index = count_digits(num) - 1;
        while(num > 0){
            digits[index--] = num % 10;
            num /= 10;
        }
        return digits;
    }
    public static void duck_number(int[] digits){
        int duck = 0;
        for (int i = 0; i < digits.length; i++){
            if (digits[i] == 0){
                duck = 1;
                break;
            }
        }
        if (duck == 0){
            System.out.println("It is a duck number");
        }
        else{
            System.out.println("Not a duck number");
        }
    }
    public static void armstrong_num(int num){
        int n = 0, temp = num;
        while(temp > 0){
            int digit = temp % 10;
            n += Math.pow(digit, 3);
            temp /= 10;
        }
        if (n == num){
            System.out.println("Yes, armstrong number");
        }
        else{
            System.out.println("No, not an armstrong number");
        }
    }
    public static void lar_sec_lar(int[] digits){
        int largest = Integer.MIN_VALUE;
        int sec_lar = Integer.MIN_VALUE;
        for (int digit : digits){
            if (digit > largest){
                sec_lar = largest;
                largest = digit;
            }
            else if (digit > sec_lar && digit != largest){
                sec_lar = digit;
            }
        }
        if (largest == Integer.MIN_VALUE || sec_lar == Integer.MIN_VALUE){
            System.out.println("Not enof elements");
        }
        else{
            System.out.println("Largest element: "+largest);
            System.out.println("Second largest: "+sec_lar);
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num: ");
        int num = sc.nextInt();

        int res_cnt = count_digits(num);
        System.out.println("Count of digits: "+res_cnt);

        int[] array_res = store_digits(num);
        System.out.println("Digits stored in an array: "+Arrays.toString(array_res));

        duck_number(array_res);
        armstrong_num(num);
        lar_sec_lar(array_res);
    }
}
