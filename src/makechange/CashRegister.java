package makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {

		System.out.println("Welcome to the Cash Register!");

		Scanner sc = new Scanner(System.in);
		System.out.println("What is the total price of the item in dollars and cents? ");
		double price = sc.nextDouble();

		System.out.println("Please enter the amount tendered to the cashier in dollars and cents : ");
		double money = sc.nextDouble();
		sc.close();

		double change = money - price;
		if (money < price) {
			System.err.print("Please provide more money than the price of the item.");
		} else {
			System.out.print("The amount of change returned to you by the cashier is : ");
			System.out.printf("%.2f.", change);
			System.out.print(" ");
			System.out.println();

		}

		double hundred = 100.00;
		double twenty = 20.00;
		double ten = 10.00;
		double five = 5.00;
		double one = 1.00;
		double quarter = 0.25;
		double dime = 0.10;
		double nickel = 0.05;
		double penny = 0.01;

		while (change >= 0) {
			if (change >= hundred) {
				change = change - hundred;
				int i = 0;
				if (i == 1) {
					System.out.println("You receive 1 hundred dollar bill.");
				} else {
					i++;
				}
				System.out.println("You receive " + i + " hundred dollar bills.");
			}

			else if (change >= twenty) {
				change = change - twenty;
				int i = 0;
				if (i == 1) {
					System.out.println("You receive 1 twenty dollar bill.");
				} else {
					i++;
				}
				System.out.println("You receive " + i + " twenty dollar bills.");
			}

			else if (change >= ten) {
				change = change - ten;
				int i = 0;
				if (i == 1) {
					System.out.println("You receive 1 ten dollar bill.");
				} else {
					i++;
				}
				System.out.println("You receive " + i + " ten dollar bills.");

			} else if (change >= five) {
				change = change - five;
				int i = 0;
				if (i == 1) {
					System.out.println("You receive 1 five dollar bill.");
				} else {
					i++;
				}
				System.out.println("You receive " + i + " five dollar bills.");

			} else if (change >= one) {
				change = change - one;
				int i = 0;
				if (i == 1) {
					System.out.println("You receive 1 one dollar bill.");
				} else {
					i++;
				}
				System.out.println("You receive " + i + " one dollar bills.");

			} else if (change >= quarter) {
				change = change - quarter;
				int i = 0;
				if (i == 1) {
					System.out.println("You receive 1 one quarter.");
				} else {
					i++;
				}
				System.out.println("You receive " + i + " one quarters.");
			} else if (change >= dime) {
				change = change - dime;
				int i = 0;
				if (i == 1) {
					System.out.println("You receive 1 one dime.");
				} else {
					i++;
				}
				System.out.println("You receive " + i + " one dimes.");

			} else if (change >= nickel) {
				change = change - nickel;
				int i = 0;
				if (i == 1) {
					System.out.println("You receive 1 one nickel.");
				} else {
					i++;
				}
				System.out.println("You receive " + i + " one nickel.");
			} else if (change >= penny) {
				change = change - penny;
				int i = 0;
				if (i == 1) {
					System.out.println("You receive 1 one penny.");
				} else {
					i++;
				}
				System.out.println("You receive " + i + " one pennys.");
			} else {
				System.out.println("Thank you and have a nice day!");
				break;
			}

		}
	}
}
