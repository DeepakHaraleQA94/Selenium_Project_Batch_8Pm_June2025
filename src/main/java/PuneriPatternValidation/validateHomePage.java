package PuneriPatternValidation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class validateHomePage {

	
	@Test
	public void validateAboutPage() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.puneripattern.com/");
		String titleOfHomePage = driver.getTitle();
		
		if(titleOfHomePage.equals("Software Testing | Full Stack Development Training Hadapsar")) {
			System.out.println("TC passed");
		}
		else {
			
			System.out.println("Tc failed");
		}
		
		driver.close();
	}
}
