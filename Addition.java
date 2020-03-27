import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		int b;
		int sum;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		
		sum = a - ~b -1;
		
		System.out.println("Sum of two interger: " +sum);

	}

}
