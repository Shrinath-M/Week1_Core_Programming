import java.util.*;
public class num_chk {
    public static boolean ispositive(int num){
        return num > 0;
    }
    public static boolean isEven(int num){
        return (num % 2 == 0);
    }
    public static int compare(int num1, int num2){
        if (num1 == num2){
            return 0;
        }
        else if (num1 > num2) {
            return 1;
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num[] = new int[5];
        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < num.length; i++){
            num[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(num));
        for (int i = 0; i < num.length; i++){
            if (ispositive(num[i])){
                System.out.println("Number "+num[i]+" is positive and ");
                if (isEven(num[i])){
                    System.out.println("even");
                }
                else{
                    System.out.println("odd");
                }
            }
            else{
                System.out.println("Number "+num[i]+" is negative");
            }
        }
        int com_res = compare(num[0], num[(num.length - 1)]);
        System.out.println("First and last numbers are: "+ com_res);
        if (com_res == 1){
            System.out.println("First num greater than last");
        }
        else if (com_res == 0){
            System.out.println("both are equal");
        }
        else{
            System.out.println("First num lesser than last");
        }
    }

}
