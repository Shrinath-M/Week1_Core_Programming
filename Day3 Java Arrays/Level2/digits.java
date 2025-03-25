import java.util.Arrays;
import java.util.Scanner;
public class digits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int n = sc.nextInt();
        int count = 0, temp = n;
        while (temp > 0){
            count++;
            temp /= 10;
        }
        int arr[] = new int[count];
        for (int i = 0; i < count; i++){
            arr[i] = n%10;
            n /= 10;
        }
        Arrays.sort(arr);
        int lar_ele = arr[count - 1];
        int sec_lar = arr[count - 2];
        for (int i = (count - 2); i >= 0; i--){
            if (arr[i] != lar_ele){
                sec_lar = arr[i];
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("The largest element is: "+lar_ele);
        System.out.println("The second largest element is: "+sec_lar);

    }
}
