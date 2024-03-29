package BehavioralDesgnPatterns.ChainOfResponsibility;

public class VerifyOwnerHandle extends HandlePaymentsBase {
	@Override
	protected Boolean executeConcreteHandle(final Account account) {
		if (!account.getOwner().matches(".*[0-9].*")) {
			System.out.println("Passed owner validation");
			return Boolean.TRUE;
		}
		System.out.println("Owner name is invalid");
		return Boolean.FALSE;
	}
}
