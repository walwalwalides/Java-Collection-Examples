package base;

public enum Day {
	MATIN(8,"Bonjour"),MIDI(12,"Bon appetit"),APRESMIDI(15,"Bonne apres midi"),SOIR(20,"Bon soir"),NUIT(23,"Bonne nuit");
	private int heure;
	private String message;
	Day(int heure,String message){
		this.heure=heure;
		this.message=message;
		}
	public int getHeure() {
		return heure;
	}
	public String getMessage() {
		return message;	
		
		
	}
	
	
	
}
