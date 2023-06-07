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
				char cUn = mot1.charAt(0);
				char cDeux = mot2.charAt(0);

				int index1 = ordre.indexOf(cUn);
				int index2 = ordre.indexOf(cDeux);

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
		StringBuilder motActuel = new StringBuilder();

		for (int i = 0; i < pfPhrase.length(); i++) {
			char charSuivant = pfPhrase.charAt(i);
			if (Character.isLetter(charSuivant)) {
				motActuel.append(charSuivant);
			} else if (motActuel.length() > 0) {
				mots.add(motActuel.toString());
				motActuel.setLength(0);
			}
		}

		if (motActuel.length() > 0) {
			mots.add(motActuel.toString());
		}
		return mots;
	}
}