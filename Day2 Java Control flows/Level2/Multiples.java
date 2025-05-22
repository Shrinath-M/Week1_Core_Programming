import java.util.Scanner;
public class Multiples {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=input.nextInt();
        if (num>0 && num<100){
            for (int i=num;i>0;i--){
                if (num%i==0){
                    System.out.println(i);
                }
            }
        }
    }
}
