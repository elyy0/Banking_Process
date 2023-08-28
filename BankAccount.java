package src;
public class BankAccount {
	    private String bankName;
	    private String accountNumber;
	    private String accountHolderName;
	    private String branchName;
	    private String pinNumber;
	    private double balance;

	    public BankAccount(String bankName,String accountNumber,String accountHolderName,String branchName,String pinNumber) {
	        this.bankName=bankName;
	        this.accountNumber=accountNumber;
	        this.accountHolderName=accountHolderName;
	        this.branchName=branchName;
	        this.pinNumber=pinNumber;
	        this.balance=0.0;
	    }

	    public String getBankName() {
	        return bankName;
	    }

	    public String getAccountNumber() {
	        return accountNumber;
	    }

	    public String getAccountHolderName() {
	        return accountHolderName;
	    }

	    public String getBranchName() {
	        return branchName;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void deposit(double amount) {
	        if(amount>0) {
	            balance+=amount;
	            System.out.println("Deposit successful. New balance: " +balance);
	        }
	        else {
	            System.out.println("Invalid amount for deposit.");
	        }
	    }
	    public void withdraw(double amount) {
	        if(amount>0 && amount<=balance) {
	            balance-=amount;
	            System.out.println("Withdrawal successful. New balance: " +balance);
	        } 
	        else {
	            System.out.println("Invalid amount for withdrawal or insufficient balance.");
	        }
	    }
}
