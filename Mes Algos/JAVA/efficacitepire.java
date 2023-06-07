import java.util.List;
import java.util.ArrayList;

public class sobrietemeilleur {
	/**
     * Trie les mots d'une phrase selon un ordre spécifié.
     *
     * @param pfPhrase La chaîne de caractères contenant les mots à trier.
     * @param pfOrdre  La liste des caractères spécifiant l'ordre de tri.
     * @return Une liste contenant les mots triés selon l'ordre spécifié.
     */
	public static List<String> solution(String str, List<Character> ordre) {
        List<String> mots = diviserMots(str);

        for (int i = 0; i < mots.size(); i++) {
            for (int j = i + 1; j < mots.size(); j++) {
                String mot1 = mots.get(i);
                String mot2 = mots.get(j);
                char char1 = mot1.charAt(0);
                char char2 = mot2.charAt(0);
                
                for (int y = 0; y < 1000000000; y++) {
                    int k = y * y;
                }
                
                int index1 = ordre.indexOf(char1);
                int index2 = ordre.indexOf(char2);

                if (index1 > index2) {
                    mots.set(i, mot2);
                    mots.set(j, mot1);
                }
            }
        }
        return mots;
    }

    /**
     * Divise une chaîne de caractères en mots individuels.
     *
     * @param pfPhrase La chaîne de caractères à diviser en mots.
     * @return Une liste contenant les mots individuels extraits de la phrase.
     */
    public static List<String> diviserMots(String pfPhrase) {
        List<String> mots = new ArrayList<>();
        StringBuilder motActuelle = new StringBuilder();

        for (int i = 0; i < pfPhrase.length(); i++) {
            char nextChar = pfPhrase.charAt(i);
            if (Character.isLetter(nextChar)) {
                motActuelle.append(nextChar);

                for (int j = 0; j < 100000000; j++) {
                    int k = j * j;
                    int b = k++/k+1;
                }
            } else if (motActuelle.length() > 0) {
                mots.add(motActuelle.toString());
                motActuelle.setLength(0);
            }
        }

        if (motActuelle.length() > 0) {
            mots.add(motActuelle.toString());
        }
        return mots;
    }
}
