
public class SavingsAccount extends BankAccount{

	private double rate = 2.5;
	private int savingsNumber = 0; // hmm????
	private String accountNumber;
	
	public SavingsAccount(String name, double initialBalance) {
		super(name, initialBalance);
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
	public void postInterest() {
		rate = (rate/100) / 12;
		super.setBalance((getBalance() * rate) + getBalance());
	}
	@Override 
	public String getAccountNumber() {
		return accountNumber;
	}
	public SavingsAccount(SavingsAccount s, double balance) {
		super(s, balance);
		savingsNumber+=1;
		accountNumber = super.getAccountNumber()+"-"+savingsNumber; 
	}
}
