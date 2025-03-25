import java.util.*;
public class handshake {
    public static double occurance(double n){
        return (n*(n-1))/2;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num of students: ");
        double n = sc.nextDouble();

        double hand_shake = occurance( n);
        System.out.println("No of handshakes: "+hand_shake);
    }
}
