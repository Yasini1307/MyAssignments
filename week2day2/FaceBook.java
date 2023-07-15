package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException {
		
		// Step 2: Launch the chromebrowser
		ChromeDriver driver=new ChromeDriver();
		
		// Step 3: Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com");
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Step 6: Click on Create New Account button
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		// Step 7: Enter the first name
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Yasini");
		// Step 8: Enter the last name
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Santhanam");
		// Step 9: Enter the mobile number
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9944241137");
		// Step 10: Enterthe password
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Yasini@1307");
		// Step 11: Handle all the three drop downs
		WebElement dd1=driver.findElement(By.xpath("//select[@id='day']"));
		Select day=new Select(dd1);
		day.selectByValue("13");
		
		WebElement dd2=driver.findElement(By.xpath("//select[@id='month']"));
		Select month=new Select(dd2);
		month.selectByValue("7");
		
		WebElement dd3=driver.findElement(By.xpath("//select[@id='year']"));
		Select year=new Select(dd3);
		year.selectByValue("2000");
		
		// Step 12: Select the radio button "Female" 
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		driver.close();

	}

}
