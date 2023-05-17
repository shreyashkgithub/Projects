package Solution_5D;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Automation {

	public static void main(String[] args) throws InterruptedException {
	    WebDriver driver=new FirefoxDriver();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		
	 WebElement radio =	driver.findElement(By.xpath("//*[@type='radio']"));
	
	String s=radio.getAttribute("value");
	
	if(s.contains("M"))
	{
		radio.click();
	}
	
	driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("Shreyash");
	driver.findElement(By.cssSelector("#LastName")).sendKeys("Kanhed");
	driver.findElement(By.id("Email")).sendKeys("shreyashkanhed8898@gmail.com");
	driver.findElement(By.name("Password")).sendKeys("shreyash@5D");
	driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("shreyash@5D");
	driver.findElement(By.xpath("//input[@id='register-button']")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@class='button-1 register-continue-button']")).click();
		
		

	}

}
