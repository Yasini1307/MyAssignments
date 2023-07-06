package week2day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchBrowser {

	public static void main(String[] args) {
		// lunch browser using obj
 ChromeDriver Driver=new ChromeDriver();
 
 //load url in current browser-use get()
 Driver.get("http://leaftaps.com/opentaps");
 
 //maximize window display-manage()
 Driver.manage().window().maximize();
 //enter username
 Driver.findElement(By.id("username")).sendKeys("demoSalesManager");
 //enter password
 Driver.findElement(By.id("password")).sendKeys("crmsfa");
 //click login button
 Driver.findElement(By.className("decorativeSubmit")).click();
 //click crmfa
 Driver.findElement(By.partialLinkText("SFA")).click();
 //click leads
 Driver.findElement(By.linkText("Leads")).click();
 //click create lead
 Driver.findElement(By.linkText("Create Lead")).click();
 //create mandatory fields1.company name
 Driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
 //enter first name
 Driver.findElement(By.id("createLeadForm_firstName")).sendKeys("yasini");
 //enter last name
 Driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
 //dropdown handling
 //click sourse dropdown
 WebElement sourceDD=Driver.findElement(By.id("createLeadForm_dataSourceId"));
 //object for select
 Select option=new Select(sourceDD);
 
 //SELEC BY INDEX
 option.selectByIndex(3);
 
 //select by text
 WebElement marketingcampain=Driver.findElement(By.id("createLeadForm_marketingCampaignId"));
 Select markcamp=new Select(marketingcampain);
 markcamp.selectByVisibleText("Automobile");
 
 //select by value
  WebElement industry=Driver.findElement(By.id("createLeadForm_industryEnumId"));
  Select indus=new Select(industry);
  indus.selectByValue("IND_AEROSPACE");
  
  //Driver.close();
 //Driver.findElement(By.name("submitButton")).click();
  //Driver.findElement(By.xpath("(//sapn[@class='requiredField']/following::input[1]"));
  //Driver.findElement(By.xpath("(//sapn[text()='Number Of Employees']/following::input[1]"));
 
 
 
	}

}
