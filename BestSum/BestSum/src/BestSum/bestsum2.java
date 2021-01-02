package BestSum;
import java.util.*; 

public class bestsum2 {
	
	
	
	
}
	
	
	class fourElementWithSum { 

		// Function to find 4 elements that add up to 
		// given sum 
		public static void fourSum(int X, int[] arr, 
								Map<Integer, pair> map) 
		{ 
			int[] temp = new int[arr.length]; 

			// Iterate from 0 to temp.length 
			for (int i = 0; i < temp.length; i++) 
				temp[i] = 0; 

			// Iterate from 0 to arr.length 
			for (int i = 0; i < arr.length - 1; i++) { 

				// Iterate from i + 1 to arr.length 
				for (int j = i + 1; j < arr.length; j++) { 

					// Store curr_sum = arr[i] + arr[j] 
					int curr_sum = arr[i] + arr[j]; 

					// Check if X - curr_sum if present 
					// in map 
					if (map.containsKey(X - curr_sum)) { 

						// Store pair having map value 
						// X - curr_sum 
						pair p = map.get(X - curr_sum); 

						if (p.first != i && p.sec != i 
							&& p.first != j && p.sec != j 
							&& temp[p.first] == 0
							&& temp[p.sec] == 0 && temp[i] == 0
							&& temp[j] == 0) { 

							// Print the output 
							System.out.printf( 
								"%d,%d,%d,%d", arr[i], arr[j], 
								arr[p.first], arr[p.sec]); 
							temp[p.sec] = 1; 
							temp[i] = 1; 
							temp[j] = 1; 
							break; 
						} 
					} 
				} 
			} 
		} 

		// Program for two Sum 
		public static Map<Integer, pair> twoSum(int[] nums) 
		{ 
			Map<Integer, pair> map = new HashMap<>(); 
			for (int i = 0; i < nums.length - 1; i++) { 
				for (int j = i + 1; j < nums.length; j++) { 
					map.put(nums[i] + nums[j], new pair(i, j)); 
				} 
			} 
			return map; 
		} 

		// to store indices of two sum pair 
		public static class pair { 
			int first, sec; 

			public pair(int first, int sec) 
			{ 
				this.first = first; 
				this.sec = sec; 
			} 
		} 


	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = { 1, 2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32}; 
		int X = 52; 
		Map<Integer, pair> map = twoSum(arr); 
		
		// Function call 
		fourSum(X, arr, map); 

	}

}
