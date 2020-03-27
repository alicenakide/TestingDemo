import java.io.IOException;

public class Armstrong {

	public static void main(String[] args) { 
	
		int num = Integer.parseInt(args[0]);
		int n=num;
		int check =0;
		int remainder;
		
		while(num>0){
			
		remainder = num%10;
		check = check + (int) Math.pow(remainder, 3);
		num = num/10;
			
		}
		
       if(check == n)
    	 System.out.println(n + "is an Armstrong Number");
    	   else 
    	 System.out.println(n + "is not an Armstrong Number");
       }
	}

