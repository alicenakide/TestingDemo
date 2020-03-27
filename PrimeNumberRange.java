import java.util.Scanner;

public class PrimeNumberRange {

	public static void main(String[] args) {
	
	int start;
	int end;
	int i;
	int j;
	int count =0;
	
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the range of numbers : \n ");
	
	System.out.println("Enter the starting number: ");
	start=sc.nextInt();
	
	System.out.println("Enter the ending number: ");
	end=sc.nextInt();
	
	
	System.out.println("Prime numbers between " +start+ "and" 
	                  +end+ "are \n" );
	
	for(i=start; i<=end; i++){
	
	count =0;
	for(j=2; j<i; j++){
		
		if(i%j == 0){
			
			count++;
			break;
		}
	}
		if(count== 0){
			
			System.out.println(i + " ");
		}
	}
}

}
	
	

