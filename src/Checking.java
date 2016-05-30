
public class Checking extends Account{
	
	Checking(int newAccountId, double balanceChk, double newAnnualInterestRate){
		super(newAccountId, balanceChk, newAnnualInterestRate);
	}
	
	//Handles overdraw of -5000 plus.
	public void withdraw(double balanceChk, double withdrawAmount){
		
		double newBalance = balanceChk - withdrawAmount;
		//If balance is past -5000, sends out warning and adjusts withdraw amount.
		if (newBalance < -5000)
		{
			System.out.println("Overdraft limit reached!");
			withdrawAmount = (-5000 - balanceChk);
			System.out.println("Withdrawn amount changed to: " + withdrawAmount);
			setBalance(withdrawAmount);
			System.out.println("Current checking available balance: 0");
		}else{
			setBalance(newBalance);
		}
	}
}//End of Checking class.
