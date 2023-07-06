package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

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
		
		WebElement source=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sour=new Select(source);
		sour.selectByVisibleText("Employee");
		
		WebElement campain=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select camp=new Select(campain);
		camp.selectByValue("9001");
		
		WebElement ownership=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select owner=new Select(ownership);
		owner.selectByIndex(5);
		
		WebElement country=driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select coun=new Select(country);
		coun.selectByVisibleText("India");
		
		driver.findElement(By.name("submitButton")).click();
		//Get the Title of the resulting Page
		String tittle=driver.getTitle();
		System.out.println(tittle);
		
		

	}

}
