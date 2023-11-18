package makechange;
import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		System.out.println("Welcome to the Cash Register!");

		Scanner sc = new Scanner(System.in);
		System.out.println("What is the total price of the item in dollars and cents: ");
		double price = sc.nextDouble();
		
		System.out.println("Please enter the amount given the to the cashier in dollars and cents: ");
		double money = sc.nextDouble();
		sc.close();
		
		
		double change = money - price;
		if (money < price) {
			System.err.print("Please provide more money than the price of the item");
		}
		else if (change > 1.00) {
			System.out.print("The amount of changed return is : ");
			System.out.printf("%.2f.", change);

		} 
		else {
			System.out.print("The amount of changed return is : ");
			System.out.printf("%.2f.", change);
		}
	}

}
