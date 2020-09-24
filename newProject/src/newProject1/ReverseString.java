package newProject1;

import org.testng.annotations.Test;

public class ReverseString {
	
@Test
public static void revsesSting() {
	String str="babu";
	String reverse="";
	for (int i = str.length()-1;i>=0;i--) {
		reverse=reverse+str.charAt(i);
	}
	System.out.println(reverse);
}
}
