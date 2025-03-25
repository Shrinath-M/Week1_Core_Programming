import java.util.*;
public class pnz {
    public static int Check_num(int n){
        if (n > 0){
            return 1;
        } else if (n == 0) {
            return 0;
        }
        else{
            return -1;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        int num = Check_num(n);
        System.out.println(num);
    }
}
