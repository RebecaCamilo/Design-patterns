package BehavioralDesgnPatterns.ChainOfResponsibility;

// The interface declares a method to build the tractor chain
// It also declares a method to execute a request
public interface HandlePayments {
	void setNextHandle(HandlePayments tratador);
	Boolean handlePaymentsBase(Account request);
	
}
