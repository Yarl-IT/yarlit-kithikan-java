import java.util.Scanner;

public class BasicAtmSystem{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int balance = 10000;
		char choice;
		
		do {
			System.out.println("\n--- ATM MENU ---");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposite");
			System.out.println("3. Withdraw");
			
			System.out.print("Choose option: ");
			int option = sc.nextInt();
			
			switch (option){
				case 1: 
					System.out.println("Balance: " + balance);
					break;
				case 2:
					System.out.println("Enter deposite amount: ");
					int dep = sc.nextInt();
					balance += dep;
					System.out.println("Update Balance: " + balance);
					break;
				case 3:
					System.out.print("Enter withdrawal amount: ");
					int wd = sc.nextInt();
					balance -= wd;
					System.out.println("Update Balanve:"+ balance);
					break;
				default:
					System.out.println("Invalid option");
			}
			
			System.out.print("Do you want another option?(y/n): ");
			choice = sc.next().charAt(0);
		} while (choice == 'y' || choice == 'Y');
		System.out.println("Thank you! Have a nice day. ");
	}
}