package Check;

import java.util.Scanner;

public class Grade {

		public static void checkGrade(int grade)
		{
			if(grade >=50)
			{
				System.out.println("pass");
			}
			else {
				System.out.println("fail");
			}
		}


		
		public static void main(String[] args)
		{
			Scanner scan= new Scanner(System.in);
			int A = scan.nextInt();
			//Grade G = new Grade();
			checkGrade (A);
			
			

		}

	}


