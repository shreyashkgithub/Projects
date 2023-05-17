package Solution_5D;

import java.lang.reflect.Array;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Search {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Jeans");
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//ul[@id='ui-id-1']/li")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@class='button-1 add-to-cart-button']")).click(); // clicking on add to cart
		 
		 driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();  // clicking on shopping cart
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@name='removefromcart']")).click();
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//input[@name='termsofservice']")).click();
			
		 
		 driver.findElement(By.xpath("//button[@class='button-1 checkout-button']")).click();
		 
		 driver.findElement(By.xpath("//input[@autofocus='autofocus']")).sendKeys("shreyashkanhed8898@gmail.com");
			driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("shreyash@5D");
			driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();

			 driver.findElement(By.xpath("//input[@name='termsofservice']")).click();
				
			 
			 driver.findElement(By.xpath("//button[@class='button-1 checkout-button']")).click();


		 
		 driver.findElement(By.xpath("//input[@id='BillingNewAddress_Company']")).sendKeys("5D solutions");
		 Thread.sleep(1000);
		 
	WebElement dd=	driver.findElement(By.xpath("//select[@id='BillingNewAddress_CountryId']"));
	
	Select select=new Select(dd);
	select.selectByVisibleText("India");
	
	driver.findElement(By.xpath("//input[@data-val-required='City is required']")).sendKeys("Pune");
	driver.findElement(By.xpath("//input[@data-val-required='Street address is required']")).sendKeys("Aqua Mejestique society");
	driver.findElement(By.xpath("//label[text()='Address 2:']/following-sibling::input[1]")).sendKeys("Hadapsar");
	driver.findElement(By.xpath("//div[@class='inputs']/child::input[@id='BillingNewAddress_ZipPostalCode']")).sendKeys("412308");
	driver.findElement(By.xpath("//div[@class='inputs']/child::input[@id='BillingNewAddress_PhoneNumber']")).sendKeys("7249197251");
	driver.findElement(By.xpath("//div[@class='inputs']/child::input[@id='BillingNewAddress_FaxNumber']")).sendKeys("123456789");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[@class='buttons']/child::input[@onclick='Billing.save()']")).click();
	
	Thread.sleep(2000);
	
	
/*	WebElement frame=driver.findElement(By.xpath("//div[@id='billing-buttons-container']"));
	driver.switchTo().frame(frame);
	Thread.sleep(2000); */
/*	int a=driver.findElements(By.tagName("iframe")).size();
	System.out.println(a);
	*/
			driver.findElement(By.xpath("//div[@id='billing-buttons-container']/child::input[1]")).click();
	
	
	/*	WebElement dd2=	driver.findElement(By.xpath("//select[@id='billing-address-select']/parent::div"));
	Select sel=new Select(dd2);
	sel.selectByIndex(0);
	
	WebElement btn=driver.findElement(By.xpath("//div[@id='billing-buttons-container']/child::input[1]"));		
	
		if(btn.equals(btn))
		{
			btn.click();
		}
	
	*/	
	
		 
		 
		 
		 
		 
/*		WebElement w= driver.findElement(By.xpath("//ul[@id='ui-id-1']/li"));
	
		for(WebElement i:w)
		{
			String s=i.getText();
			System.out.println(s);
		
		
		if(s.contains("Blue Jeans"))
		{
			i.click();
			break;
		}
		}
		 
		
	*/	
	}
	

}

