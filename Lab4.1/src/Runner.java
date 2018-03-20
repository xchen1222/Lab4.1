
public class Runner {

	public static void main(String[] args) {
		
		String[] Rank = {"2" , "3" , "4" ,"5", "6" , "7" , "8", "9" , "10", "J" , "Q","K", "A" } ; 
		String[] Suit = {"Diamond" , "Clover" , "Heart", "Spades" } ; 
		int[] pointValue = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15} ; 
		
		Card C1 = new Card ("Ace", "Ace", 1) ;
		System.out.println(C1);
		Deck D1 = new Deck (Rank , Suit , pointValue) ; 
		
		D1.Deal() ; 
	}	

}
