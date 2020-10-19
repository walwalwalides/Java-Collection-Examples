package Interfaces;
public class MainTest {

	public static void main(String[] args) {

		Employer e1 = new Employer("Morad", 1520, 620);
		Employer e2 = new Employer("Sami", 1200, 1020);
		Employer e3 = new Employer();
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3.toString());

		Engenier en1 = new Engenier("hamadi", 1502, 5000, "BMW");
		Engenier en2;
		e1 = en1;
//		System.out.println(en1);
		System.out.println(e1);
		
		System.out.println(Math.log(5));
		
		System.out.println(Employer.summe(1,2));

		
		en1.travailler();

		Horraire e4 = new Employer();
		
		//Add Comment 
		
		
		
		
	}

}
