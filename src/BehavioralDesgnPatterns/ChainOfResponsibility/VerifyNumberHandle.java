package BehavioralDesgnPatterns.ChainOfResponsibility;

public class VerifyNumberHandle extends HandlePaymentsBase {
	
	@Override
	protected Boolean executeConcreteHandle(final Account account) {
		if (account.getNumber() > 0) {
			System.out.println("Passed number validation");
			return Boolean.TRUE;
		}
		System.out.println("Number is invalid");
		return Boolean.FALSE;
	}

}
