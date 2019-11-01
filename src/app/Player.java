package app;

import java.util.Comparator;

public class Player {
	private String name;
	private int score;
	
	
	
	
	
	
	public Player(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}

}
class MyComparatorForScore implements Comparator<Player>{

	@Override
	public int compare(Player p1, Player p2) {
		if(p1.getScore()>p2.getScore()) {
			return -1;
					
		}else {
		return 01;
		}
	}
	
}