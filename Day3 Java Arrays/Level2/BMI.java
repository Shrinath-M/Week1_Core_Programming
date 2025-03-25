import java.util.*;
public class BMI {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight of 3 persons of the team(kg): ");
        double w[] = new double[3];
        for (int i = 0; i < 3; i++){
            w[i] = sc.nextDouble();
        }
        System.out.println("Enter height of 3 persons of the team(m): ");
        double h[] = new double[3];
        for (int i = 0; i < 3; i++){
            h[i] = sc.nextDouble();
        }
        double b[] = new double[3];
        for (int i = 0; i < 3; i++){
            b[i] = w[i] / (h[i]*h[i]);
            if (b[i] <= 18.4){
                System.out.println(b[i]+": Underweight");
            }
            else if (b[i] >= 18.5 && b[i] <= 24.9) {
                System.out.println(b[i]+": Normal");
            }
            else if (b[i] >= 25 && b[i] <= 39.9) {
                System.out.println(b[i]+": Overweight");
            }
            else{
                System.out.println(b[i]+": Obese");
            }
        }
        System.out.println(Arrays.toString(b));

    }
}
