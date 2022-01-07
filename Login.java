package week2.Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		// WebElement username = driver.findElement(By.id("username"));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		// username.sendKeys("DemoSalesManager");
		// driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		// driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		// driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		// driver.findElement(By.linkText("Leads")).click();;
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		// driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("WIPRO");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Ganesh");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("B");
		// driver.findElement(By.id("createLeadForm_companyName")).sendKeys("WIPRO");
		// driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ganapathy1");
		// driver.findElement(By.id("createLeadForm_lastName")).sendKeys("B");
		WebElement ss = driver.findElement((By.xpath("//select[@id='createLeadForm_dataSourceId']")));
		// WebElement ss = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropdown = new Select(ss);
		dropdown.selectByIndex(1);
		// List<WebElement> options = dropdown.getOptions();
		// System.out.println( options.get(1));
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		// driver.findElement(By.className("smallSubmit")).click();
		driver.close();

	}

}
