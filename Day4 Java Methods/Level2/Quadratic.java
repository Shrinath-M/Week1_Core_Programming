import java.util.*;
public class Quadratic {
    public static void quad_roots(int a, int b, int c){
        float delta = (float) (Math.pow(b, 2) - (4 * a * c));
        float r1 = (float) (-b + Math.sqrt(delta) / 2 * a);
        float r2 = (float) (-b - Math.sqrt(delta) / 2 * a);
        float r3 = (float) (-b / 2 * a);
        if (delta > 0){
            System.out.println("The roots of x are: "+r1+", "+r2);
        }
        else if( delta == 0){
            System.out.println("The root is: "+r3);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of a, b, c: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        quad_roots(a, b, c);
    }
}
