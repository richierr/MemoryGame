package app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class GameMatch {
	private ArrayList<Card> selected;
	private boolean isGameOn;
	private boolean isTwoSelected;
	private Deck deck;
	private Long score=(long) 0;
	private Window frame;
	
	private ArrayList<Card> matched;
	
	
	     
	
	
	public Window getFrame() {
		return frame;
	}


	public Long getScore() {
		return score;
	}


	public void setScore(Long score) {
		this.score = score;
	}




	public GameMatch(boolean start, Window frame ) {
		super();
		this.frame=frame;
		this.isGameOn = false;
		
	}
	
	
	
	
	public GameMatch( Window frame) {
		super();
		this.deck = new Deck();
		this.frame=frame;
		this.selected = new ArrayList<Card> ();
		this.isGameOn = true;
		this.isTwoSelected = false;
		this.score = (long) 0;
		this.matched=new ArrayList<Card>();
		putButtons();
		for(Card c:deck.getCards()) {
			c.getButton().addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					if(GameMatch.this.isGameOn()) {
						if(selected.size()==2) {
							eraseButtons();
							selected.clear();
						}
						
						Icon icon1 = new ImageIcon(c.getAdress());
						c.getButton().setIcon(icon1);
						int rez=GameMatch.this.clickOnCard(c);
						
						if(rez==1) {
							eraseButtons();
						}else if(rez==-1) {
							

						}else {
							
						}
						if(matched.size()==12) {
							
							frame.getStopwatch().cancel(true);
							score=frame.getStopwatch().getScore();
							
							
							String playersName = JOptionPane.showInputDialog("Input your name");
							
							frame.getTopLista().add(new Player(playersName, Math.toIntExact(score)));
							frame.getBtnStartGame().setText("Start game");
							isGameOn=false;
							removeButtons();
						}
						
					}

				}
			});

		}
		
	}

	
	
	
	
	
	private void putButtons() {
		
		for(Card c:deck.getCards()) {
			this.frame.getJpanelZaTabelu().add(c.getButton());
		}
	}
	
	
	public void removeButtons() {
		for(Card c:deck.getCards()) {
			this.frame.getJpanelZaTabelu().remove(c.getButton());
		}
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
	
	public void eraseButtons() {
		ArrayList<Card> tempDeck=new ArrayList<Card>(deck.getCards());
		tempDeck.removeAll(matched);
		for(Card c:tempDeck) {
			c.getButton().setIcon(null);
		}
		
	}
	
	




	public int clickOnCard(Card c) {
		//-------------------------------------Ako je druga
		if(isTwoSelected==true) {
			selected.add(c);
			
			if(selected.get(0).getValue()==selected.get(1).getValue()) {
				
				//-------------------Ako su iste
				
				
				isTwoSelected=false;
				matched.add(selected.get(0));
				matched.add(selected.get(1));
				
				return 1; 
			}else {
				//-------------------Ako nisu iste
				isTwoSelected=false;
				
				
				
				return -1;
			}
			
			
		}else {
			//---------------------Ako je prva
			selected.add(c);
			isTwoSelected=true;
			return 0;
		}
	}

}
