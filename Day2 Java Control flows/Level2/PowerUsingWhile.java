import java.util.Scanner;
public class PowerUsingWhile {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=input.nextInt();
        System.out.print("Enter power: ");
        int pow=input.nextInt();
        int res=1,c=0;
        while (c<pow){
            if (num >0 && pow>0){
                for (int i=1;i<=pow;i++){
                    res*=num;
                    c++;
                }
            }
            System.out.print("Result: "+res);
        }
    }
}