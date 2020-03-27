
public class FindMinMaxString {

	public static void main(String[] args) {
		
     findMethod("My name is Alice Norah Nakide");
	}
	
	static public void findMethod(String s){
	 String str = s + "";
	 char ch;
	 int len =str.length();
	 int l =0;
	 int min=len;
	 int max =0;
	 
	 String shortest_word = "";
	 String longest_word  ="";
	 String word ="";
	 
	 for(int i =0; i<len; i++){
	  ch =str.charAt(i);
	  if(ch !=' '){
		  word +=ch;
	  }else{
		l=word.length();	  
		
	  if(l<min){
		  min=l;
		  shortest_word=word;
	  }
	  
	  if(l<max){
		  max=l;
		  longest_word=word;
	  
	  } word ="";
	 }
	 }
     
	 System.out.println("Shortest word " +shortest_word+ 
			 " with length " + min);
	 System.out.println("Longest word " +longest_word+ 
				 " with length " + max);
}
}
