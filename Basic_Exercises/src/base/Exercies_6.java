package base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercies_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	List<Integer> languages = new ArrayList<>();

	for(int i=1 ;i<10;i++)
	{
		languages.add(i);
		
	};

//	ArrayList<Integer> finals = new ArrayList<>();

	List<Integer> finals = languages.subList(2, 5);
			
	
	System.out.println(finals);
	
	
	}

}
