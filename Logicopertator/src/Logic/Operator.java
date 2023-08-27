package Logic;

import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean b1 = scan.nextBoolean();
		System.out.println("is input valids(true/false):"+b1);
		boolean b2 = scan.nextBoolean();
		System.out.println("does input meet a certain condition(true/false): "+b2);
		Operator a = new Operator();
		a.ValidInput(b1,b2);

	}

public static boolean ValidInput(boolean b1,boolean b2) {
	if (b1==b2) 
	{
		System.out.println("input is valid");
	return (b1&&b2);
	}
	else if (b1!=b2)
	{
		System.out.println("Input is not valid");
		return (b1||b2);
		
	}
	else {
		System.out.println("nothing");
	}
	return (b1||b2);
	
}
}
