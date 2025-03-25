import java.util.*;
public class three_frds {
    public static int youngest(int[] age) {
        int y = (int) age[0];
        for (int i = 0; i < 3; i++) {
            if (age[i] < y) {
                y = (int) age[i];
            }
        }
        return y;
    }
    public static float tallest(float[] height){
        float h = (float) height[0];
        for (int i = 0; i < 3; i++){
            if (height[i] > h){
                h = height[i];
            }
        }
        return h;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] age = new int[3];
        float[] height = new float[3];
        for (int i = 0; i < 3; i++){
            System.out.println("Enter age of frd "+(i+1)+": ");
            age[i] = sc.nextInt();
            System.out.println("Enter height of frd "+(i+1)+": ");
            height [i] = sc.nextFloat();
        }
        int y_age = youngest(age);
        float t_height = tallest(height);
        System.out.println(y_age);
        System.out.println(t_height);
    }
}
