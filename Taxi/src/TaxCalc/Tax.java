package TaxCalc;

import java.util.Scanner;

public class Tax {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int amount = scan.nextInt();
		System.out.println("Enter the purchase amount: "+amount);
		double tax = scan.nextDouble();
		System.out.println("Enter the tax rate: "+tax);
		Tax1 total = new Tax1();
		System.out.println("Total cost including tax" +total.calculateTotalWithTax(amount,tax));
	}

}
