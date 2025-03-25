import java.util.Scanner;
public class pow{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=input.nextInt();
        System.out.print("Enter power: ");
        int pow=input.nextInt();
        int res=1;
        if (num >0 && pow>0){
            for (int i=1;i<=pow;i++){
                res*=num;
            }
        }
        System.out.print("Result: "+res);
    }
}
