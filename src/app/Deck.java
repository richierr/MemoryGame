package app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Random;

public class Deck {
	ArrayList<Card> cards = new ArrayList<>();
	
	
	
	
	
	

	public ArrayList<Card> getCards() {
		return cards;
	}




	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}




	public Deck() {
		super();
		this.cards = shuffleMake();
	}




	private ArrayList<Card> makeDeck() {

		ArrayList<Card> result = new ArrayList<>();
		Properties prop = new Properties();
		try (InputStream in = new FileInputStream("card.properties")) {
			prop.load(in);

		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		}

		for (int i = 0; i < 12; i++) {
			Card c = new Card((i + 1), prop.getProperty(Integer.toString((i + 1))));
			result.add(c);
		}
		
		for(int i=0; i<12;i++) {
			int c=11;
			result.add(result.get(i));
			
		}

		return result;
	}

	
	
	
	private ArrayList<Card> shuffleMake() {
		ArrayList<Card> inputList=makeDeck();
		Random rand = new Random();
		Card c;
		for (int i = 0; i < inputList.size(); i++) {
			int tempIndex = rand.nextInt(inputList.size());
			c = inputList.get(tempIndex);
			inputList.set(tempIndex, inputList.get(i));
			inputList.set(i, c);

		}
		return inputList;

	}

}
