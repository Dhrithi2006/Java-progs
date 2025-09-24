package banking;

public class Account {
	private int accountNo;
	private String name;
	private double balance;
	
	public Account(int accountNo, String name, double balance) {
        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance;
    }
	
	public void deposit(double amount) {
        if (amount <= 0) {
            throw new ArithmeticException("Deposit amount must be positive");
        }
        balance += amount;
        System.out.println("Deposit successful. New Balance: " + balance);
    }
	
	public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount <= 0) {
            throw new ArithmeticException("Withdrawal amount must be positive");
        } else if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. New Balance: " + balance);
    }
	
	public void showBalance() {
        System.out.println("Account Number: " + accountNo);
        System.out.println("Name: " + name);
        System.out.println("Current balance: " + balance);
    }

}
