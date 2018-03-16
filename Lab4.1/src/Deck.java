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
	
	public Card Deal() {
		while ( isEmpty()) {
			Dealt.add(unDealt.get(0)) ;
			unDealt.remove(0) ; 
			return Dealt.get(Dealt.size()-1); 
		}
		return null ; 
	}
	public void shuffle() {
		while(Dealt.size() != 0 ) {
			unDealt.add(Dealt.get(0)) ; 
			Dealt.remove(0) ; 
		}
		//Swap Method Here
		
	}
}
