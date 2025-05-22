import java.util.Scanner;
public class CmToInchToFeet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height in cm: ");
        float cm = sc.nextFloat();
        float inch = cm/2.54f;
        float feet = inch / 12;
        System.out.println("Your Height in cm is "+cm+" while in feet is "+feet+" and inches is "+inch);
    }
}
