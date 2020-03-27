import java.util.Scanner;

public class CheckVowelOrNot {

	public static void main(String[] args) {
	
	char ch;
	
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Enter vowel as a character");
	ch=sc.next().charAt(0);
	
	if(ch=='a' || ch=='e' || ch=='i'||ch=='o'||ch=='u'||
	   ch=='A'|| ch=='E' || ch=='I' || ch=='O' || ch == 'U')
	{
     System.out.println("This is a vowel");
	 
	}
	else{
		
    System.out.println("This is not a vowel");
	}
		   

	}

}
