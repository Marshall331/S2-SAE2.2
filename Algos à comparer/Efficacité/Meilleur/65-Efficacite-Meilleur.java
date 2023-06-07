package concours_algo;
import java.util.ArrayList;
import java.util.List;

public class EfficaciteMeilleur {
	
	public static List<String> extractWords(String texte) {
        List<String> mots = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        for (char c : texte.toCharArray()) {
            if (Character.isLetter(c)) {
                word.append(c);
            } else if (word.length() > 0) {
                mots.add(word.toString());
                word.setLength(0);
            }
        }
        if (word.length() > 0) {
            mots.add(word.toString());
        }
        return mots;
    }

	
	
	public static boolean comparateur(String mot1, String mot2,List<Character> ordre) {
		int i;
		int un =999;
		int deux =999;
		for(i=0;i<ordre.size();i++) {
			if (mot1.charAt(0)==(ordre.get(i))) {
				un=i;
			}
			if (mot2.charAt(0)==(ordre.get(i))) {
				deux=i;
			}
		}
		if (un>=deux) {
			return true;
		}else {
			return false;
		}
		
	}
	public static void Tribulle( List<String> mots,List<Character> ordre) {
		String ech ="";
		boolean permut = true;
		while(permut==true) {
			permut=false;
			for(int i=0; i<mots.size()-1;i++) {
				if (comparateur(mots.get(i),mots.get(i+1), ordre)) {
					ech = mots.get(i);
					mots.remove(i);
					mots.add(i+1,ech);
					permut=true;
				}
			}
		}
	}
	public static void main (String texte, List<Character> ordre) {
		 List<String> mots = new ArrayList<>();
		 mots=extractWords(texte);
		 Tribulle(mots, ordre);
		 System.out.println(mots.toString());
	}
	
	
}
	
	
	

