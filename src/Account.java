import java.util.*;

public class Account {

	int accountId;
	double balance;
	double annualInterestRate;
	Date date = new Date();
	
	//Constructor with no args.
	Account(){}
	
	//Constructor with 3-args.
	Account(int newAccountId, double newBalance, double newAnnualInterestRate)
	{
		setAccountId(newAccountId);
		setBalance(newBalance);
		setAnnualInterestRate(newAnnualInterestRate);
	}
	
	//Returns account id.
	public int getAccountId(){
		return accountId;
	}
	
	//Sets account Id.
	public void setAccountId(int newAccountId){
		accountId = newAccountId;
	}
	
	//Returns balance.
	public double getBalance(){
		return balance;
	}
	
	//Sets balance.
	public void setBalance(double newBalance){
		balance = newBalance;
	}
	
	//Returns interest rate.
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	
	//Sets interest rate.
	public void setAnnualInterestRate(double newAnnualInterestRate){
		annualInterestRate = newAnnualInterestRate;
	}
	
	//Returns current date.
	public Date getDate(){
		return date;
	}
	
	//Returns monthly interest rate.
	public double getMonthlyInterestRate(){
		return annualInterestRate/12;
	}
	
	//Withdraw money form current balance.
	public void withdraw(double balance, double withdrawAmount){
		balance = balance - withdrawAmount;
		setBalance(balance);
	}
	
	//Deposit money to account for an integer.
	public void deposit(double balance, int depositAmount){
		balance = balance + depositAmount;
		setBalance(balance);
	}
	
	
	//Deposit
	public void deposit(double depositAmount){
		setBalance(getBalance() + depositAmount);
	}
}
