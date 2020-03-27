import java.util.Scanner;

public class LargestOfThree {

	public static void main(String[] args) {

		int a;
		int b;
		int c;
		int big;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the three numbers: ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		big =a;
		
		if(big<b){
			
		if(b>c){	
	
		  big =b;
		}
		else {
			big =c;
		} 
		}
		
		else if(big<c) {
			if(c>b)
		{
			big =c;
		}
		
		else {
			
			big =b;
	}
	
	}	
	
	else{
		 big =a;
	}
	
		System.out.println("The largest number of the three is  : " + big);
	}

	}


