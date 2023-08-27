package Natural;

import java.util.Scanner;

public class Main {
	public static void calculateSum(int n)
	{
		for(int i=1;i<=n;i++)
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		calculateSum(n);

	}

	
}
