
package cst250assignment03;

/**
 *
 * @author ssyed
 */
public final class BankAccount {
    private double balance;

	public BankAccount() {
		setBalance(0);
	} // constructor

	public void setBalance(double balance) {
		this.balance = balance;
		System.out.println(
          "New balance now: "+ getBalance());
	}
  
  public double getBalance() {
 		return balance; 
	} 
  public void deposit(double amt) {
		setBalance(getBalance() + amt);
	}

	public void withdraw(double amt) {
		if(getBalance() < amt) {
			amt = getBalance();
            System.out.println
                ("Can only withdraw " + amt); 
      }
		
	}
} 
    

