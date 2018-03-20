import java.util.ArrayList;

public class Deck {
	
	ArrayList<Card> unDealt;
	ArrayList<Card> Dealt;
	
	
	public  Deck(String[] Rank , String[] Suit, int[] pointValue) {
		this.Dealt=new ArrayList<Card>() ;
		this.unDealt = new ArrayList<Card>(); 
		for ( int i = 0 ; i < Rank.length ; i++) {
			for ( int j = 0 ; j < Suit.length ; j++) {
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
		return Dealt.get(Dealt.size()-1); 
	}

	public void Swap(int pos1,int pos2) { //Jason Wu 
		Card card = unDealt.get(pos1);
		unDealt.set(pos1, unDealt.get(pos2));
		unDealt.set(pos2, card);
	}
		
	public void shuffle() {
		int x = Dealt.size();
		for (int i = 0; i < x; i++) {
			unDealt.add(Dealt.get(i));
			Dealt.remove(i);
		}
		for (int k = 51; k >= 0; k--) {
			int r = (int)(Math.random()*51);
			Swap(r,k);
		}
	}
}
