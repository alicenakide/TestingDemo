import java.util.Scanner;

public class CheckEvenOrOdd {
	
	public static void main(String[] args) {
	
	int num;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter number: ");
	num=sc.nextInt();
	
	if (num%2==0){
	
	System.out.println(num + " is an even number");
	} else {
	
	System.out.println( num + " is an odd number");

}
}
}