import java.util.Scanner;

public class AddNumbers {

	public static void main(String[] args) {
	
	int i;
	int n;
	int sum=0;
	int num;
	
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("How many numbers do you want to enter and add? ");
	n=sc.nextInt();
	
	System.out.println("Enter " +n+ " numbers : " );
	for(i=0; i<n; i++){
		
		num=sc.nextInt();
		sum = sum + num;	
	}
    System.out.println("Sum of all " +n+ " number is " +sum);
	}

}
