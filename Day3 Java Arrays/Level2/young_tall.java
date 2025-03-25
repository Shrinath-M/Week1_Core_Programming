import java.util.*;
public class young_tall {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double age[] = new double[3], height[] = new double[3];
        System.out.println("Enter the age of 3: ");
        for (int i = 0; i < 3; i++){
            age[i] = sc.nextDouble();
        }
        Arrays.sort(age);
        System.out.println("Enter the height of 3: ");
        for (int i = 0; i < 3; i++){
            height[i] = sc.nextDouble();
        }
        Arrays.sort(height);
        System.out.println("Age array: "+Arrays.toString(age));
        System.out.println("Youngest: "+age[0]);
        System.out.println("Height array: "+Arrays.toString(height));
        System.out.println("Tallest: "+height[2]);
    }
}
