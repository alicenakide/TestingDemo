
public class TypeCast {

	public static void main(String[] args) {
		byte h =127;
		int a =300;
		float a1= (float) 12.222;
		float g;
		short b =200;
		long c =999999;
		float e = (float) 345.89 ;
		double f = 45645.78222222222222;
		g=(float) f;
		
		System.out.println("Short b = " + g);
		System.out.println("Short b = " + b);
		System.out.println("Long c = " + c);
		System.out.println("Float e = " + e);
		System.out.println("Double f = " + f);
		System.out.println("Short b = " + b);
		
		System.out.println("Short to byte = " + (byte) b);
		System.out.println("Int to byte= " + (byte)a);
		System.out.println("Int to float= " + (float)a);
		System.out.println("Long to byte = " + (byte) c);
		
		System.out.println("Double to long = " + (long) f);
		System.out.println("Double to int = " + (int) f);
		System.out.println("Double to byte = " + (byte) f);
		System.out.println("Double to short = " + (short) f);
		System.out.println("Double to float = " + (float) f);
		
		System.out.println("Float to int = " + (int) e);
		System.out.println("Float to byte = " + (byte) e);
		System.out.println("Float to short = " + (short) e);
		System.out.println("Float to double = " + (double) e);
		System.out.println("Float to int = " + (int) e);
		
		System.out.println("Long to int = " + (int) c);
		System.out.println("Byte to int = " + (int) h);
	}
}
