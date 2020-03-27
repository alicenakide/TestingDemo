import java.util.Scanner;

public class FindFactorial {

	public static void main(String[] args) {
	
	int num;
	int i;
	int fact =1;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a number : ");
	num =sc.nextInt();
	
	for(i=num; i>0; i--){
		
	fact = fact*i;
	
	}
	System.out.println("Factorial of " + num + " is " + fact);
	}

}
