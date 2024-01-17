package BehavioralDesgnPatterns.Strategy;

public class DriverStrategy {
	
	public static void main(String[] args) {
		
		Double value = 100.0;
		
		PayStrategy strategyCash = new Cash();
		PayStrategy strategyCreditCard = new CreditCard();
		PayStrategy strategyDebitCard = new DebitCard();
		
		System.out.println("cash: " + strategyCash.pay(value));
		System.out.println("debit: " + strategyDebitCard.pay(value));
		System.out.println("credit: " + strategyCreditCard.pay(value));
	
	}
}
