import java.util.Scanner;

public class CalculateAvgPercentage {

	public static void main(String[] args) {
	
	int mark[]= new int [5];
	int i;
	float sum=0;
	float avg, perc;
	
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Enter marks obtained in 5 Subjects : ");
	
	for(i=0; i<5; i++){
		
		mark[i] = sc.nextInt();
		sum = sum + mark[i];
	}
	
	avg= sum/5;
	perc =(sum/500)* 100;
	
	System.out.println("Average Marks = " + avg);
	System.out.println("\nPercentage = " +perc+ "%");
	
	}

}
