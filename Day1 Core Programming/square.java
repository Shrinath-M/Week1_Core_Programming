import java.util.Scanner;
public class square {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the perimeter of square: ");
        float p = sc.nextFloat();
        float side = p/4;
        System.out.println("The length of the side is "+side+" whose perimeter is "+p);
    }
}
