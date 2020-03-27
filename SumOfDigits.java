import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		int sum =0;
		int r;
		
		System.out.println("Enter a number: ");
		num = sc.nextInt();
		while(num!=0){
		r = num % 10;
		num =num/10;
		sum =sum+r;
		}
		 System.out.println("Sum of digits of number " +sum);
	}

}
