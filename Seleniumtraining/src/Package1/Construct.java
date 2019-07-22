package Package1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Construct {
public static void main(String[] args) {
    // TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\VENKATESANMUNUSAMY\\Downloads\\chromedriver_win32\\chromedriver.exe");
                  
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.navigate().to("http://newtours.demoaut.com/");
WebElement username = driver.findElement(By.xpath("//*[@name='userName']"));
WebElement password = driver.findElement(By.xpath("//*[@name='password']"));

username.sendKeys("sunil");
password.sendKeys("sunil");
driver.findElement(By.name("login")).click();



List<WebElement> Link =  driver.findElements(By.tagName("a"));

//Converting list to an array
String []linkmsg =new String[Link.size()];

System.out.println(Link.size());



int i=0;

//Storing List elements text into String array
for(WebElement a: Link)
{
linkmsg[i]=a.getText();
if(i<=6)
{
System.out.println(linkmsg[i]);
}
i++;
}


driver.findElement(By.linkText("Home")).click();
System.out.println(driver.getTitle());
if(driver.getTitle().contains("Under Construction"))
{

System.out.println("Under Construnction")  ;     
}
else
{
System.out.println("No Under Construnction")  ;                     
}

driver.findElement(By.linkText("Flights")).click();
System.out.println(driver.getTitle());
if(driver.getTitle().contains("Under Construction"))
{

System.out.println("Under Construnction")  ;     
}
else
{
System.out.println("Not in  Under Construnction")  ;              
}

driver.findElement(By.linkText("Hotels")).click();

System.out.println(driver.getTitle());
if(driver.getTitle().contains("Under Construction"))
{

System.out.println("Under Construnction")  ;     
}
else
{
System.out.println("No Under Construnction")  ;                     
}
       
}                                    

}







