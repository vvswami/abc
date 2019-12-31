package abc_pack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_images {

	public static void main(String[] args) throws IOException {

		// System.setProperty("webdriver.chrome.driver", "D:\\Testing
		// Software\\Vishnu Sir_Selenium\\chromedriver.exe");

		// ChromeDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\Testing Software\\Vishnu Sir_Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		int q = 0;

		/*
		 * FileInputStream file = new FileInputStream(
		 * "D:\\Testing Software\\Broken_19_IP.xls"); HSSFWorkbook wb = new
		 * HSSFWorkbook(file); HSSFSheet s=wb.createSheet("Sheet2"); int
		 * TotalUrls = s.getLastRowNum(); System.out.println(TotalUrls);
		 * HSSFCell Cell = null;
		 */

		File source = new File("D:\\Testing Software\\Broken_19_IP.xls");
		FileInputStream input = new FileInputStream(source);
		HSSFWorkbook wb = new HSSFWorkbook(input);
		HSSFSheet sheet = wb.getSheet("Sheet2");
		int row = sheet.getLastRowNum();
		HSSFCell cell = null;
		System.out.println("Total Rows :" + row);

		for (int i = 0; i <= row; i++) {
			cell = sheet.getRow(i).getCell(0);
			String url = cell.toString();
			driver.get(url);
			//System.out.println("Current URL------>" + url);

			String Currenturl = driver.getCurrentUrl();
			System.out.println("Current URL---:" + Currenturl);

			String Title = driver.getTitle();
			System.out.println("SEO Title------------>:" + Title);
			
if(i==500)
	
{
	System.out.println("<===============================================>i value Count<===================================>");
}
			q = q + 1;
			FileInputStream f = new FileInputStream("C:\\Users\\venkataswami\\Desktop\\OP.xls");
			HSSFWorkbook work = new HSSFWorkbook(f);
			HSSFSheet sheet11 = work.getSheet("Sheet1");
			HSSFRow Row = sheet11.createRow(q);

			Cell cell0 = Row.createCell(0);
			cell0.setCellValue(Currenturl);

			Cell cell1 = Row.createCell(1);
			cell1.setCellValue(Title);

			FileOutputStream fos = new FileOutputStream("C:\\Users\\venkataswami\\Desktop\\OP.xls");
			work.write(fos);
			fos.close();
		}
		System.out.println("Task completed");

	}

}
