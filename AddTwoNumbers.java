import java.util.Scanner;

public class AddTwoNumbers {

	public static void main(String[] args) {
	
	int a;
	int b;
	int sum;
	
	
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Enter Two Numbers: ");
	a=sc.nextInt();
	b=sc.nextInt();
	
	sum = a+b;
	
	System.out.println("The sum of 2 numbers is " + sum);
	
	
	

	}

}
