package Solution_5D;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Billing {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demowebshop.tricentis.com/onepagecheckout");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		 driver.findElement(By.xpath("//input[@autofocus='autofocus']")).sendKeys("shreyashkanhed8898@gmail.com");
			driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("shreyash@5D");
			driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
			driver.get("https://demowebshop.tricentis.com/onepagecheckout");
			
			driver.findElement(By.xpath("//div[@id='billing-buttons-container']/child::input[1]")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@onclick='Shipping.save()']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@id='shippingoption_1']")).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//input[@class='button-1 shipping-method-next-step-button']")).click();
			
			Thread.sleep(2000);

			driver.findElement(By.xpath("//input[@class='button-1 payment-method-next-step-button']")).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//input[@class='button-1 payment-info-next-step-button']")).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//input[@class='button-1 confirm-order-next-step-button']")).click();
			Thread.sleep(3000);

			driver.findElement(By.xpath("//input[@class='button-2 order-completed-continue-button']")).click();

	}

}
