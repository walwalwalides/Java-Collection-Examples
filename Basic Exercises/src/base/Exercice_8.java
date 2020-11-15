package base;

import java.util.Scanner;

public class Exercice_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1->7  lundi..dimanche

		 System.out.println("Donner un numbre entier : ");

		 Scanner scan=new Scanner(System.in);
			
			
			int y=scan.nextInt();

			
			switch (y)
			{
			
		
			case 1 : System.out.println("Le jour correcpendant est  Lundi"); break;
			case 2 : System.out.println("Le jour correcpendant est  Mardi"); break;
			case 3 : System.out.println("Le jour correcpendant est  Mecredi"); break;
			case 4 : System.out.println("Le jour correcpendant est  Jeudi"); break;
			case 5 : System.out.println("Le jour correcpendant est  Vendredi"); break;
			case 6 : System.out.println("Le jour correcpendant est  Samdi"); break;
			case 7 : System.out.println("Le jour correcpendant est  Dimanche"); break;
			
//			default :System.out.println("Le numbre doit etre entre 1 et 7 ");
			
			
			}
			

			
		
	}

}
