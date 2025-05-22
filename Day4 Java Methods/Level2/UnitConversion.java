import java.util.*;
public class UnitConversion {
    public static void Con(String unit, double dist){
        if (unit.equals("yards")){
            double f = 3 * dist;
            System.out.println("Distance of yards in feet: "+f);
        }
        if (unit.equals("feet")){
            double y = 0.33f * dist;
            System.out.println("Distance of feet in yards: "+y);
        }
        if (unit.equals("metres")){
            double i = 39.4 * dist;
            System.out.println("Distance of metres in inches: "+i);
        }
        if (unit.equals("inches")){
            double m = 0.02 * dist;
            System.out.println("Distance of imches in metres: "+m);
        }
        if (unit.equals("inches")){
            double cm = 2.54 * dist;
            System.out.println("Distance of inches in cm: "+cm);
        }
        else{
            System.out.println("Invalid unit");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the unit: ");
        String unit = sc.next();
        System.out.println("Enter distance: ");
        double dist = sc.nextDouble();
        Con(unit, dist);
    }
}
