import java.util.Scanner;

public class DifferentNumbers {

	public static void main(String[] args) {
	
	int i;
	int countp =0;
	int countn =0;
	int countz =0;
	
	int arr[] = new int[10];
	
	Scanner sc =new  Scanner (System.in);
	
	System.out.println("Enter 10 numbers");
	for(i=0; i<10; i++){
		
	arr[i] = sc.nextInt();
	}
	
	for(i=0; i<10; i++){
		
	if(arr[i]<0){
	
	countn++;
	}
	else if (arr[i]== 0)
	{
		countz++;
	}
	else 
	{
		countp++;
	}
	}

	System.out.println(countp + " Positive Numbers");
	System.out.println("\n" + countn + " Negative Numbers ");
	System.out.println("\n" + countz + " Zero");
}
	
}