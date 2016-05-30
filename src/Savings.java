
public class Savings extends Account {
	
	Savings(int newAccountId, double balanceSav, double newAnnualInterestRate){
		super(newAccountId, balanceSav, newAnnualInterestRate);
	}
	
	//Handles overdraw of savings account.
	public void withdraw(double balanceSav, double withdrawAmount){
		
		double finalBalance =  getBalance() - withdrawAmount;
		//Checks if balance is below 0 and readjusts withdraw amount.
		if (finalBalance < 0)
		{
			System.out.println(getBalance());
			System.out.println("Withdraw amount exceeds available balance!");
			System.out.println("Withdraw amount changed to: " + getBalance());
			System.out.println("Current savings available balance: 0");
			balanceSav = 0;
			setBalance(balanceSav);
		}else{
			setBalance(finalBalance);
		}
	}
}//End of Savings class.
