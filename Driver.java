package Naya_Tan_Lab2;

import java.io.PrintStream;

public class Driver {
	
	public static void main(String[] args) {
		
		PrintStream out = System.out;		
		
		// testing purse
		Purse purse1 = new Purse();
		purse1.set100s(1);
		purse1.setTwenties(1);
		purse1.setTens(1);
		purse1.setFives(1);
		purse1.setOnes(1);
		purse1.setFiftyCPs(1);
		purse1.setDimes(1);
		purse1.setNickels(1);
		purse1.setPennies(1);
		out.println("This is the total amount in the purse");
		out.println(purse1.cashTotal());
		
		Purse purse2 = new Purse();
		Register register1 = new Register();
		purse2 = register1.makeChange(purse1, 130);
		out.println("Returned");
		out.println("Your change is " + purse2.cashTotal()); 
		out.println("Excess removed from the register " + register1.restock());
		out.println("Amount in the register before it was emptied " + register1.empty());
		
		Currency myCoin = Currency.FIFTY_CENT_PIECES;
		
		
		//System.out.println("I have 40 " + myCoin.getPlural());
	
		// testing everything in the Die class
		out.println("\nTesting the Die Class");
		Die dice1 = new Die();
		Die dice2 = new Die(10);
		dice1.roll();
		dice2.roll();
		out.println(dice1.toString());
		out.println(dice2.toString());
		out.println();
		
		//testing dice bag
		out.print("Testing Dice Bag");
		DiceBag bag1= new DiceBag();
		bag1.addDie(4, 2);
		bag1.addDie(6, 2);
		bag1.addDie(8, 2);
		bag1.addDie(10, 2);
		bag1.addDie(12, 2);
		bag1.addDie(20, 2);
		out.println(bag1.rollFours(4));
		out.println();
		out.println("Armageddon");
		out.print(bag1.Armageddon());
		
		// testing card
		out.println("\n\nTesting Card:");
		Card card1 = new Card(11, "Spades");
		out.println(card1.toString());
		
		//testing deck
		out.println("\nTesting Deck:");
		Deck deck1 = new Deck();
		out.println(deck1.draw());
		out.println(deck1.deal(5));
		
		Hand hand1 = new Hand();
		out.println();
		out.println("This is what is in the players hand");
		hand1.addCard(deck1.draw());
		hand1.addMulCards(deck1.deal(5));
		out.println(hand1.hand());
		out.println(hand1.toString());
		
		

		
	}
}
