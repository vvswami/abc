package abc_pack;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class abc {
	
	
	@Test
	//public static void main(String[]args)
	
	public  void browser()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Testing Software\\Vishnu Sir_Selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println("Test pass");
	}
	
	
	

}
