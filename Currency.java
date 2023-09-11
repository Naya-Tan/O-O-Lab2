package Naya_Tan_Lab2;

public enum Currency {
	
	ONE_HUNDRED("Hundreds", "Hundred", 100.00),
	TWENTIES("Twenties", "Twenty", 20.00),
	TENS("Tens", "Ten", 10.00),
	FIVES("Fives", "Five", 5.00),
	ONES("Ones", "One", 1.00),
	FIFTY_CENT_PIECES("Fifty-Cent Pieces", "Fifty-Cent Piece", 0.5),
	DIMES("Dimes", "Dime", 0.1), 
	NICKELS("Nickles", "Nickel", 0.05), 
	PENNIES("Pennies", "Penny", 0.01);
	
	private final String pluralLabel;
	private final String singularLabel;
	private final double value; 
	
	private Currency(final String plural, final String singular, final double amount) {
		this.pluralLabel = plural;
		this.singularLabel = singular;
		this.value = amount;
	}

	
	public String getSingular() {
		return singularLabel;
	}
	
	public String getPlural() {
		return pluralLabel;
	}
	
	public double getValue() {
		return value;
	}
	

}
