package week2day2;

import org.openqa.selenium.By;


import org.openqa.selenium.chrome.ChromeDriver;



public class LaunchBrowserXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver Driver=new ChromeDriver();
		 
		 //load url in current browser-use get()
		 Driver.get("http://leaftaps.com/opentaps");
		 
		 //maximize window display-manage()
		 Driver.manage().window().maximize();
		 //enter username
		 Driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demoSalesManager");
		 //enter password
		 Driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		 //click login button
		 Driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		 //click crmfa
		 Driver.findElement(By.xpath("//a[contains(text(),'CRM']")).click();
		 //click leads
		 Driver.findElement(By.xpath("//a[text(),'Leads']")).click();
		 
		 
		 
		 
		 
			}

		

	}


