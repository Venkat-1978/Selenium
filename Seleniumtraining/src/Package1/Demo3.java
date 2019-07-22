
package Package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3 {

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
			//Thread.sleep(3000);
			userName.clear();
			userName.sendKeys("sunil");
		}
		if(userName.isDisplayed())
		{
			//getattribute when ever we pass value to the edit field
			String UN = userName.getAttribute("value");
			String UN1 = userName.getAttribute("name");
			System.out.println(UN1);
			//gfettext -->label, dropdown, links
			//Getattribute --> Edit box where we pass value and if any element attribute is dynamic in nature
			String text =driver.findElement(By.xpath("//*[contains(text(),'Name:')]")).getText();
			Object system;
			System.out.println(text);
			System.out.println(UN);
			
		}
		
		driver.findElement(By.name("password")).sendKeys("sunil");
		driver.findElement(By.name("login")).click();
		if(driver.findElement(By.xpath("//*[@name='tripType' and @value='roundtrip']")).isSelected())
		{
			
		//work with radio button
			driver.findElement(By.xpath("//*[@name='tripType' and @value='oneway']")).click();
			
			//i am storing an element which is drop down in a variable
			WebElement DD = driver.findElement(By.name("passCount"));
			//select is going to click on the drop down
			Select sel = new Select(DD);
			//get all the values from the drop down
			List<WebElement> options = sel.getOptions();
			System.out.println(options.size());
			for(int i=0;i<options.size();i++)
{
	System.out.println(options.get(i).getText());
}
//Select the value from the dropdown
sel.selectByValue("2");
//getfirstselectedoption
WebElement first = sel.getFirstSelectedOption();
System.out.println(first.getAttribute("value"));
//direct by using id
String option1 = driver.findElement(By.name("passCount")).getAttribute("value");
System.out.println(option1);
Thread.sleep(3000);
sel.selectByVisibleText("1");
Thread.sleep(3000);
sel.selectByIndex(3);
driver.findElement(By.xpath("//*[@name='servClass' and @value='Business']")).click();
driver.findElement(By.name("findFlights")).click();
Thread.sleep(3000);
driver.findElement(By.name("reserveFlights")).click();

WebElement FirstName = driver.findElement(By.xpath("//*[@name='passFirst0']")); 

FirstName.sendKeys("Venkat");

WebElement LastName = driver.findElement(By.xpath("//*[@name='passLast0']")); 
      
LastName.sendKeys("Munu");

WebElement D = driver.findElement(By.name("pass.0.meal"));
Select sele = new Select(D);

Thread.sleep(200);

List<WebElement> Mealoptions = sele.getOptions();
sele.selectByIndex(1);

driver.findElement(By.name("creditnumber")).sendKeys("12222"); 
//This is to find both the elements using FindElements
List<WebElement>checkbox = driver.findElements(By.xpath("//*[@name='ticketLess' and @value='checkbox']"));
System.out.println("Checkbox size is-->" + checkbox.size());
//i value 0 it has to select both the checkboxes
for(int i=0;i< checkbox.size();i++)
{
	checkbox.get(i).click();
}
driver.findElement(By.name("buyFlights")).click();

}
		}
	}
	





		
		
		



