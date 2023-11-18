package makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		startRegister();
	}

	public static void startRegister() {

		System.out.println("/////////          Welcome to the Cash Register!          ////////////\n\n\t");
		System.out.println(" \tYou will first enter the price of the item and then\n\n\t"
				+ "enter the amount you want to pay. Your change will then be \n\n\t"
				+ "calculated and returned to you.\n\n\n" + "/////////         					  ////////////\n\n\t");

		double min = 0;
		double max = 999999999;

		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("\tPlease enter the price of the item in dollars and cents: ");
		double price = sc.nextDouble();
		if (price > min && price < max) {
			System.out.println("You owe the cashier ");
			System.out.printf("%.2f.", price);
			System.out.println("\n");
		} else {
			System.err.print("Please enter a valid price in dollars and cents.");
			startRegister();

		}

		System.out.println("\tPlease enter the amount you tender to the cashier in dollars and cents: ");
		double money = sc.nextDouble();
		if (money > min && money < max) {
			System.out.println();
			System.out.printf("%.2f ", money);
			System.out.println("was paid to the cashier.");
			// System.out.printf("%.2f.", money);
			System.out.println("\n\n");
		} else {
			System.err.println("\n\nPlease enter a amount you give in dollars and cents: ");
			startRegister();

		}

		double change = money - price;
		if (money < price) {
			System.err.println("Please give the cashier more money for this item.\n");
			startRegister();
		} else {
			System.out.print("\tThe amount of change returned to you by the cashier is ");
			System.out.printf("%.2f.", change);
			System.out.print(" \n");
			System.out.println();
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
		int i = 0;

		while (change >= 0) {
			if (change >= hundred) {
				change = change - hundred;
				int d = i + 1;
				if (change < hundred) {
					if (d != 1) {
						System.out.println("You receive " + d + " hundred dollar bills.");
					} else {
						System.out.println("You receive " + d + " hundred dollar bill.");
					}
					i = 0;
				} else {
					i++;
				}
			} else if (change >= twenty) {
				change = change - twenty;
				int d = i + 1;
				if (change < twenty) {
					if (d != 1) {
						System.out.println("You receive " + d + " twenty dollar bills.");
					} else {
						System.out.println("You receive " + d + " twenty dollar bill.");
					}
					i = 0;
				} else {
					i++;
				}
			} else if (change >= ten) {
				change = change - ten;
				int d = i + 1;
				if (change < ten) {
					if (d != 1) {
						System.out.println("You receive " + d + " ten dollar bills.");
					} else {
						System.out.println("You receive " + d + " ten dollar bill.");
					}
					i = 0;
				} else {
					i++;
				}

			} else if (change >= five) {
				change = change - five;
				int d = i + 1;
				if (change < five) {
					if (d != 1) {
						System.out.println("You receive " + d + " five dollar bills.");
					} else {
						System.out.println("You receive " + d + " five dollar bill.");
					}
					i = 0;
				} else {
					i++;
				}

			} else if (change >= one) {
				change = change - one;
				int d = i + 1;
				if (change < one) {
					if (d != 1) {
						System.out.println("You receive " + d + " one dollar bills.");
					} else {
						System.out.println("You receive " + d + " one dollar bill.");
					}
					i = 0;
				} else {
					i++;
				}

			} else if (change >= quarter) {
				change = change - quarter;
				int d = i + 1;
				if (change < quarter) {
					if (d != 1) {
						System.out.println("You receive " + d + " quarters.");
					} else {
						System.out.println("You receive " + d + " quarter.");
					}
					i = 0;
				} else {
					i++;
				}
			} else if (change >= dime) {
				change = change - dime;
				int d = i + 1;
				if (change < dime) {
					if (d != 1) {
						System.out.println("You receive " + d + " dimes.");
					} else {
						System.out.println("You receive " + d + " dime.");
					}
					i = 0;
				} else {
					i++;
				}

			} else if (change >= nickel) {
				change = change - nickel;
				int d = i + 1;
				if (change < nickel) {
					if (d != 1) {
						System.out.println("You receive " + d + " nickels.");
					} else {
						System.out.println("You receive " + d + " nickel.");
					}
					i = 0;
				} else {
					i++;
				}
			} else if (change >= penny && change < 0.049999999) {
				if (change > 0.011111111111 && change < 0.049999999) {
					double c = (change * 100.00);
					float p = (float) c;
					System.out.println("You receive " + (int) p + " pennies.");
					//i = 0;
					continueRegister();

				}
				if (change < 0.019 && change > 0.00000000000001 && change < nickel) {
					change = change - penny;
					System.out.println("You receive 1 penny.");
					//i = 0;
					continueRegister();
				}
			} else {
				continueRegister();
			}

		}
		sc.close();
	}

	public static void continueRegister() {

		int a = 1;
		Scanner sb = new Scanner(System.in);
		while (a == 1) {
			System.out.println("\n\tWould you like to shop again? Please enter 1 for YES. Press 2 for NO: \n\n");
			a = sb.nextInt();
			switch (a) {
			case 1:
				startRegister();
				break;
			case 2:
				endRegister();
				break;
			default:
				break;
			}
		}
	}

	public static void endRegister() {
		System.out.println("\n\n//////////            Thank you and come again!          /////////////\n\n\n");
		continueRegister();
	}
}
