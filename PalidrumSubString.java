
public class PalidrumSubString {

	public static void main(String[] args) {
	
	String s = "My name is Alice Norah Nakide";
	String p[] = s.split("");
	String s2 = "";
	
	for(int j=0; j<p.length; j++){
		
	for(int i=p[j].length()-1; i>=0; i--)
	{
	 char z=p[j].charAt(i);
	 s2=s2+z;
	}
	if (p[j].equals(s2)){
		
	System.out.println(s2);
	}
	else{
		s2="";
	}
	}

	}

}
