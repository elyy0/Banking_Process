package src;
import java.util.*;
public class Main extends BankAccount{
	public Main(String bankName,String accountNumber,String accountHolderName,String branchName,String pinNumber)
	{
		super(bankName,accountNumber,accountHolderName,branchName,pinNumber);
	}
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter bank name: ");
	        String bankName = scanner.nextLine();
	        
	        System.out.print("Enter branch name: ");
	        String branchName = scanner.nextLine();

	        System.out.print("Enter account number: ");
	        String accountNumber = scanner.nextLine();

	        System.out.print("Enter account holder name: ");
	        String accountHolderName = scanner.nextLine();

	        System.out.print("Enter pin number: ");
	        String pinNumber = scanner.nextLine();

	        BankAccount bankAccount=new BankAccount(bankName,accountNumber,accountHolderName,branchName,pinNumber);

	        while(true) {
	            System.out.println("\n1. Deposit");
	            System.out.println("2. Withdraw");
	            System.out.println("3. Check Balance");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice (1/2/3/4): ");
	            int choice=scanner.nextInt();

	            if (choice==1){
	                System.out.print("Enter the amount to deposit: ");
	                double amount=scanner.nextDouble();
	                bankAccount.deposit(amount);
	            }
	            else if(choice==2) {
	                System.out.print("Enter the amount to withdraw: ");
	                double amount=scanner.nextDouble();
	                bankAccount.withdraw(amount);
	            } 
	            else if(choice==3) {
	                System.out.println("Current balance: "+bankAccount.getBalance());
	            } 
	            else if(choice==4) {
	            	System.out.println("Your Name: "+accountHolderName+"\tFinal Balance: "+bankAccount.getBalance());
	                System.out.println("Thank you for using our services. Goodbye!");
	                break;
	            } 
	            else {
	                System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }

}
