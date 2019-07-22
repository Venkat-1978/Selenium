
package Package1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo5 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VENKATESANMUNUSAMY\\Downloads\\chromedriver_win32\\chromedriver.exe");
	                  
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("http://realestate.upskills.in/wp-admin/");
		driver.findElement(By.id("user_login")).sendKeys("admin");
		driver.findElement(By.id("user_pass")).sendKeys("adminuser@12345");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@name='login' and @value='Sign In']")).click();
		WebElement link = driver.findElement (By.xpath("//*[contains(text(),'Howdy')]"));
		Actions act = new Actions(driver);
		act.contextClick(link).build().perform(); 
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		String URL = driver.getCurrentUrl();
		System.out.println(URL);

	}
	

}
