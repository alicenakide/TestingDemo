import java.util.*;
public class Prime {

	public static void main(String[] args) {
	
		int flag;
		int x;
		int i;
		
		flag =0;
		
		int a[]= new int [7];
		
		for(x=0; x<args.length; x++){
		
		a[x]=Integer.parseInt(args[x]);
		
		for(i=2; i<(a[x]/2); i++){
			if((a[x]% i)== 0){
				break;
		}else flag=1;
			
		}
		if (flag==1)
		
		System.out.println(a[x] + "is a prime number");
		else 
		System.out.println(a[x] + "is not a prime number");
		flag =0;	
		}

	}

}
