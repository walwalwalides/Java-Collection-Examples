package base;

import java.util.ArrayList;
import java.util.Collections;

import javax.print.DocFlavor.STRING;

public class Exercice_1 {

	public static void ordonerArray(ArrayList<STRING> a) {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> language = new ArrayList<>();

		language.add("PHP");
		language.add("Java");
		language.add("C++");
		language.add("Ada");
		// Avant sort
		System.out.println("Liste avant le tri: " + language);
		// Apres sort
		Collections.sort(language);
		System.out.println("Liste après le tri: " + language);
		
		
	}

}
