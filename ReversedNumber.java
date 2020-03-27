import java.util.Scanner;

public class ReversedNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		int r;
		int reverse =0;
		
		System.out.println("Enter any number: ");
		num =sc.nextInt();
		
		while (num !=0){
		
		r=num%10;
		reverse = reverse * 10 + r;
		num = num /10;
			
		}
	    
		System.out.println("Reverse of number " +reverse);
		
	}

}
