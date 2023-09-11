package Naya_Tan_Lab2;

import java.io.PrintStream;

public class Register {
	
	PrintStream out = System.out;	

	private final int one100s = 0;
	private final int twenties = 10;
	private final int tens = 20;
	private final int fives = 20;
	private final int ones = 20;
	private final int fiftyCPs = 10;
	private final int dimes = 20;
	private final int nickels = 20;
	private final int pennies = 20;
	
	private int[] currency = new int[9]; // (0 means 100s etc)
	
	// when the register is initialized it should contain all of these 
	public Register(){
		this.currency[0] = this.one100s; 
		this.currency[1] = this.twenties;
		this.currency[2] = this.tens;
		this.currency[3] =this.fives; 
		this.currency[4] =this.ones;
		this.currency[5] = this.fiftyCPs; 
		this.currency[6] = this.dimes; 
		this.currency[7] = this.nickels;
		this.currency[8] = this.pennies;
	}
	
	// restock register to original amount of money and returns what was taken out 
	public double restock() {
		double total = currency[0] * Currency.ONE_HUNDRED.getValue() + 
					   currency[1] * Currency.TWENTIES.getValue() +
				       currency[2] * Currency.TENS.getValue() +
				       currency[3] * Currency.FIVES.getValue() +
				       currency[4] * Currency.ONES.getValue() +
				       currency[5] * Currency.FIFTY_CENT_PIECES.getValue() +
				       currency[6] * Currency.DIMES.getValue() +
				       currency[7] * Currency.NICKELS.getValue() +
				       currency[8] * Currency.PENNIES.getValue();
		
		this.currency[0] = this.one100s; 
		this.currency[1] = this.twenties;
		this.currency[2] = this.tens;
		this.currency[3] =this.fives; 
		this.currency[4] =this.ones;
		this.currency[5] = this.fiftyCPs; 
		this.currency[6] = this.dimes; 
		this.currency[7] = this.nickels;
		this.currency[8] = this.pennies;
		
		if ((total - 527.2) < 0) {
			total = 0;
		}else {
			total = total - 527.2;
		}
		
		return total;
	}
	
	
	public double empty() {
		
		double total = currency[0] * Currency.ONE_HUNDRED.getValue() + 
				   currency[1] * Currency.TWENTIES.getValue() +
			       currency[2] * Currency.TENS.getValue() +
			       currency[3] * Currency.FIVES.getValue() +
			       currency[4] * Currency.ONES.getValue() +
			       currency[5] * Currency.FIFTY_CENT_PIECES.getValue() +
			       currency[6] * Currency.DIMES.getValue() +
			       currency[7] * Currency.NICKELS.getValue() +
			       currency[8] * Currency.PENNIES.getValue();
	
		// empty the register 
		this.currency[0] = 0;
		this.currency[0] = 0;
		this.currency[1] = 0;
		this.currency[2] = 0;
		this.currency[3] = 0; 
		this.currency[4] = 0;
		this.currency[5] = 0; 
		this.currency[6] = 0; 
		this.currency[7] = 0;
		this.currency[8] = 0;
		
		return total;
		
	}
	
	public static double getRemainder(double value, double amount) {
		return (value % amount);
	}
	
	public static int getAmount(double value, double amount) {
		return (int)(value / amount);
	}
	
	// cash in is the money being paid ( or however much money is in the purse )
	public Purse makeChange(Purse cashIn, double price) {
		
		Purse moneyBack = new Purse();
		
		// if cash in is less than the price then return cash in 
		if(cashIn.cashTotal() < price) {
			return cashIn;
		}else {
			
			// find the change needed 
			double change = cashIn.cashTotal() - price;
			
			// put the money from the purse into the register
			this.currency[0] += cashIn.get100s();
			this.currency[1] += cashIn.getTwenties();
			this.currency[2] += cashIn.getTens();
			this.currency[3] += cashIn.getFives();
			this.currency[4] += cashIn.getOnes();
			this.currency[5] += cashIn.getFiftyCPs();
			this.currency[6] += cashIn.getDimes();
			this.currency[7] += cashIn.getNickels();
			this.currency[8] += cashIn.getPennies();
		
			
			int [] changeList = new int[9];
			double[] monetaryValues = {100, 20, 10, 5, 1, 0.50, 0.10, 0.05, 0.01};
			
			for (int i = 0; i < monetaryValues.length; i++) {
				int amountNeeded = getAmount(change, monetaryValues[i]);
				double remainder = getRemainder(change, monetaryValues[i]);
				change = remainder;
				changeList[i] = amountNeeded;
				this.currency[i] -= amountNeeded; // subtract the bill from the register 
			}
			
			
			
			// set moneyBack
			moneyBack.set100s(changeList[0]);
			moneyBack.setTwenties(changeList[1]);
			moneyBack.setTens(changeList[2]);
			moneyBack.setFives(changeList[3]);
			moneyBack.setOnes(changeList[4]);
			moneyBack.setFiftyCPs(changeList[5]);
			moneyBack.setDimes(changeList[6]);
			moneyBack.setNickels(changeList[7]);
			moneyBack.setPennies(changeList[8]);
			
			
			return moneyBack;

	}
	}
	
}

