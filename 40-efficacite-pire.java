package exercice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import meilleur.EfficaciteMeilleur;

public class Exercice {

public static List<String> solution(String str, List <Character> ordre) {
	String[] tabMot;
	List<String> listeMot = new ArrayList<>();

	tabMot = str.split("[^a-zA-Z0-9]+");

	listeMot = Arrays.asList(tabMot);
	//melange la liste au hasard jusqu'a tomber sur le bon ordre
	while (!listeMot.equals(EfficaciteMeilleur.solution(str, ordre))) {
		Collections.shuffle(listeMot);
	}
	

	return listeMot;
}
}
