
public class CalculateAscii {

	public static void main(String[] args) {
		
		word("Alice Norah Nakide");

	}
	
	static void word(String s){
		
		int len=s.length();
		int a;
		char a1;
		
		for (int i=0; i<len; i++){
		a1=s.charAt(i);
		a=a1;
		
		System.out.println(a1 + "-->" + a);
			
		}
	}

}
