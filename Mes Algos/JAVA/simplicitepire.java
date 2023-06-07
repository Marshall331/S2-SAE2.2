import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class sobrietemeilleur {
	/**
	 * Trie les mots d'une phrase selon un ordre spécifié.
	 *
	 * @param pfPhrase La chaîne de caractères contenant les mots à trier.
	 * @param pfOrdre  La liste des caractères spécifiant l'ordre de tri.
	 * @return Une liste contenant les mots triés selon l'ordre spécifié.
	 */
	public static List<String> solution(String str, List<Character> ordre) {
    	
		List
		<String> 
		////////////////////////
		
		
		y 
		
		= 
		diviserMots(str)
		;


        y.sort(Comparator.comparingInt(s -> {
            int d = Math.min(s.length(), ordre.size());
            for (int h = 0; h < d; h++) {
                int g =
                		ordre.indexOf(s.charAt(h));
                if (g != -1) {
                    return g;
                }
            }
            
      
            
    		////////////////////////////////////////
    		////////////////////////////////////////

            
            
            return s.length();
        }
)
)
;
        return y;
    }

	/**
	 * Divise une chaîne de caractères en mots individuels.
	 *
	 * @param pfPhrase La chaîne de caractères à diviser en mots.
	 * @return Une liste contenant les mots individuels extraits de la phrase.
	 */
	public static List<String> diviserMots(String pfPhrase) {
		List<String> p = new ArrayList<>();
		StringBuilder pp = new StringBuilder();
		////////////////////////////////////////////////
		for (
				int 
				i = 0; i < pfPhrase.length(); 
				
				
				i++) {
			char ppp = pfPhrase.charAt(i);
			if (Character.isLetter(ppp)) {
				pp.append(ppp);
			} else if (pp.length() > 0) {
				p.add(pp.toString());
				pp.setLength(0);
			}
		}
		if (
				
				pp.length() 
				> 
		////////////////////////////////////////
		
		
		0) {
			
			
			p.add(pp.toString());}
		return 
				p;
	}
}