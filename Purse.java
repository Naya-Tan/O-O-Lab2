package Naya_Tan_Lab2;

public class Purse {
	
	private int one100s;
	private int twenties;
	private int tens;
	private int fives;
	private int ones;
	private int fiftyCPs;
	private int dimes;
	private int nickels;
	private int pennies;
	
	
	Currency my100 = Currency.ONE_HUNDRED;
	Currency my20s = Currency.TWENTIES;
	Currency my10s = Currency.TENS;
	Currency my5s = Currency.FIVES;
	Currency my1s = Currency.ONES;
	Currency myFiftyCPs = Currency.FIFTY_CENT_PIECES;
	Currency myDimes = Currency.DIMES;
	Currency myNickels = Currency.NICKELS;
	Currency myPennies = Currency.PENNIES;
	
	public Purse(){
		this.one100s = 0;
		this.twenties = 0;
		this.tens = 0;
		this.fives = 0;
		this.ones = 0;
		this.fiftyCPs = 0;
		this.dimes = 0;
		this.nickels = 0;
		this.pennies = 0;
	}
	
	// setters
	public void set100s(int hundreds) {
		this.one100s = hundreds;
	}
	
	public void setTwenties(int twenties) {
		this.twenties = twenties;
	}
	
	public void setTens(int tens) {
		this.tens = tens;
	}
	
	public void setFives(int fives) {
		this.fives = fives;
	}
	
	public void setOnes(int ones) {
		this.ones = ones;
	}
	
	public void setFiftyCPs(int fiftyCPs) {
		this.fiftyCPs = fiftyCPs;
	}
	
	public void setDimes(int dimes) {
		this.dimes = dimes;
	}
	
	public void setNickels(int nickels) {
		this.nickels = nickels;
	}
	
	public void setPennies(int pennies) {
		this.pennies = pennies;
	}
	
	// getters
	public int get100s() {
		return this.one100s;
	}
	
	public int getTwenties() {
		return this.twenties;
	}

	public int getTens() {
		return this.tens;
	}

	public int getFives() {
		return this.fives;
	}

	public int getOnes() {
		return this.ones;
	}

	public int getFiftyCPs() {
		return this.fiftyCPs;
	}

	public int getDimes() {
		return this.dimes;
	}

	public int getNickels() {
		return this.nickels;
	}

	public int getPennies() {
		return this.pennies;
	}
	
	// this should return the amount of money the purse is currently holding 
	public double cashTotal() {
		double total = (this.get100s() * my100.getValue()) + (this.getTwenties() * my20s.getValue()) + (this.getTens() * my10s.getValue()) + 
				(this.getFives() * my5s.getValue()) + (this.getOnes() * my1s.getValue()) + (this.getFiftyCPs() * myFiftyCPs.getValue())  + 
				(this.getDimes() * myDimes.getValue()) + (this.getNickels() * myNickels.getValue()) + (this.getPennies() * myPennies.getValue());
		
		double test = (this.getTwenties() * my20s.getValue());
		return total;
	}
}
