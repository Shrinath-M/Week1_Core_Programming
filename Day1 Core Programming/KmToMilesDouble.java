import java.util.Scanner;
public class KmToMilesDouble {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance in km: ");
        double km = sc.nextDouble();
        double miles = km * 1.6;
        System.out.println("Distance in miles: "+miles);

    }
}
