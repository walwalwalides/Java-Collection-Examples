package Interfaces;
public class Employer implements Horraire {
	
	protected String name;
	protected int matricule;	
	protected double salaire;
	
	
	
	//constructor Employer
	public Employer(String name, int matricule, double salaire) {
		super();
		this.name = name;
		this.matricule = matricule;
		this.salaire = salaire;
	}

	public Employer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMatricule() {
		return matricule;
	}
	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + matricule;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salaire);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employer other = (Employer) obj;
		if (matricule != other.matricule)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(salaire) != Double.doubleToLongBits(other.salaire))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Employer [name=" + name + ", matricule=" + matricule + ", salaire=" + salaire + "]";
	}
	
	//Methode summe 2
	
	
	static int  summe(int a,int b)
	{
		return a+b;
	}

	@Override
	public void travailler() {

     System.out.println("je travailles 8 heures par jour");		
	}
	
	
	
}
