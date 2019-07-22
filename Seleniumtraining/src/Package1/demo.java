package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo {

	private static final WebElement Logout = null;

	@SuppressWarnings("null")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\VENKATESANMUNUSAMY\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VENKATESANMUNUSAMY\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//this is to find the element and pass value to the element
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		driver.findElement(By.xpath("//*[@id='welcome']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();	
		
					
		} 

		

	}


