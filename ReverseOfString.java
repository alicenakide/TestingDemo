import java.io.BufferedReader;

public class ReverseOfString {

	public static void main(String[] args) {
		
	String backwards = reverseString("Umesh Kushwala");
	System.out.println("Reverse String is " + backwards);

	}

	public static String reverseString(String s){
	
	int l = s.length();
	String backward ="";
	for(int i=l-1; i>=0; i--){
	
		backward = backward + s.charAt(i);
	}
	return backward;
}
}