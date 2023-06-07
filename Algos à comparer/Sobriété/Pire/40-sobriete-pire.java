package exercice;

import java.util.ArrayList;
import java.util.List;

public class Exercice {

public static List<String> solution(String str, List <Character> ordre) {
		
	String[] tabMot = new String[1000000000];
	String[] tabMotTaille;
	List<String> listeMot = new ArrayList<>();
	tabMot = str.split("[^a-zA-Z0-9]+");
	tabMotTaille = str.split("[^a-zA-Z0-9]+");

	for (int i = 0; i <tabMotTaille.length ; i++) {
	    String mot = tabMot[i];
	    listeMot.add(mot);
	}
	
	List<String> listeMot2 = new ArrayList<>();
	for (int i=0; i<listeMot.size(); i++) {
		listeMot2.add(listeMot.get(i));
	}


	List<String> listeMotTrie = new ArrayList<>();

	for (int i = 0; i < ordre.size(); i++) {
	    String debut = ordre.get(i).toString();
	    for (int j = 0; j < listeMot.size(); j++) {
	        if (listeMot.get(j).startsWith(debut)) {
	            listeMotTrie.add(listeMot.get(j));
	            listeMot.remove(listeMot.get(j));
	            j--;
	        }
	    }
	}

	for (int i = 0; i < listeMot.size(); i++) {
	    listeMotTrie.add(listeMot.get(i));
	}

	return listeMotTrie;
	
	
	
	
	
	}


}
