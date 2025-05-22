import java.util.Scanner;
public class atheleteTriangularPark {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of three sides of triangular park: ");
        float s1 = sc.nextFloat(), s2 = sc.nextFloat(), s3 = sc.nextFloat();
        float perimeter = s1+s2+s3;
        float round = 5000 / perimeter;
        System.out.println("The total number of rounds the athlete will run is "+round+" to complete 5 km");

    }
}
