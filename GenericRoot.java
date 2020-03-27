import java.util.Scanner;

public class GenericRoot {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	long num;
	long sum =0;
	long r;
	
	System.out.println("Enter a number ");
	num = sc.nextLong();
	
	while(num>10){
	sum =0;
	while (num !=0){
		r=num%10;
		num=num/10;
		sum+=r;
	}
	
	if(sum>10){
	
	num = sum;
	
	}else
	
		break;
	}
	
	System.out.println( "Sum of the digits in single digit " + sum);

	}

}
