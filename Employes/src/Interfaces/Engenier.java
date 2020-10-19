package Interfaces;

public class Engenier extends Employer{
	private String voiture;

	public Engenier(String name, int matricule, double salaire, String voiture) {
		super(name, matricule, salaire);
		this.voiture = voiture;
	}

	@Override
	public String toString() {
		return "Engenier [name=" + name + ", matricule=" + matricule + ", salaire=" + salaire +", voiture=" + voiture +  "]";
	}

    @Override
    public void travailler() {
    	System.out.println("je travailles 6 heures par jour.");
    }
	

}
