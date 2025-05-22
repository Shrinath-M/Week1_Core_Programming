import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        double n1 = sc.nextDouble();
        System.out.println("Enter number 2: ");
        double n2 = sc.nextDouble();
        double add = n1+n2;
        double sub = n1-n2;
        double pdt = n1*n2;
        double div = n1/n2;
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+n1+" and "+n2+" is "+add+", "+sub+", "+pdt+" and "+div);
    }
}
