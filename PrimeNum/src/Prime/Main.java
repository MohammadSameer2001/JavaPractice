package Prime;

import java.util.Scanner;

public class Main {
	public static void primenumbers(int n) 
	{
		for(int j=2;j<=1000;j++)
		{
			int c=0,i=0;
			for(i=1;i<=j;i++)
			{
				if(j%i==0)
				{
					c=c+1;
				}
			}
			if(c==2 && n>0) {
				System.out.print(j+" ");
				n--;
			}
			
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		primenumbers(n);
	}

}
