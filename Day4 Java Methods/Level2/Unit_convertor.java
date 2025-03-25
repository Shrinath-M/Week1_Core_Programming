import java.util.*;
public class Unit_convertor {
    public static void u_con(String unit, double n){
        if (unit.equals("km")){
            double m = n * 0.621371;
            System.out.println( "The distance in mile is: "+m);
        }
        else if (unit.equals("miles")){
            double k = n * 1.60934;
            System.out.println( "The distance in mile is: "+k);
        }
        else if (unit.equals("meters")){
            double f = n * 3.28084;
            System.out.println( "The distance in mile is: "+f);
        }
        else if (unit.equals("feet")){
            double mtr = n * 0.3048;
            System.out.println( "The distance in mile is: "+mtr);
        }

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter unit: ");
        String unit = sc.next();
        System.out.println("Enter distance: ");
        double n = sc.nextDouble();
        u_con(unit, n);

    }
}
