import java.util.Scanner;

public class CalculateGrade {

	public static void main(String[] args) {
	
		int mark [] = new int[5];
		int i;
		float sum=0;
		float avg;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter marks obtained in 5 subjects:  ");
			
		for (i=0; i<5; i++){
		mark[i] = sc.nextInt();
		sum=sum+mark[i];
		}
		
		avg=sum/5;
		
		System.out.println("Your grade is: ");
		
		if(avg>80){
			
		System.out.println("A");
		}
		
		else if (avg>60 && avg <=80){
		
			System.out.println("B");
			
		}
		
		else if (avg>40 && avg <=60){
			
			System.out.println("C");
			
		}
	else{
		
		System.out.println("D");
	}
	}

}
