import java.util.*;
public class vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter the age of 10 students: ");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements: "+Arrays.toString(arr));
        for (int i = 0; i < 10; i++){
            if(arr[i] < 18){
                System.out.println("The student with age "+arr[i]+" can't vote");
            }
            else if(arr[i] >= 18){
                System.out.println("The student with age "+arr[i]+" can vote");
            }
            else{
                System.out.println("Invalid age");
            }
        }
    }
}
