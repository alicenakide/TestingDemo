import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
	
		int a;
		int b;
		int big;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the two numbers: ");
		a=sc.nextInt();
		b=sc.nextInt();
		
		if(a>b){
	
		big =a;
		}
		else {
			big =b;
		}
		System.out.println("The largest number of the two is  : " + big);
	}

}
