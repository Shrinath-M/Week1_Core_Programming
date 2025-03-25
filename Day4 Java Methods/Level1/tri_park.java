import java.util.*;
public class tri_park {
    public static double rounds(double s1, double s2, double s3){
        double perimeter = (s1+s2+s3) / 3;
        double round = 5/perimeter;
        return round;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter s1: ");
        double s1 = sc.nextDouble();
        System.out.println("Enter s2: ");
        double s2 = sc.nextDouble();
        System.out.println("Enter s3: ");
        double s3 = sc.nextDouble();

        double r = rounds(s1, s2, s3);
        System.out.println("Total no of rounds: "+r);

    }
}
