package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.ProjectSpecificationMethod;

public class RegisterResult extends ProjectSpecificationMethod {

	public RegisterResult(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	public HomePage validateSignup() {
		
		String expectedId = "Contact List";
		String actualId = driver.findElement(By.xpath("/html/body/div[1]/header/h1")).getText();
		
		if(expectedId.equalsIgnoreCase(actualId)) {
			
			System.out.println("Signup Passed");
		}else{
			
			System.out.println("Signup Failed");
			
		}
		
		return new HomePage(driver);
		
	}

}

	
