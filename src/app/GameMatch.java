package app;

import java.util.ArrayList;

public class GameMatch {
	private ArrayList<Card> selected;
	private boolean isGameOn;
	private boolean isTwoSelected;
	private Deck deck;
	private int score=0;
	
	
	public GameMatch(boolean start ) {
		super();
		
		this.isGameOn = false;
		
	}
	
	
	
	
	public GameMatch( ) {
		super();
		this.selected = new ArrayList<Card> ();
		this.isGameOn = true;
		this.isTwoSelected = false;
		this.deck = new Deck();
		this.score = 0;
	}

	
	
	
	

	public Deck getDeck() {
		return deck;
	}






	public void setDeck(Deck deck) {
		this.deck = deck;
	}






	public boolean isGameOn() {
		return isGameOn;
	}


	public void setGameOn(boolean isGameOn) {
		this.isGameOn = isGameOn;
	}




	public int clickOnCard(int br) {
		if(isTwoSelected==true) {
			selected.add(deck.getCards().get(br));
			
			if(selected.get(0).getValue()==selected.get(1).getValue()) {
				score++;
				//-------------------Ako su iste
				return 1; 
			}else {
				//-------------------Ako nisu iste
				return -1;
			}
		}else {
			//---------------------Ako je prva
			selected.add(deck.getCards().get(br));
			return 0;
		}
	}

}
