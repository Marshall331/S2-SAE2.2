package exercice;

import java.util.List;
import java.util.ArrayList;

public class simplicite_meilleur {
    public static List<String> solution(String str, List<Character> ordre) {
        String[] split = str.split(" ");
        List<String> result = new ArrayList<>();

        for (char c : ordre) {
            for (String word : split) {
                if (word.charAt(0) == c) {
                    result.add(word);
                    break;
                }
            }
        }

        return result;        
    }
}
