package base;

public class Exercice_10 {	
	
	
	
	
	//Switch with enum
	
	public static void main(String[] args) 
	
	{

	//Enum Moment	
	Moment mom= Moment.MATIN;	//Bonjour
	
	
	switch(mom)
	{
	case MATIN : System.out.println("Bonjour");break;
	case SOIR : System.out.println("Bonsoir ");break;
	case NUIT : System.out.println("Bonnuit");break;	
	
	}
	

	
	
	for (Moment myVar : Moment.values()) {
		  System.out.println(myVar);
		}

	
	
	
	
	

	

	
	
	
		
		
		
	}

}
