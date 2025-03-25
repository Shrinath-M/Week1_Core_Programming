import java.util.Scanner;
public class yards_miles {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance in feet: ");
        float feet = sc.nextFloat();
        float yard = feet/3;
        float mile = yard / 1760;
        System.out.println("The distance in feet is "+feet+"while in yard is "+yard+" and mile is "+mile);

    }
}
