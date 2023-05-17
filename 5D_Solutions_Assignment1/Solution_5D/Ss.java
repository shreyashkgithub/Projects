package Solution_5D;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demowebshop.tricentis.com/onepagecheckout");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		 driver.findElement(By.xpath("//input[@autofocus='autofocus']")).sendKeys("shreyashkanhed8898@gmail.com");
			driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("shreyash@5D");
			driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
			driver.get("https://demowebshop.tricentis.com/onepagecheckout");
			
			driver.findElement(By.xpath("//div[@id='billing-buttons-container']/child::input[1]")).click();


	}

}
