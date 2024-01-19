package BehavioralDesgnPatterns.ChainOfResponsibility;

public class DriverChainOfResponsibility {
	
	public static void main(String[] args) {
		
		Account account = new Account(123, "Ana", 0.0);
		Account accountNumberError = new Account(-123, "Ana", 0.0);
		Account accountBalanceError = new Account(123, "Ana", 10.0);
		
		System.out.println("Trying to close account:");
		closeAccount(account);
		System.out.println("Trying to close accountBalanceError:");
		closeAccount(accountBalanceError);
		System.out.println("Trying to close accountNumberError:");
		closeAccount(accountNumberError);
	}
	
	public static HandlePayments chainOfHandlesPayments() {
		HandlePayments handlePayments = new VerifyNumberHandle();
		handlePayments.setNextHandle(new VerifyOwnerHandle());
		handlePayments.setNextHandle(new VerifyAccountBalanceHandle());
		return handlePayments;
	}
	
	public static boolean veriryAccount(Account account, HandlePayments handlePayments) {
		if (handlePayments.handlePaymentsBase(account) == null) { //verify if handlePaymentsBase returns null
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}
	
	public static void closeAccount(Account account) {
		if (veriryAccount(account, chainOfHandlesPayments())) {
			System.out.println("Account closed!\n");
		} else {
			System.out.println("Account can't be closed\n");
		}
	}
	
}
