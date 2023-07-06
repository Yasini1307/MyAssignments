package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

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
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("yasinyasin56911@gmail.com");
		WebElement state=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stat=new Select(state);
		stat.selectByVisibleText("New York");
		
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();//clear()used to remove the excisting text
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("mandatory to do assessment");
		driver.findElement(By.name("submitButton")).click();
		
		String tittle=driver.getTitle();
		System.out.println(tittle);
		
		
		

	}

}
