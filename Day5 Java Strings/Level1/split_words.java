import java.util.Scanner;
public class split_words {
    public static int count(String s){
        int count = 0;
        while(true){
            if (count >= s.lastIndexOf("")){
                break;
            }
            count++;
        }
        return count;
    }
    public static int split(String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == ' '){
                count++;
            }
        }
        return (count + 1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text = sc.nextLine();

        int split_res = split(text);
        System.out.println(split_res);
    }
}
