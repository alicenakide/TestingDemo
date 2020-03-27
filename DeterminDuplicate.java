
public class DeterminDuplicate {

	public static void main(String[] args) {
		
		String s = "ALice Norah Nakide Alice";
		
		int check =0;
		
		for(int i=0; i<s.length(); i++){
			
		for (int j =0; j<s.length(); j++){
		if(s.charAt(i) == s.charAt(i)&& i!=1)
			
		{
			check =1;
			break;
			
		}

			}
		}
		
		if (check==1){
			System.out.println("String doesn't have all unique characters");
		}else{
			System.out.println("String have all unique character");
		}
		
	}

}
