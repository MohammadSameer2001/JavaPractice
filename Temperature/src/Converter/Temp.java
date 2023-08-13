package Converter;

import java.util.Scanner;

public class Temp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Tempurature converter");
		System.out.println("1.Convert Celsius to Fahrenheit");
		System.out.println("2.Convert Fahrenheit to Celsius");
		System.out.println("Select your option");
		
		int Choice = scan.nextInt();
		switch(Choice) {
		case 1:
			System.out.println("celsiustofahrenheit");
			double C =  scan.nextDouble();
			TempApp t=new TempApp();
			System.out.println(t.CelsiusToFahrenheit(C));
			
		//	System.out.println((celsius × 9/5) + 32);
			break ;
	    case 2:
	    	System.out.println("fahrenheittocelsius");
			double F =  scan.nextDouble();
			TempApp t1=new TempApp();
			System.out.println(t1.FahrenheitToCelsius(F));
	    	break ;
		

	}

}
}