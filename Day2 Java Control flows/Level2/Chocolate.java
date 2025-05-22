import java.util.Scanner;
public class Chocolate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total num of chocolates: ");
        int choco = sc.nextInt();
        System.out.println("Enter total num of students: ");
        int stu = sc.nextInt();
        int quo = choco / stu;
        int rem = choco % stu;
        System.out.println("The number of chocolates each child gets is " + quo + " and the number of remaining chocolates are " + rem);
    }
}
