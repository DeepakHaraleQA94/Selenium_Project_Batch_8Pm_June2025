package PuneriPatternValidation;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ValidateAboutUsPage {

	
	@Test
	public void validateAboutPage() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.puneripattern.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
		driver.findElement(By.xpath("//a/span[text()='About Us']")).click();
		
		String titleOfAboutPage = driver.getTitle();
		
		if(titleOfAboutPage.equals("About Us | Puneri Pattern")) {
			System.out.println("TC passed");
		}
		else {
			
			System.out.println("Tc failed");
		}
	
		System.out.println("my build has been done");
		driver.close();
	}
	
	
}
