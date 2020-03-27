import java.util.Scanner;

public class PrintTableOfANumber {

	public static void main(String[] args) {
	
		int i;
		int num;
		int tab;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter a number : ");
		num=sc.nextInt();
		
		System.out.println("Table of " +num + " is\n");
		
		for (i=0; i<=10; i++)	
			
		{
		 tab=num*i;
		 
		 System.out.println(num + " * " + i + " = " + tab + "\n");
		}
		
	}

}
