package app;

import javax.swing.JButton;

public class Card {
	
	private int value;
	private String adress;
	private String a="A";
	private JButton button;
	
	
	
	public Card(int value, String adress) {
		super();
		this.value = value;
		this.adress = adress;
		this.button=new JButton();
	}


	

	public JButton getButton() {
		return button;
	}




	public void setButton(JButton button) {
		this.button = button;
	}




	public int getValue() {
		return value;
	}



	public void setValue(int value) {
		this.value = value;
	}



	public String getAdress() {
		return adress;
	}



	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	
	
	
	
	
	

}
