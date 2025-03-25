import java.util.*;
public class bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sal[] = new double[10], serv[] = new double[10];
        int s = 0;
        System.out.println("Enter salary of 10 employees: ");
        for (int i = 0; i < 10; i++){
            sal[i] = sc.nextDouble();
        }
        System.out.println("Enter years of service of 10 employees: ");
        for (int i = 0; i < 10; i++){
            serv[i] = sc.nextDouble();
        }
        System.out.println("Salary Array: "+Arrays.toString(sal));
        for (int i = 0; i < 10; i++){
            if (serv[i] < 5){
                sal[i] += sal[i] * 2/100;
                s += sal[i] * 2/100;
            }
            else{
                sal[i] += sal[i] * 5/100;
                s += sal[i] * 5/100;
            }
        }
        System.out.println("Updated Salary Array: "+Arrays.toString(sal));
        System.out.println("Total bonus payout: "+s);
    }
}