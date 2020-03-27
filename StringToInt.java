
public class StringToInt {

	public static void main(String[] args) {
	
	String s= "888881"; //String declaration
	
	int a=0;           //Integer Declaration
	int num=0;
	int check =0;
	
	for(int i =0; i<s.length(); i++){
		
	if(s.charAt(i) == '-'){	
	check =1;
	}else{
		
	a=s.charAt(i);
	a=a-48;
	num = num * 10 + a;	
	}
	}
	if(check ==1){
		 
	num= num*(-1);
	 }
	System.out.println(num);
	
	}

}
