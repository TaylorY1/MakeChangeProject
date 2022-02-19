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
		System.out.println(itemPrice);

		System.out.println("How much money was tendered by the customer?");
		amountTendered = sc.nextDouble();
		System.out.println(amountTendered);
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
				System.out.println(numHundreds + " Hundreds");
				changeAmount = changeAmount % 100;
			}
			if (changeAmount >= 50) {
				int numFifties = (int) (changeAmount / 50);
				System.out.println(numFifties + " Fifties");
				changeAmount = changeAmount % 50;
			}
			if (changeAmount >= 20) {
				int numTwenties = (int) (changeAmount / 20);
				System.out.println(numTwenties + " Twenties");
				changeAmount = changeAmount % 20;
			}
			if (changeAmount >= 10) {
				int numTens = (int) (changeAmount / 10);
				System.out.println(numTens + " Tens");
				changeAmount = changeAmount % 10;
			}
			if (changeAmount >= 5) {
				int numFives = (int) (changeAmount / 5);
				System.out.println(numFives + " Fives");
				changeAmount = changeAmount % 5;
			}
			if (changeAmount >= 1) {
				int numOnes = (int) (changeAmount / 1);
				System.out.println(numOnes + " Ones");
				changeAmount = changeAmount % 1;
			}
			if (changeAmount >= 0.25) {
				int numQuarters = (int) (changeAmount / 0.25);
				System.out.println(numQuarters + " Quarters");
				changeAmount = changeAmount % 0.25;
			}
			if (changeAmount >= 0.10) {
				int numDimes = (int) (changeAmount / 0.10);
				System.out.println(numDimes + " Dimes");
				changeAmount = changeAmount % 0.10;
			}
			if (changeAmount >= 0.05) {
				int numNickels = (int) (changeAmount / 0.05);
				System.out.println(numNickels + " Nickels");
				changeAmount = changeAmount % 0.05;
			}
			if (changeAmount >= 0.01) {
				changeAmount += 0.005;
				int numPennies = (int) (changeAmount / 0.01);
				System.out.println(numPennies + " Pennies \nHave a great day!");
				changeAmount = changeAmount % 0.01;
			}
		}
	}
}
