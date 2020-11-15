package base;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercice_3 {

	public static Integer[] evenTable(int [] tab)
	{
		ArrayList<Integer> tabouput = new ArrayList();

		for (int i=0 ;i<tab.length;i++)
		{
			if (tab[i] % 2==1)
			{
				tabouput.add(tab[i]);
			}			
			
		}		

		Integer [] stockArr = tabouput.toArray(new Integer[tabouput.size()]);		
		

		return stockArr;
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] tab = {1,3,2,4,5,6,7,8,9};

				System.out.println(Arrays.toString(evenTable (tab)));
		
	}

}
