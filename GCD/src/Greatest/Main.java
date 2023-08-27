package Greatest;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a= scan.nextInt();
		int b = scan.nextInt();
		Main gcd = new Main();
		//gcd.findGCD(a,b);
		System.out.println("GCD of "+a+" and "+b+" is " +gcd.findGCD(a, b));
		
		
	}
	public  int findGCD(int a, int b)
	{
		while(b!=0)
		{
			int rem=b%a;
			a=b;
			b=rem;
			
		}
		return a;
	}

}
