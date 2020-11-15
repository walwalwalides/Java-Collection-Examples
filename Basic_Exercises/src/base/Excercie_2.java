package base;

import java.util.ArrayList;
import java.util.Collections;

public class Excercie_2 {	
	
	
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
		Collections.reverse(language);
		System.out.println("Liste après le tri: " + language);
		
		String wal="walid";
		String wa="s";
		wa+=wal;
		System.out.println(wa);
		
	}


}
