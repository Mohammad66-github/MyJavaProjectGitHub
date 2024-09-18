
import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) 
	
	
	{
		

		
		
		
		Account account1 = new Account(50.00);
		
		Account account2 = new Account(-7.53);
		
		
		
		//main method begins exaction of java application
		
		System.out.printf("account1 balance is: $%.2f\n", account1.getBalance());
		
		System.out.printf("account2 balance is: $%.2f\n", account2.getBalance());
		
		
		Scanner input = new Scanner(System.in);
		double depositAmount;
		
		
		System.out.print("Enter deposit amount for account1:");
		depositAmount = input.nextDouble();
		System.out.printf("\nadding %2f to account1 balance\n\n", depositAmount); // add to account1 balance.
		account1.credit(depositAmount);
		

		
		System.out.printf("account1 balance is: $%.2f\n", account1.getBalance());
		System.out.printf("account2 balance is: $%.2f\"\n", account2.getBalance());
		
		
		
System.out.print("Enter deposit amount for account2:");

		depositAmount = input.nextDouble();
		System.out.printf("\nadding %2f to account2\n\n", depositAmount); // add to account2 balance.
		
		account2.credit(depositAmount);
		
		

		
		System.out.printf("account1 balance is: $%.2f\n", account1.getBalance());
		
		System.out.printf("account2 balance is: $%.2f\n", account2.getBalance());
		
		
		
		
		
	}

}
