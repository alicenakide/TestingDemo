import java.util.Scanner;

public class SwappingArray {

	public static void main(String[] args) {
    
	int [] a = new int [10];
	int [] b = new int [10];
	int [] c = new int [10];
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter First Array: ");
	
	for (int i=0; i<10; i++){
	a[i]=sc.nextInt();
		
	}
	
	System.out.println("Enter Second Array: ");
	for (int i=0; i<10; i++){
	b[i]=sc.nextInt();
	}
	
	System.out.println("Arrays before swapping");
	System.out.println("First Array");
	for(int i =0; i<10; i++){
	System.out.println(a[i]);
    }
	
	System.out.println("Second Array");
	for(int i =0; i<10; i++){
	System.out.println(b[i]);
	}
	
	for(int i=0; i<10; i++){   //Swapping technique
	c[i] =a[i];
	a[i] =b[i];
	b[i]= c[i];
	}
	
	System.out.println("Arrays after swapping ");
	System.out.println("First Array");
	for(int i =0; i<10; i++){
	System.out.println(a[i]);
    }
	
	System.out.println("Second Array");
	for(int i =0; i<10; i++){
	System.out.println(b[i]);
	}
		
		
	}		
		
	}

