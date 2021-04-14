package exam;

public class CardDeck {
	
	private Card[] DECK= new Card[52];
	
	public CardDeck() {
		String[] patterns= { "Spades", "Hearts", "Diamonds", "Clubs"};
		String[]symbols= {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		int i=0;
		for(int p=0;p<patterns.length;p++) {
			for(int s=0;s<symbols.length;s++) {
				DECK[i++]=new Card(patterns[p],symbols[s]);
			}
		}
		
	}
	public void printall(){
		for(int i=0;i<DECK.length;i++) {
			System.out.println(DECK[i].toString());
		}
			
	}
}
