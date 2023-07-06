package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver web= new ChromeDriver();
		//Launch URL "http://leaftaps.com/opentaps/control/login"
		web.get("http://leaftaps.com/opentaps/control/login");
		
		//Enter UserName and Password Using Id Locator
		web.findElement(By.id("username")).sendKeys("DemoCSR");
		web.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click on Login Button using Class Locator
		web.findElement(By.className("decorativeSubmit")).click();
		
		//Click on CRM/SFA Link
		web.findElement(By.partialLinkText("CRM")).click();
		
		//Click on Accounts Button
		web.findElement(By.linkText("Accounts")).click();
		
		//Click on Create Account
		web.findElement(By.linkText("Create Account")).click();
		
		//Enter AccountName Field Using Xpath Locator value as Debit Limited Account
		web.findElement( By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
		
		//Enter DEscriptiion as "Selenium Automation Tester"
		web.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		//Enter LocalName Field Using Xpath Locator
		web.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("yasini");
		
		//Enter SiteName Field Using Xpath Locator
		web.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Testleaf");
		
		// Enter value for AnnualRevenue Field using Xpath Locator but class as Attribute
		web.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("6000");
		
		//Select Industry as ComputerSoftware
		WebElement industry=web.findElement(By.name("industryEnumId"));
		Select option=new Select(industry);
		option.selectByIndex(3);
		
		//Select OwnerShip as S-Corporation using SelectByVisibletext
		WebElement owner=web.findElement(By.name("ownershipEnumId"));
		Select own=new Select(owner);
		own.selectByVisibleText("S-Corporation");
		
		//Select Source as Employee using SelectByValue
		WebElement source=web.findElement(By.id("dataSourceId"));
		Select sour=new Select(source);
		sour.selectByValue("LEAD_EMPLOYEE");
		
		//Select Marketing Campaign as eCommerce Site Internal Campaign using SelectbyIndex
		WebElement campain=web.findElement(By.id("marketingCampaignId"));
		Select camp=new Select(campain);
		camp.selectByIndex(7);
		
		//Select State/Province as Texas using SelectByValue
		WebElement state=web.findElement(By.id("generalStateProvinceGeoId"));
		Select stat=new Select(state);
		stat.selectByValue("TX");
		
		//Click on Create Account using Xpath Locator
		web.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		

	}

}
