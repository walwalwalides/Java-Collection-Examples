package BestSum;

import java.util.HashMap; 


class GFG { 
	

	static class pair { 
		int first, second; 
		public pair(int first, int second) 
		{ 
			this.first = first; 
			this.second = second; 
		} 
	} 
}

public class bestsum {
	
	
	// A hashing based Java program to find 
	// if there are four elements with given sum. 



		// The function finds four elements 
		// with given sum X 
		static void findFourElements(int arr[],int X) 
		{ 
			int n = arr.length; 
			
			// Store sums of all pairs in a hash table 
			HashMap<Integer, GFG.pair> mp 
				= new HashMap<Integer, GFG.pair>(); 
			for (int i = 0; i < n - 1; i++) 
				for (int j = i + 1; j < n; j++) 
					mp.put(arr[i] + arr[j], new GFG.pair(i, j)); 

			// Traverse through all pairs and search 
			// for X - (current pair sum). 
			for (int i = 0; i < n - 1; i++) { 
				for (int j = i + 1; j < n; j++) { 
					int sum = arr[i] + arr[j]; 

					// If X - sum is present in hash table, 
					if (mp.containsKey(X - sum)) { 

						// Making sure that all elements are 
						// distinct array elements and an 
						// element is not considered more than 
						// once. 
						GFG.pair p = mp.get(X - sum); 
						if (p.first != i && p.first != j 
							&& p.second != i && p.second != j) { 
							System.out.print( 
								arr[i] + ", " + arr[j] + ", "
								+ arr[p.first] + ", "
								+ arr[p.second]); 
							return; 
						} 
					} 
				} 
			} 
		} 
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = { 1, 2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32}; 
		
		int X = 115; 
		
		// Function call 
		findFourElements(arr,X); 
		
		

	}	

}
