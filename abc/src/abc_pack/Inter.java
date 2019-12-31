package abc_pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inter {
	
	
	
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Testing Software\\Vishnu Sir_Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.career-info.in/india/colleges/list-of-colleges-in-hyderabad.html");
		driver.manage().window().maximize();
	}

}
