package newProject1;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class Repository {
	@Test
	public static void readData() {
	try {
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"Repositories\\prop.properties");
		
		Properties prop=new Properties();
		prop.load(fis);
		System.out.println(fis.toString());
	
	} catch (Exception e) {
	
	}
	
}
}
