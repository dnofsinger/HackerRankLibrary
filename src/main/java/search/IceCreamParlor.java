package search;

import java.util.Arrays;

public class IceCreamParlor {

	static void whatFlavors(int[] cost, int money) {

		int firstFlavor = 0;
		int secondFlavor = 0;
		
		//Look through array and find two flavors for the money.
		
		//Look for first flavor:
		for(int i = 0; i < cost.length - 1; i++) {
			for(int j = i + 1; j < cost.length; j++) {
				if(money == cost[i] + cost[j]) {
					firstFlavor = i + 1;
					secondFlavor = j + 1;
				}
			}
		}
		
		System.out.println(firstFlavor + " " + secondFlavor);
    }
	
}
