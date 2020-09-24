package newProject1;

import org.testng.annotations.Test;

public class SwappingValues {
	
	public void swapping_With_Third_Variable() {
		int a=23;
		int b=32;
		System.out.println("Before swapping values a & b: "+a     +b);
		
		int temp=a;
		a=b;
		b=temp;
		
		System.out.println(a);
		System.out.println(b);
	}
	@Test
	public void swapping_WithOut_third_variable() {
		int a=2;
		int b=3;
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a);
		System.out.println(b);
		
	}
}
