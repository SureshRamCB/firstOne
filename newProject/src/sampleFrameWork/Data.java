package sampleFrameWork;

import org.openqa.selenium.WebDriver;

public class Data {
	public static WebDriver driver;
	
	public static ThreadLocal<Data> dataThread=new ThreadLocal<Data>();
	
	public static void set(Data data) {
		dataThread.set(data);
	}
	public static Data get() {
		return dataThread.get();
	}
}
