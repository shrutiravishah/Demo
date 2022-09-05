import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

class FindAnagrams {
	//create and check if anagram is applicable or not
	public static int sherlockAndAnagrams(String s) {
		int pair = 0;
		Map<String, Integer> map = new HashMap<>();
		int currentPair = 1;
		
		//Create pair of characters till the length of the string
		while(currentPair!= s.length()) {
			
			//To traverse till the length of the string
			for(int i = 0;i<s.length();i++) {
				
				//Check whether its causing StrinOutOfBoundException 
				if((i+currentPair) <= s.length()) {
					
					//create substring
					String subString = s.substring(i, i+currentPair);
					
					//Converting substring to character array and sort 
					char[] array = subString.toCharArray();
					Arrays.sort(array);
					
					//Converting sorted array to string
					String sorted = String.valueOf(array);
					
					// check if map consist the given pair
					if(map.containsKey(sorted)) {
						//increment map value by 1
						map.put(sorted,map.get(sorted)+1);
					} else {
						//pair as new key and assign value as 1
						map.put(sorted,1);
					}
				}// closing of if
			} // closing of for
			currentPair++;
		} // closing of while
		
		// Put all pair in map and loop to get total number of pairs
		for(Entry<String,Integer> data : map.entrySet()) {
			pair += data.getValue() * (data.getValue() - 1)/2;
		}
		return pair;
	} // e=closing of function

} //closing of class

public class Anagrams {
	 public static void main(String[] args) {
		 
		 
		 Scanner sc = new Scanner(System.in);
		 int totalPair = sc.nextInt();
		 for(int i=0;i<totalPair;i++)
		 {
			 String str = sc.next().trim();
			 System.out.println(FindAnagrams.sherlockAndAnagrams(str));
		 }
	 }
}
