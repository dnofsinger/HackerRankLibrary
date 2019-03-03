package sorting;

import java.util.Comparator;

class Player {
	String name;
	int score;

	Player(String name, int score) {
		this.name = name;
		this.score = score;
	}
}

class Checker implements Comparator<Player> {
  	// complete this method
	public int compare(Player a, Player b) {
		int result = 0;
		if(a.score > b.score) {
			result = -1;
		}else if(a.score == b.score) {
			//If the score is the same, then compare by Name
			return (a.name.compareTo(b.name)); 
			
		}else {
			result = 1;
		}
		return result;
    }
}
