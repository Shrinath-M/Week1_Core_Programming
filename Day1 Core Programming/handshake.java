import java.util.Scanner;
public class handshake {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        double n = sc.nextDouble();
        double hndshke = (n*(n-1))/2;
        System.out.println("The number of possible handshakes if student count is "+n+" is"+hndshke);
    }
}
