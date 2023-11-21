package makechange;

import java.util.Scanner;

public class CashRegister {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		CashRegister ds = new CashRegister();
		ds.startRegister();
	}

	public void startRegister() {

		System.out.println("/////////          Welcome to the Cash Register!          ////////////\n\n\t");
		System.out.println(" \tYou will first enter the price of the item and then\n\n\t"
				+ "enter the amount you want to pay. Your change will then be \n\n\t"
				+ "calculated and returned to you.\n\n\n" + "/////////         					  ////////////\n\n\t");

		double min = 0.00;
		double max = 99999999999.99;

		// Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("\tPlease enter the price of the item in dollars and cents: ");
		double price = sc.nextDouble();
		System.out.println();
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
		System.out.println();
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
		// change= Math.round(change);
		if (money < price) {
			System.err.println("Please give the cashier more money than that...\n");
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

		if (change == 0.00) {
			System.out.println("You gave the exact amount. Thank you! ");
			continueRegister();
		} else {
			while (change >= 0) {
				if (change > 99.99999999999999999) {
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
				} else if (change >= 19.9999999999999) {
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
				} else if (change >= 9.9999999999999999) {
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

				} else if (change >= 4.9999999999999999) {
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

				} else if (change >= 0.999999999999999) {
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

				} else if (change >= 0.249999999999999999999) {
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
				} else if (change >= 0.0999999999999999999) {
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
				} else if (change >= 0.04999999999999999999) {
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
				} else if (change >= 0.0099999999999999999999 && change < nickel) {
					double c = (change * 100.00);
					float p = (float) c;
					System.out.println("You receive " + (int) p + " penny(s).");
					continueRegister();
				} else if (change < 0.0000000000000000000001) {
					continueRegister();
				} else {
					continueRegister();

				}
			}
		}
	}

	public void continueRegister() {

		int a = 1;
		// Scanner sb = new Scanner(System.in);
		while (a == 1) {
			System.out.println("\n\n\tWould you like to shop again? Please enter 1 for YES. Press 2 for NO: \n\n");
			a = sc.nextInt();
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

	public void endRegister() {
		System.out.println("\n\n//////////            Thank you and come again!          /////////////\n\n\n");
		System.exit(0);
	}
}
