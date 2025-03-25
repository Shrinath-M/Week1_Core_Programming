import java.util.*;
public class rev_num {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int num = sc.nextInt();
        int cnt = 0, temp = num;
        while(temp > 0){
            cnt++;
            temp /= 10;
        }
        int arr[] = new int[cnt];
        for (int i = 0; i < cnt; i++){
            arr[i] = num % 10;
            num /= 10;
        }
        System.out.println(Arrays.toString(arr));
    }
}
