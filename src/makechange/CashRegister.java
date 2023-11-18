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
			System.err.print("Please provide more money than the price of the item.");
		}
		else {
			System.out.print("The amount of changed return is : ");
			System.out.printf("%.2f.", change);
		}
		
		double twenty = 20.00;
		double ten = 10.00;
		double five = 5.00;
		double one = 1.00;
		double quarter = 0.25;
		double dime = 0.10;
		double nickel = 0.05;
		double penny = 0.01;
		
		while (change >= 0) {
			if (change >= twenty) {
				int i=0;
				change = change - twenty;
				i++;
				System.out.println("You receive " + i + "twenty dollar bills.");
			}
			else if (change >= ten) {
				int i=0;
				change = change - ten;
				i++;
				System.out.println("You receive " + i + "ten dollar bills.");
			}
			else if (change >= five) {
				int i=0;
				change = change - five;
				i++;
				System.out.println("You receive " + i + "five dollar bills.");
			}
			else if (change >= one) {
				int i=0;
				change = change - one;
				i++;
				System.out.println("You receive " + i + "one dollar bills.");
			}
			else if (change >= quarter) {
				int i=0;
				change = change - quarter;
				i++;
				System.out.println("You receive " + i + "quarters.");
			}
			else if (change >= dime) {
				int i=0;
				change = change - dime;
				i++;
				System.out.println("You receive " + i + "dimes.");
			}
			else if (change >= nickel) {
				int i=0;
				change = change - nickel;
				i++;
				System.out.println("You receive " + i + "nickels.");
			}
			else if (change >= penny) {
				int i=0;
				change = change - penny;
				i++;
				System.out.println("You receive " + i + "pennys.");
			}
			else {
				System.out.println("Thank you and have a nice day!");
				}
			
			}
		}
	}
