import java.lang.reflect.Method;

 public class A{
	
	private void message(){
	
	System.out.println("Hello Java");
	}
}

public class MethodCall {

	public static void main(String[] args) throws Exception {
	Class c = Class.forName("A");
	Object o = c.newInstance();
	Method m = c.getDeclaredMethod("Message", null);
	m.setAccessible(true);
	m.invoke(o, null);

	}

}
