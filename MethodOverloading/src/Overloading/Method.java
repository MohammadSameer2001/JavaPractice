package Overloading;

import java.util.Scanner;

public class Method {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		System.out.println("Enter your first number :"+num1);
		int num2 = scan.nextInt();
		System.out.println("Enter your second number :"+num2);
		System.out.println("Enter a operatore(+,-,*,/)");
		char Choice = scan.next().charAt(0);
		Method Calci= new Method();
		Calci.Caluc( num1, num2);
		switch(Choice) {
		case '+':
			System.out.println(num1+num2);
			break;
		case '-':
			System.out.println(num2-num1);
			break;
		case '*':
			System.out.println(num1*num2);
			break;
		case '/':
			System.out.println(num1/num2);
			break ;
		default :
			System.out.println("please enter a valid requirment");
			break ;
		}
		
			
		}
	public int Caluc(int num1,int num2) {
		return num1+num2 ;
		}
			public  static void Caluc(double num1,int num2) {
				System.out.println(num1-num2) ;
		}
			public static double Caluc(double num1,long num2) {
				return num1*num2 ;

		}
			public void Caluc(int num1,long num2) {
				System.out.println(num1/num2);
		}

}
