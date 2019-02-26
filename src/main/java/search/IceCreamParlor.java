package search;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Set;

public class IceCreamParlor {

	static void whatFlavors(int[] cost, int money) {

		int firstFlavor = 0;
		int secondFlavor = 0;
		
		Hashtable<Integer, Integer> costHashtable = new Hashtable<>();

		for(int i = 0; i < cost.length; i++) {
			int complement = money - cost[i];
			if(costHashtable.containsKey(complement)) {
				firstFlavor = costHashtable.get(complement) + 1;
				secondFlavor = i + 1;
				break;
			}
			costHashtable.put(cost[i], i);
		}
		
		System.out.println(firstFlavor + " " + secondFlavor);
    
	}
	
}
