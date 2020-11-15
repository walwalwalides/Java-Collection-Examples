package base;

import java.util.ArrayList;
import java.util.Collections;

public class Exercice_4 {

	public static void main(String[] args) {

		ArrayList<String> languages = new ArrayList<>();

		languages.add("PHP");
		languages.add("Java");
		languages.add("C++");
		languages.add("Python");

		ArrayList<String> frameworks = new ArrayList<>();

		frameworks.add("Spring");
		frameworks.add("Hibernate");
		frameworks.add("Laravel");
		frameworks.add("Symfony");

//		Languages: [Spring, Hibernate, Laravel, Symfony] 
//		Frameworks: [Spring, Hibernate, Laravel, Symfony]

//		languages=frameworks;
		
		Collections.copy(languages,frameworks );
		
		System.out.println("Languages: " + languages);

		System.out.println("Frameworks: " + frameworks);

	}

}
