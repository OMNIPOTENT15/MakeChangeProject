package makechange;
import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		System.out.println("Welcome to the Cash Register!");

		Scanner sc = new Scanner(System.in);
		System.out.println("What is the total price of the item in dollars and cents: ");
		double total = sc.nextDouble();
		
		System.out.println("Please enter the amount given the to the cashier in dollars and cents: ");
		double amount = sc.nextDouble();
		sc.close();
		
		double change = amount - total;
		System.out.println("The amount of change given is " + change + ".");
	}

}
