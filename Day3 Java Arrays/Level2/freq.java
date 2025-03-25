import java.util.Scanner;
public class freq{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=input.nextInt();
        String numstr=Integer.toString(n);
        int c=numstr.length();
        System.out.println("Number of digits: "+c);

        int[] digits=new int[c];
        for (int i=0;i<c;i++){
            digits[i]=Character.getNumericValue(numstr.charAt(i));
        }
        int[] freq=new int[10];
        for (int digit:digits){
            freq[digit]++;
        }
        System.out.println("Digit frequencies: ");
        for (int i=0;i<10;i++){
            if (freq[i]>0){
                System.out.println("Digit "+i+": "+freq[i]);
            }
        }
    }
}
