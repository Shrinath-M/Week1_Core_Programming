//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Smallest_Tallest {
    public static int sum(int[] arr){
        int s = 0;
        for (int i = 0; i < arr.length; i++){
            s += arr[i];
        }
        return s;
    }
    public static int mean(int[] arr){
        int sum_res;
        sum_res= sum(arr) / arr.length;
        return sum_res;
    }
    public static int shortest(int[] arr){
        Arrays.sort(arr);
        return arr[0];
    }
    public static int tallest(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height of 11 football players: ");
        int[] arr = new int[11];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int s = sum(arr);
        int m = mean(arr);
        int t = tallest(arr);
        int sh = shortest(arr);
        System.out.println("The shortest height: "+sh);
        System.out.println("The tallest height: "+t);
        System.out.println("The sum of height: "+s);
        System.out.println("The mean height: "+m);
    }
}