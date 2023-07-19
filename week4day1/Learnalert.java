package week4day1;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learnalert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		//switch control to alert
        Alert a1=driver.switchTo().alert();
        //print alert text
          String text=a1.getText();
          System.out.println(text);
          //enter message inside the alert
          Thread.sleep(3000);
          a1.sendKeys("yasini");
          //click ok
          Thread.sleep(3000);
          a1.accept();
          //print verify text
          String verify=driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
          System.out.println(verify);
          //check the verification
          if(verify.contains("name")) {
        	  System.out.println("successfull");
        	  
          }
          else {
        	  System.out.println("Not successfull");
          }
        
        
        
        
	}

}
