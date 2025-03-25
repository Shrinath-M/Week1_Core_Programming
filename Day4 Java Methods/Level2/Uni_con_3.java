import java.util.*;
public class Uni_con_3 {
    public static void  fah_cel(String unit, double val){
        if (unit.equals("Fahrenheit")){
            double c = (val - 32) * 5 / 9;
            System.out.println("Degree of fah in celsius: "+c);
        }
        if (unit.equals("Celsius")){
            double f = (val * 9 / 5) + 32;
            System.out.println("Degreee of cel in fah: "+f);
        }
        if (unit.equals("Pounds")){
            double k = (0.453592 * val);
            System.out.println("Weight of pounds in kg: "+k);
        }
        if (unit.equals("kilogram")){
            double p = 2.2 * val;
            System.out.println("Weight of kilogram in pounds: "+p);
        }
        if (unit.equals("gallons")){
            double l = 3.78 * val;
            System.out.println("Amount of gallons in litres: "+l);
        }
        if (unit.equals("litres")){
            double g = 0.26 * val;
            System.out.println("Amount of litres in gallons: "+g);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter unit: ");
        String unit = sc.next();
        System.out.println("Enter value: ");
        double val = sc.nextDouble();
        fah_cel(unit, val);
    }
}
