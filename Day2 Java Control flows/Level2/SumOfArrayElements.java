import java.util.*;
public class SumOfArrayElements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int cnt = 0;
        int temp = n;
        while(temp > 0){
            cnt++;
            temp/=10;
        }
        int arr[] = new int[cnt];
        for (int i = 0; i < cnt; i++){
            arr[i] = n%10;
            n /= 10;
        }
        int sum = 0;
        for (int i = 0; i < cnt; i++){
            sum += arr[i];
        }
        System.out.println("Array Elements" +Arrays.toString(arr));
        System.out.println(sum);
    }
}
