package LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Pattern;

public class CheeseInserter {
	
	//private = Sichtbarkeit ist auf die eigene Klasse beschr�nkt
	//static = unabh�ngig von einem Objekt, geh�rt zur Klasse
	// final = Wert der Variable bleibt nach initiallisierung unver�ndert
	private static final Pattern vegetables = Pattern.compile(
			"Zucchini|Paprikas?|Tomaten?|Zwiebeln?"
			);
	
	public static void insertCheeseAroundVegetables(List<String> ingredients) {
		//For Schleife mit iterator als Laufvariable
		for(ListIterator<String> iterator = ingredients.listIterator();
				iterator.hasNext();) {
			//auslesen der momantanen zutat
			String ingredient = iterator.next();
			//�berpr�fen, ob die Zutat zu unserem Vegetable Pattern passt
			if(vegetables.matcher(ingredient).matches()) {
				iterator.add("K�se");
			}
		}
	}
			

	public static void main(String[] args) {
		
		List<String>ingredients = new ArrayList<>();
		Collections.addAll(ingredients, "Gnocchis", "Zucchini", "Paprika", "Milch", "Zwiebeln");
		insertCheeseAroundVegetables(ingredients);;
		System.out.println(ingredients);
	}
}