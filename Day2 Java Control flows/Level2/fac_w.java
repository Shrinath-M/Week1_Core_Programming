import java.util.Scanner;
public class fac_w {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int i = 1;
        while(i <= n){
            if (n%i == 0){
                System.out.println(i);
            }
            i++;
        }
    }
}
