import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
	
		int num;
		int count = 0;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number : ");
		num =sc.nextInt();
		
		for(int i=2; i<num; i++){
		
		if (num%i==0){
			
			count++;
			break;
		}
		
		}
      if(count == 0){
      
      System.out.println ("This is  a prime number");	  
      }
      else {
      System.out.println ("This is not a prime number");
      }
	}

}
