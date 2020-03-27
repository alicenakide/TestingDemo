import java.util.Scanner;

public class SwappingNumber {

	public static void main(String[] args) {
	
		int a;
		int b;
		int temp;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of A and B : \n");
		
		System.out.println("A = ");
		a=sc.nextInt();
		
		System.out.println("B = ");
		b=sc.nextInt();
		
		temp =a;
		a=b;
		b=temp;
		
		System.out.println("Numbers swapped successfully..!! : \n");
		
		System.out.println("A = " +a);
		System.out.println("\nB = " +b);
	}
}
