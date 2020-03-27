import java.util.Scanner;

public class SwappingNumberAgain {

	public static void main(String[] args) {
	int num;
	int num2;
	int swap;
	
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Enter the numbers to swap : ");
	
	System.out.println("Enter First Number : ");
	num=sc.nextInt();
	
	System.out.println("Enter Second Number : ");
	num2=sc.nextInt();
	
	swap= num;
	num=num2;
	num2 = swap;
	
	System.out.println("The value of the first and second number after the swap:  ");
	
	System.out.println("First Number : " + num);
	System.out.println("\nSecond Number : " + num2);
	

   }

}
