package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.ProjectSpecificationMethod;

public class SignupPage extends ProjectSpecificationMethod {
	

	public SignupPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public SignupPage firstName() {
		
		driver.findElement(By.id("firstName")).sendKeys("Michael");
		return this;
		
	}
	
	public SignupPage lastName() {
		driver.findElement(By.id("lastName")).sendKeys("Raj");
		return this;
		
	}
	
	public SignupPage emailId() {
		driver.findElement(By.id("email")).sendKeys("michaelraj@gmail.com");
		return this;
			
	}
	
	public SignupPage pass() {
		driver.findElement(By.id("password")).sendKeys("1234567");
		return this;
}
	
	public RegisterResult submitButton() {
		driver.findElement(By.id("submit")).click();
		return new RegisterResult(driver);
		
	}
	
	
}
