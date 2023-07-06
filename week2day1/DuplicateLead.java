package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("yasini");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Santhanam");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("degu");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Automation testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("This is my week2 assignment");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("yasinyasin56911@gmail.com");
		WebElement state=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stat=new Select(state);
		stat.selectByVisibleText("New York");
		
		driver.findElement(By.name("submitButton")).click();
		String tittle=driver.getTitle();
		System.out.println(tittle);
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TL");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Yamini");
		driver.findElement(By.name("submitButton")).click();
		
		String ptittle=driver.getTitle();
		System.out.println(ptittle);
		
		
		

	}

}
