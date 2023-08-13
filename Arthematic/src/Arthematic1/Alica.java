package Arthematic1;

import java.util.Scanner;

public class Alica {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a vlaue");
		int sum1 = scan.nextInt();
		int sum2 = scan.nextInt();
		System.out.println("Enter your Choice");
		int choice = scan.nextInt();
		
		
		switch (choice) {
		case 1:
			System.out.println(sum1+sum2+" done Addition");
			break;
		case 2:
			System.out.println(sum1-sum2+" done subtraction");
			break;
		case 3:
			System.out.println(sum1*sum2+" done multiplication");
			break;
		case 4:
			System.out.println(sum1/sum2+" done divison");
			break;
		case 5:
			System.out.println(sum1%sum2+" done remainder");
			break;
		default:
			System.out.println("unable to proceed");
		}
		}
		
		

	}


