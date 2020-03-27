import java.util.Scanner;

public class MeanAverage {

	public static void main(String[] args) {
		
	int n;
	int i;
	int sum =0;
	int armean;
	
	int arr [] = new int [50];
	Scanner sc = new Scanner (System.in);
	
	System.out.println("How many numbers do you want to enter: ");
	n=sc.nextInt();
	
	System.out.println("Enter " +n+ " Numbers: ");
	
	for(i=0; i<n; i++){
		
		arr[i] =sc.nextInt();
		sum=sum +arr[i];	
	}
	armean =sum/n;
	
	System.out.println("Arithmetic Mean = " +armean);
	
	}

}
