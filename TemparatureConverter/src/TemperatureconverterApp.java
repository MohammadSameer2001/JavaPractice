import java.util.Scanner;

public class TemperatureconverterApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double d1 = scan.nextDouble();
		//Temperatureconverter temperatureConverter = new Temperatureconverter();
		Temparatureconverter t=new Temparatureconverter();
		System.out.println(t.convertFahrenheitToCelsius(d1));
		

	}

}
