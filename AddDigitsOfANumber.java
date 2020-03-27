import java.util.Scanner;

public class AddDigitsOfANumber {

	public static void main(String[] args) {
	
		int num;
		int rem =0;
		int sum = 0;
		int temp;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number :  ");
		num =sc.nextInt();
		
		temp = num;
		
		while(num>0){
			
			rem =num%10;
			sum = sum+rem;
			num = num/10;
		}
		
		System.out.println("Sum of Digits of  " +temp+ "  is  " + sum);
		

	}

}
