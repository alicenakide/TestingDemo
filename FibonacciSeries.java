import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
	
		int a=0;
		int b = 1;
		int c =0;
		int limit;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Upto how many term ? ");
		limit=sc.nextInt();
		
		System.out.println("Fibonacci Series : " +a+" "+b+" ");
		c=a+b;
		
		limit =limit -2;
		while(limit>0){
			
			System.out.println(c+ " ");
			a=b;
			b=c;
			c=a+b;
			limit--;
		}

	}

}
