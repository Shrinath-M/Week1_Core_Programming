import java.util.*;
public class second_smallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = input.nextInt();
        int arr[] = new int [size];
        int sum = 0;
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
            }
        Arrays.sort(arr);
        System.out.println("Array elements: " + Arrays.toString(arr));
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        System.out.println("sum: "+sum);
    }
}