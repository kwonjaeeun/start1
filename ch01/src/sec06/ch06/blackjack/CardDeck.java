package sec06.ch06.blackjack;

public class CardDeck {
public final static String[] patterns= {"Spade","Heart","Diamond","Club"};
public final static String[] symbole= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};

	private final Card[] DECK;
	
	public CardDeck(){
		DECK= new Card[patterns.length*symbole.length];
		for(int i=0;i<DECK.length;i++) {
			DECK[i]= new Card(patterns[(int)(i/symbole.length)],symbole[i%symbole.length]);
		}
	}
	
	public void print() {
		for(int i=0;i<DECK.length;i++) {
			System.out.println(this.DECK[i]);
		}
	}

	public Card getOneCard() {
		int rand;
		do{
			rand = (int)(Math.random()*DECK.length);
		}while(this.DECK[rand]==null); 
		
		Card c = this.DECK[rand];
		this.DECK[rand]=null;
		return c;
	}
	/*
	 * private boolean chk_empty() { boolean if() { return true; } }
	 */

	public void printAll() {
		for(int i=0; i<DECK.length;i++) {
			System.out.println(DECK[i]);
		}
		
		/*
		 * for(Card c:DECK) { System.out.println(c); }
		 */
	}
		
}


