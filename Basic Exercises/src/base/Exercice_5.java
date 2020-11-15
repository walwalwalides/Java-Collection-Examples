package base;

import java.util.ArrayList;
import java.util.Collections;

public class Exercice_5 {

	
	
	
	
	
	
	public static void main(String[] args) {
		
			
		ArrayList<String> languages = new ArrayList<>();

		languages.add("PHP");
		languages.add("Java");
		languages.add("C++");
		languages.add("Python");
		
		Collections.shuffle(languages);

		
		System.out.println(languages);
		
		
		

	}

}
