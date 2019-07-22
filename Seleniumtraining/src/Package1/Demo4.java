
package Package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	private static final List<WebElement> Link = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VENKATESANMUNUSAMY\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        //This is a API command to maximize the browser
        driver.manage().window().maximize();
      //This command will open the URL in the browser  
      driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
     driver.findElement(By.id("txtUsername")).sendKeys("Admin");
     String value1=driver.findElement(By.id("txtUsername")).getAttribute("value");
     System.out.println("the value of usrname is --> " + value1);
     driver.findElement(By.id("txtPassword")).sendKeys("admin123");
     driver.findElement(By.id("btnLogin")).click();
     Thread.sleep(3000);
     driver.findElement(By.linkText("Performance")).click();
     List<WebElement> alllinks =  driver.findElements(By.tagName("a"));
     System.out.println("The Number of  links are -->" + alllinks.size());
     for(WebElement e:alllinks)
     {
    	String links =e.getText();
    	 System.out.println("The name of the links are -->" + links);
    		
     }
    

	}

}
