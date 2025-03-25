import java.util.*;
public class split_with_length {
    public static String[] str_words(String text){
        StringBuilder word = new StringBuilder();
        int wordcount = 0;
        for (int i = 0; i < text.length(); i++){
            if (text.charAt(i) == ' '){
                wordcount++;
            }
        }
        wordcount++;
        String[] words = new String[wordcount];
        int index = 0;
        for (int i = 0; i < text.length(); i++){
            if (text.charAt(i) != ' '){
                word.append(text.charAt(i));
            }else {
                words[index++] = word.toString();
                word.setLength(0);
            }
        }
        words[index] = word.toString();
        return words;
    }
    public static int 
}
