import java.util.Scanner;

public class CircumferenceOfCircle {

	public static void main(String[] args) {
	
		float r;
		double area;
		double circum;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Radius Of Circle : ");
		r=sc.nextFloat();
		
		area= 3.14 *r*r;
		circum =2*3.14*r;
		
		System.out.println("Area of circle = " +area);
		System.out.println("\nCircumference of circle = " +circum);
		
	}

}
