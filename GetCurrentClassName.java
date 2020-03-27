
class A{
	
	public void display(){
		
	StackTraceElement ste[] = Thread.currentThread().getStackTrace();
	System.out.println("Method is called from " + ste[2]);	}
	}

public class GetCurrentClassName {
	
	public static void main(String[] args) {
		
		A a = new A();
		a.display();
	
 
	}

}
