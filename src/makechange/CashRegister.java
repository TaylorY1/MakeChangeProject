package makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double itemPrice = 0;
		double amountTendered = 0;
		double changeAmount = 0;

		System.out.println("What is the price of the item?");
		itemPrice = sc.nextDouble();
		// System.out.println(itemPrice);

		System.out.println("How much money was tendered by the customer?");
		amountTendered = sc.nextDouble();
		// System.out.println(amountTendered);
		changeAmount = amountTendered - itemPrice;
		// System.out.println(changeAmount);
		sc.close();

		if (amountTendered < itemPrice) {
			System.out.println("Please provide more money to complete this transaction.");
		} else if (amountTendered == itemPrice) {
			System.out.println("Thank you for shopping with us today! Goodbye.");
		} else {
			if (changeAmount >= 100) {
				int numHundreds = (int) (changeAmount / 100);
				System.out.println(numHundreds + " Hundred Dollar Bills");
				changeAmount = changeAmount % 100;
			}
			if (changeAmount >= 50) {
				int numFifties = (int) (changeAmount / 50);
				System.out.println(numFifties + " Fifty Dollar Bill");
				changeAmount = changeAmount % 50;
			}
			if (changeAmount >= 20) {
				int numTwenties = (int) (changeAmount / 20);
				if (numTwenties == 1) {
					System.out.println("1 Twenty Dollar Bill");
				} else if (numTwenties > 1) {
					System.out.println(numTwenties + " Twenty Dollar Bills");
				}
				changeAmount = changeAmount % 20;
			}
			if (changeAmount >= 10) {
				int numTens = (int) (changeAmount / 10);
				if (numTens == 1) {
					System.out.println("1 Ten Dollar Bill");
				} else if (numTens > 1) {
					System.out.println(numTens + " Ten Dollar Bills");
				}
				changeAmount = changeAmount % 10;
			}
			if (changeAmount >= 5) {
				int numFives = (int) (changeAmount / 5);
				System.out.println(numFives + " Five Dollar Bill");
				changeAmount = changeAmount % 5;
			}
			if (changeAmount >= 1) {
				int numOnes = (int) (changeAmount / 1);
				if (numOnes == 1) {
					System.out.println("1 One Dollar Bill");
				} else if (numOnes > 1) {
					System.out.println(numOnes + " One Dollar Bills");
				}
				changeAmount = changeAmount % 1;
			}
			if (changeAmount >= 0.25) {
				int numQuarters = (int) (changeAmount / 0.25);
				if (numQuarters == 1) {
					System.out.println("1 Quarter");
				} else if (numQuarters > 1) {
					System.out.println(numQuarters + " Quarters");
				}
				changeAmount = changeAmount % 0.25;
			}
			if (changeAmount >= 0.10) {
				int numDimes = (int) (changeAmount / 0.10);
				if (numDimes == 1) {
					System.out.println("1 Dime");
				} else if (numDimes > 1) {
					System.out.println(numDimes + " Dimes");
				}
				changeAmount = changeAmount % 0.10;
			}
			if (changeAmount >= 0.05) {
				int numNickels = (int) (changeAmount / 0.05);
				System.out.println(numNickels + " Nickel");
				changeAmount = changeAmount % 0.05;
			}
			if (changeAmount >= 0.01) {
				changeAmount += 0.005;
				int numPennies = (int) (changeAmount / 0.01);
				if (numPennies == 1) {
					System.out.println("1 Penny");
				} else if (numPennies > 1) {
					System.out.println(numPennies + " Pennies");
				}
				changeAmount = changeAmount % 0.01;
			}
		}
	}
}
