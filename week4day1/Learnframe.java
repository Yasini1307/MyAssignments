package week4day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learnframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm ");
		//switch control to Frame
		driver.switchTo().frame("iframeResult");
		//click tryit button
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		//switch control to alert
		Alert a1=driver.switchTo().alert();
		
		//click ok button
		
		a1.accept();
		
		//verity by text
		String text=driver.findElement(By.xpath("//p[text()='You pressed OK!']")).getText();
		if(text.contains("pressed")) {
			System.out.println("suceessfully pressed");
		}
		else {
			System.out.println("unsuccessfull");
		}
		

	}

}
