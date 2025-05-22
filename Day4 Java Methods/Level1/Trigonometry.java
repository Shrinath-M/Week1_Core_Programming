import java.util.*;
public class Trigonometry {
    public static double[] trig_fn(double deg){
        double rad = Math.toRadians(deg);

        double sine = Math.sin(rad);
        double cosine = Math.cos(rad);
        double tangent = Math.tan(rad);
        return new double[] {sine, cosine, tangent};
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter angle in deg: ");
        double deg = sc.nextDouble();
        double res[] = trig_fn(deg);
        System.out.println("Sine: "+res[0]);
        System.out.println("Cosine: "+res[1]);
        System.out.println("Tangent: "+res[2]);
    }
}
