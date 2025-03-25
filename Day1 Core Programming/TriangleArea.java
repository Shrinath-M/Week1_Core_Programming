import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of the triangle in cm: ");
        double height = sc.nextDouble();
        System.out.println("Enter the base of the triangle in cm: ");
        double base = sc.nextDouble();
        double Area = (1/2f)*base*height;
        double Area_in_inch = Area/2.54f;
        double Area_in_feet = Area_in_inch / 12;
        System.out.println(" Area of triangle in cm is "+Area+" while in feet is "+Area_in_feet+" and inches is "+Area_in_inch);
    }
}
