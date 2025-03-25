import java.util.*;
public class windchill {
    public static double windchill(double temp, double speed){
        return (35.74 + 0.6215 *temp + (0.4275*temp - 35.75) * Math.pow(speed, 0.16));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temp: ");
        double temp = sc.nextDouble();
        System.out.println("Enter the speed: ");
        double speed = sc.nextDouble();
        double res = windchill(temp, speed);
        System.out.println("Windchill: "+res);
    }
}
