package BehavioralDesgnPatterns.ChainOfResponsibility;

// Generally suitable for working with a single handler
// Doesn't know that the handler is part of the chain
public class Account {
	
	private Integer number;
	private String owner;
	private Double accountBalance;
	
	Account(final Integer number, final String owner, final Double accountBalance) {
		this.number = number;
		this.owner = owner;
		this.accountBalance = accountBalance;
	}
	
	Integer getNumber() {
		return number;
	}
	
	String getOwner() {
		return owner;
	}
	
	Double getAccountBalance() {
		return accountBalance;
	}
	
}
