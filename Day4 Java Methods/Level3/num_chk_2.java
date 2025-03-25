import java.util.*;
public class num_chk_2 {
    public static int count(int n){
        int temp = n, cnt = 0;
        while(temp > 0){
            temp /= 10;
            cnt++;
        }
        return cnt;
    }
    public static int[] store_digits(int n){
        int[] digits = new int[count(n)];
        int index = count(n) - 1;
        while(n > 0){
            digits[index--] = n % 10;
            n /= 10;
        }
        return digits;
    }
    public static int sum_digits(int[] digits){
        int s = 0;
        for (int i = 0; i < digits.length; i++){
            s += digits[i];
        }
        return s;
    }
    public static int sum_sq(int[] digits){
        int sum = 0;
        for (int i = 0; i < digits.length; i++){
            sum += Math.pow(digits[i], 2);
        }
        return sum;
    }
    public static String har_num(int n){
        int[] digits = store_digits(n);
        int sum_d = sum_digits(digits);
        if(n % sum_d == 0){
            return ("Harshad number");
        }
        return ("Not a harshad number");
    }
    public static int[][] Digit_freq(int n){
        int[] freq = new int[10];
        while(n > 0){
            int digits = n % 10;
            freq[digits]++;
            n /= 10;
        }
        int[][] result = new int[10][2];
        for (int i = 0; i < 10; i++){
            result[i][0] = i;
            result[i][1] = freq[i];
        }
        return result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num: ");
        int n = sc.nextInt();

        int c = count(n);
        System.out.println(c);

        int [] dig_res = store_digits(n);
        System.out.println(Arrays.toString(dig_res));

        int sum_res = sum_digits(dig_res);
        System.out.println(sum_res);

        int sq_res = sum_sq(dig_res);
        System.out.println(sq_res);

        String harshad_res = har_num(n);
        System.out.println(harshad_res);

        int[][] freq_res = Digit_freq(n);
        System.out.println("Digits | Frequency");
        System.out.println("------------------");
        for (int i = 0; i < 10; i++){
            if (freq_res[i][1] > 0){
                System.out.println("  "+freq_res[i][0]+"   |   "+freq_res[i][1]);
            }
        }

    }
}
