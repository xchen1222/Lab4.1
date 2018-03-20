
public class Card {

	private String rank ; 
	private String suit ;
	private int pointValue ; 
	
	
	
	public Card (String rank , String suit , int pointValue) {
		this.rank = rank ; 
		this.suit = suit ; 
		this.pointValue = pointValue; 
	}



	public String getRank() {
		return rank;
	}



	public void setRank(String rank) {
		this.rank = rank;
	}



	public String getSuit() {
		return suit;
	}



	public void setSuit(String suit) {
		this.suit = suit;
	}



	public int getpointValue() {
		return pointValue;
	}



	public void setValue(int pointValue) {
		this.pointValue = pointValue;
	}


	
	public boolean equalsCard (Card A , Card B) {
		if (A.getpointValue() == (B.getpointValue())) 
			return false; 
		return true; 
	}


	public String toString() {
		return   "Card: " + getRank() + " of " + getSuit() + " " +getpointValue()   ; 
	}









/*Challenge 1: Card Class
	Fields:
		1. String rank(name of the card)
		2. String suit
		3. int pointValue
		
	Methods:
		1. Constructor (String rank, String suit, int pointValue)
		2. Getters for all three fields.
		3. public boolean equals(Card otherCard) //check if this card equals
		another in value.
		4. Public String toString() - return an appropriate string for this card
*/























}
