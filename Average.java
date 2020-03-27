import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in); //To take user input
	
	int choice;
	int a;
	int min;
	int max;
	int x;
	
	a=0;
	min =0;
	max =0;
	
	int n = args.length;
	
	System.out.println("1-Sum");
	System.out.println("2-Average");
	System.out.println("3- Minimum");
	System.out.println("4- Maximum");
	System.out.println("Enter Your Choice");
	
	choice = sc.nextInt();
	
	for(int i=0; i<n; i++){
	a += Integer.parseInt(args[i]);  //To convert string to integer
	}
	
	switch(choice){
	
	case 1: 
     System.out.println("The sum is : " + a);
     break;
	case 2:
	System.out.println("The average is : " + a/n);
	break;
	case 3:
	
	for (int i=0; i<n-1; i++ ){
	x=Integer.parseInt(args[i]);
	if(x<Integer.parseInt(args[i+1]))
		min=x;
	else min = Integer.parseInt(args[i + 1]);
	}
	System.out.println("The minimum is : " + min);
	break;
	
	case 4:
	for(int i=0; i<n-1; i++){
	
	x=Integer.parseInt(args[i]);
	if(x>Integer.parseInt(args[i+1]))
		max=x;
	else 
		max = Integer.parseInt(args[i + 1]);
	}
	System.out.println("The maximum is : " + max);
	break;
	}
	
	}
}	
	
