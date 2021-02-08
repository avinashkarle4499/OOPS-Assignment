package day8;

class SavingAccount
{

	double balance;
	double interest;
	public SavingAccount(double balance, double interest) {
		super();
		this.balance = balance;
		this.interest = interest;
	}

	void withdraw(int amount)
	{
		balance=balance-amount;

	}

	void deposit(int amount)
	{
		balance= balance+amount;

	}
	void addInterest() {

		double intr= balance*(interest/100);
		balance+=intr;
	}

	public double getBalance() {
		double intr= balance*(interest/100);
		balance+=intr;

		return balance;
	}



}
public class TestBankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount s1 = new SavingAccount(2000.00,4.0);
		s1.deposit(500);
		System.out.println(s1.getBalance());
		s1.withdraw(200);
		System.out.println(s1.getBalance());
	}

}
