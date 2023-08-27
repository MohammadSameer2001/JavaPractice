package Checker;

import java.util.Scanner;

public class Ten {

		public static void checkMultipleOfTen(int n)
		{
			if(n%10==0)
			{
				System.out.println("The nummber is multiple of 10");
			}
			else
			{
				System.out.println("Not multiple of 10");
			}


		}

		public static void main(String[] args)
		{
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			checkMultipleOfTen(n);
			

		}



}
