import java.util.Scanner;
public class Pound_To_Kg {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the weight in pounds: ");
        float pound = sc.nextFloat();
        float kg = 1/2.2f * pound;
        System.out.println("Weight in kg: "+kg);
    }
}

