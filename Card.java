package Naya_Tan_Lab2;

public class Card {
	
    String suit;
    int value;
    String valueString;

    public Card(int value, String suit){
    	this.suit = suit;
    	this.value = value;
    }

    public String toString() { 
        switch (this.value) {
        case 1:
            valueString = "Ace";
            break;
        case 11:
        	valueString = "Jack";
            break;
        case 12:
        	valueString = "Queen";
            break;
        case 13:
        	valueString = "King";
            break;
        default:
        	valueString = String.valueOf(this.value);
            break;
            }
      
        return ( valueString + " of " +  this.suit); 
    }
}
