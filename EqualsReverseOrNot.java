import java.util.Scanner;

public class EqualsReverseOrNot {

	public static void main(String[] args) {
	
	int num;
	int orig;
	int rev =0;
	int rem;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a number: ");
	num=sc.nextInt();
	
	orig=num;
	
	while(num>0){
		
		rem =num%10;
		rev = rev*10+rem;
		num=num/10;
	}
	
	if (orig == rev){
		
		System.out.println("Reverse is Equal Original");
	}
	else{
		
		System.out.println("Reverse is not Equal toOriginal");
	}
	
	
	}

}
