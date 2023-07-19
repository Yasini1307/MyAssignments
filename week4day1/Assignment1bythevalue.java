package week4day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment1bythevalue {
	public static void main(String[] args) throws InterruptedException {
		//disable notification
		 ChromeOptions option=new ChromeOptions();
		 option.addArguments("--disable-Notifications");
		 
		 //launch Browser
		 ChromeDriver driver=new ChromeDriver(option);
		 driver.get("https://buythevalue.in");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 //handle frame foropen widget
		 driver.switchTo().frame("dummy-chat-button-iframe");
		 driver.findElement(By.id("dummy-chat-button")).click();
		 
		 //handle frame2 for sendkeys toh the textare
		 driver.switchTo().frame("ShopifyChat");
		 driver.findElement(By.xpath("//textarea[@class='composer-bar__message-text ']")).sendKeys("Hi Yasini");
		 
		 //handle frame3 for close 
		 driver.findElement(By.xpath("//button[contains(@class,'chat-app--close-button')]")).click();
		 
		 //come out from the frame
		 driver.switchTo().defaultContent();
		 
		 //click the first product
		 driver.findElement(By.partialLinkText("URBAN")).click();
		 //enter the zipcode
		 driver.findElement(By.id("wk_zipcode")).sendKeys("639001");
		 //click check button
		 driver.findElement(By.xpath("//input[@class='btn']")).click();
		 //Click on ADD TO CART
		 driver.findElement(By.xpath("//button[@id='product-add-to-cart']")).click();
		 
		 //Click on View
		 driver.findElement(By.xpath("(//p[@class='success-message show-cart'])[2]")).click();
		 
		 //click checkout
		 driver.findElement(By.xpath("//input[@id='checkout']")).click();
		 
		 //handle alert
		 Alert click=driver.switchTo().alert();
		 
		 //gest alert text
		 String Alerttext=click.getText();
		 System.out.println(Alerttext);
		 
		 //click ok
		 Thread.sleep(3000);
		 click.accept();
		 
			}

		}
