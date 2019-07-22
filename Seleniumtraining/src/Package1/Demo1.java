
package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VENKATESANMUNUSAMY\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		WebElement userName = driver.findElement(By.name("userName"));
		if(userName.isEnabled())
		{
			userName.sendKeys("sunil");
			Thread.sleep(3000);
			userName.clear();
			userName.sendKeys("sunil");
		}
		if(userName.isDisplayed())
		{
			System.out.println("is displayed");
		}
			
			
		}
		
		
	}


