import java.util.Scanner;

public class PerimeterAndRectangle {

	public static void main(String[] args) {
	
	int len;
	int bre;
	int peri;
	int area;
	
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Enter length and breadth of a rectangle : ");
	
	len=sc.nextInt();
	bre=sc.nextInt();
	
	area = len*bre;
	peri = (2*len) + (2*bre);
	
	System.out.println("Area " + area);
	System.out.println("\nPerimeter:  " + peri);

	}

}
