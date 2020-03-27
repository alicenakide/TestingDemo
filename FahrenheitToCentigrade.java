import java.util.Scanner;

public class FahrenheitToCentigrade {

	public static void main(String[] args) {
	
	float fah;
	double cel;
	
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Enter the temperature in fahrenheit : ");
	fah=sc.nextFloat();
	
	cel = (fah-32)/1.8;
	
	
	System.out.println("Equivalent Temperatur in Celsius = " + cel);
	}

}
