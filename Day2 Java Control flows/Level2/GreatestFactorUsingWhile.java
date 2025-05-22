import java.util.Scanner;
public class GreatestFactorUsingWhile {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=input.nextInt();
        int greatf=1;
        int j=1;
        while (j>0 && j<=num){
            for (int i=1;i<num;i++){
                if (num%i==0){
                    greatf=i;
                }
                j++;
            }
        }
        System.out.print("Greatest factor: "+greatf);
    }
}
