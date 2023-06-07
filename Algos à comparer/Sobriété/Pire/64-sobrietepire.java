package exercice;

import java.util.ArrayList;
import java.util.List;

public class sobrietepire {
    public static List<String> solution(String texte, List<Character> ordre) {
        List<String> motsTries = new ArrayList<>();
        
        for (int i = 0; i < texte.length(); i++) {
            String mot = extraireMot(texte, i);
            if (!mot.isEmpty()) {
                ajouterMot(motsTries, mot, ordre);
                i += mot.length() - 1;
            }
        }
        
        return motsTries;
    }
    
    private static String extraireMot(String texte, int startIndex) {
        StringBuilder mot = new StringBuilder();
        int i = startIndex;
        
        while (i < texte.length()) {
            char c = texte.charAt(i);
            
            if (Character.isLetterOrDigit(c)) {
                mot.append(c);
            } else {
                break;
            }
            
            i++;
        }
        
        return mot.toString();
    }
    
    private static void ajouterMot(List<String> motsTries, String mot, List<Character> ordre) {
        motsTries.add(mot); 
        
        for (int i = 0; i < motsTries.size() - 1; i++) {
            for (int j = i + 1; j < motsTries.size(); j++) {
                String mot1 = motsTries.get(i);
                String mot2 = motsTries.get(j);
                if (comparerMots(mot1, mot2, ordre) > 0) {
                    // Échanger les mots
                    motsTries.set(i, mot2);
                    motsTries.set(j, mot1);
                }
            }
        }
    }
    
    private static int comparerMots(String mot1, String mot2, List<Character> ordre) {
        int longueur1 = mot1.length();
        int longueur2 = mot2.length();
        int longueurMin = Math.min(longueur1, longueur2);
        
        for (int i = 0; i < longueurMin; i++) {
            char char1 = mot1.charAt(i);
            char char2 = mot2.charAt(i);
            int index1 = ordre.indexOf(char1);
            int index2 = ordre.indexOf(char2);
            
            if (index1 != -1 && index2 != -1) {
                if (index1 != index2) {
                    return index1 - index2;
                }
            } else if (index1 == -1 && index2 == -1) {
                continue;
            } else if (index1 == -1) {
                return 1;
            } else if (index2 == -1) {
                return -1;
            }
        }
        
        return longueur1 - longueur2;
    }
}