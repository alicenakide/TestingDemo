
public class RemoveCharacterFromArray {

	public static void main(String[] args) {
	
	String s = "Umesh kumar kushwaha";
	String r[] = s.split("s|h");
	String res ="";
		
	for(String m:r){
	res = res + m;		
	}
	
	System.out.println(res);		
		
	}

}
