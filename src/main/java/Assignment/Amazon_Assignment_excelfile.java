package Assignment;

import java.io.FileInputStream;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_Assignment_excelfile {
	public static void main(String[] args) throws Throwable {
		//Reading data
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\amazon.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String url = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(url);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Mobile");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Set<String> child = driver.getWindowHandles();
		for(String b:child) 
		{
			driver.switchTo().window(b);
		}
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[23]")).click();
		WebElement price = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal']/../../../..//span[@class='a-price-whole'])[21]"));
		System.out.println(price.getText());

}
}