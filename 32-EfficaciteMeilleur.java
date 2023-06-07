import java.util.*;

/**
 * Classe EfficaciteMeilleur contenant des méthodes pour trier et afficher des mots.
 */
public class EfficaciteMeilleur {
    
    /**
     * Méthode principale pour exécuter le programme.
     * @param args les arguments de la ligne de commande
     */
    public static void main(String[] args) {
        String str = "Il fait beau aujourd'hui comme en aout";
        ArrayList<Character> ordre = new ArrayList<>(Arrays.asList('f', 'I', 'z', 'u', 'k', 'a', 'b', 'o'));
        ArrayList<String> motTrie = texttolist(str);
        motTrie = triermot(motTrie, ordre);
        bonAffichage(motTrie);
    }

    /**
     * Méthode pour trier les mots d'un texte selon un ordre spécifié.
     * @param text le texte à trier
     * @param LaListe l'ordre de tri spécifié par une liste de caractères
     * @return la liste des mots triés
     */
    public static List<String> solution(String text, List<Character> LaListe) {
        ArrayList<Character> ordre = new ArrayList<>(LaListe);
        ArrayList<String> motTrie = texttolist(text);
        motTrie = triermot(motTrie, ordre);
        if (motTrie.size() == 0) {
            return List.of("");
        }
        return motTrie;
    }

    /**
     * Méthode pour afficher correctement une liste de mots.
     * @param phrase la liste de mots à afficher
     */
    public static void bonAffichage(ArrayList<String> phrase) {
        System.out.print("[");
        for (int j = 0; j < phrase.size() - 1; j++) {
            System.out.print(phrase.get(j) + " ,");
        }
        System.out.print(phrase.get(phrase.size() - 1) + "]");
    }

    /**
     * Méthode pour convertir une chaîne de caractères en une liste de mots.
     * @param str la chaîne de caractères à convertir
     * @return la liste des mots extraits de la chaîne
     */
    public static ArrayList<String> texttolist(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]+", " ").trim();
        String mot = "";
        ArrayList<String> motsep = new ArrayList<String>();
        for (int index = 0; index < str.length(); index++) {
            char car = str.charAt(index);
            if (car == ' ') {
                motsep.add(mot.trim());
                mot = "";
            }
            mot += car;
        }
        if (mot != "") {
            motsep.add(mot.trim());
        }
        return motsep;
    }

    /**
     * Méthode pour trier une liste de mots selon un ordre spécifié.
     * @param motsep la liste de mots à trier
     * @param ordre l'ordre de tri spécifié par une liste de caractères
     * @return la liste des mots triés
     */
    public static ArrayList<String> triermot(ArrayList<String> motsep, ArrayList<Character> ordre) {
        ArrayList<String> motus = new ArrayList<String>();
        int u = 0;
        for (int i = 0; i < ordre.size(); i++) {
            for (int j = 0; j < motsep.size(); j++) {
                char lettre1 = (motsep.get(j).charAt(0));
                if (lettre1 == ((char) ordre.get(i))) {
                    motus.add(motsep.get(j));
                    u++;
                }
            }
        }
        for (int j = 0; j < motsep.size(); j++) {
            if (!ordre.contains(motsep.get(j).charAt(0))) {
                motus.add(motsep.get(j));
                u++;
            }
        }
        return motus;
    }
}
