import java.util.*;

public class TestAccount {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//Takes input for new checking account.
		System.out.println("Enter checking account number: ");
		int accountIdChk = input.nextInt();
		System.out.println("Enter checking account balance: ");
		double balanceChk = input.nextDouble();
		System.out.println("Enter the annaul interest rate for your checking account: ");
		double annualInterestRateChk = input.nextDouble();
		
		//Creates new checking account.
		Checking checkingAccount = new Checking(accountIdChk, balanceChk, annualInterestRateChk);
		
		//Takes input for new savings account.
		System.out.println("Enter savings account number: ");
		int accountIdSav = input.nextInt();
		System.out.println("Enter savings account balance: ");
		double balanceSav = input.nextDouble();
		System.out.println("Enter the annaul interest rate for your savings account: ");
		double annualInterestRateSav = input.nextDouble();
		
		//Creates new savings account.
		Savings savingsAccount = new Savings(accountIdSav, balanceSav, annualInterestRateSav);
		
		System.out.println("How much would you like to withdraw from your checking account?");
		double withdrawAmountChk = input.nextDouble();
		//Calls withdraw method.
		checkingAccount.withdraw(balanceChk, withdrawAmountChk);
		
		System.out.println("How much would you like to deposit into your checkin account?");
		double depositAmountChk = input.nextDouble();
		//Calls deposit method.
		checkingAccount.deposit(depositAmountChk);
		
		System.out.println("How much would you like to withdraw from your savings account?");
		double withdrawAmountSav = input.nextDouble();
		//Calls withdraw method
		savingsAccount.withdraw(balanceChk, withdrawAmountSav);
		
		System.out.println("How much would you like to deposit into your savings account?");
		double depositAmountSav = input.nextDouble();
		//Calls deposit method.
		savingsAccount.deposit(depositAmountSav);
		
		System.out.println("Current checking account balance: " + checkingAccount.getBalance());
		System.out.println("Checking account monthly inerest rate: " + checkingAccount.getMonthlyInterestRate() +"%");
		System.out.println("Checking account was created on: " + checkingAccount.getDate());
		
		System.out.println("Current savings account balance: " + savingsAccount.getBalance());
		System.out.println("Savings account monthly inerest rate: " + savingsAccount.getMonthlyInterestRate() +"%");
		System.out.println("Savings account was created on: " + savingsAccount.getDate());
	}
}

