import java.util.Scanner;

public class ReversingNumber {

	public static void main(String[] args) {
	
	int num;
	int rev =0;
	int rem;
	
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Enter a number to be reversed :");
	num=sc.nextInt();
	
	while(num!=0){
		
		rem = num%10;
		rev=rev*10 + rem;
		num=num/10;
			
	}
	System.out.println("Reversed number  = " +rev);

	}

}
