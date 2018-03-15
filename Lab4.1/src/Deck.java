import java.util.ArrayList;

public class Deck {
	
	ArrayList<Card> unDealt;
	ArrayList<Card> Dealt;
	
	
	public  Deck(String[] Rank , String[] Suit, int[] pointValue) {
		for ( int i = 0 ; i < Rank.length-1 ; i++) {
			for ( int j = 0 ; j < Rank.length-1 ; j++) {
				unDealt.add(new Card(Rank[i] , Suit[j], pointValue[i]));
			}
		}
	}
	
	public boolean isEmpty() {
		if (unDealt.size() == 0 ) 
			return false; 
		return true;
	}
	
	public int size() {
		return unDealt.size(); 
	}
	
	public int deal() {
		while ( isEmpty()) {
			Card c1 = new Card ("J" , "Hearts" , 11) ; 
			System.out.println(c1);
			return 8 ;
		}
		return 7 ; 
	}
}
