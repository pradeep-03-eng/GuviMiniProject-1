package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificationMethod;

public class HomePage extends ProjectSpecificationMethod {
	
	
	@FindBy(id = "signup")
	WebElement signup;
	
	public HomePage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	public SignupPage signupClick() {
		
		driver.findElement(By.id("signup")).click();
		return new SignupPage(driver);
		
	}
	
	
	@FindBy(id="Email")
	WebElement emailId;
	
	@FindBy(id="password")
	WebElement pass;
	
	@FindBy(id = "submit")
	WebElement submitButton;
	
	public void LoginPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public HomePage emailId(String emailId) {
		sendKeysMethod(driver.findElement(By.id("email")), emailId);
		return this;
		
	}
	
	public HomePage password(String pass) {
		sendKeysMethod(driver.findElement(By.id("password")), pass);
		return this;
		
	}
	
	public HomePage submitButton() {
		driver.findElement(By.id("submit")).click();
		return this;
		
	}
	
	
	public HomePage validateLogin() {
		
		String expectedId = "Contact List";
		String actualId = driver.findElement(By.xpath("//h1[text()='Contact List']")).getText();
		
		if(expectedId.equalsIgnoreCase(actualId)) {
			
			System.out.println("Login Passed");
		} else {
			
			System.out.println("Login Failed");
			
		}
		
		return this;
		
	}


	public HomePage details() {
		
		driver.findElement(By.xpath("//button[@id='add-contact']")).click();
		driver.findElement(By.id("firstName")).sendKeys("Pradeep");
		driver.findElement(By.id("lastName")).sendKeys("Kumar");
		driver.findElement(By.id("birthdate")).sendKeys("1991/11/03");
		driver.findElement(By.id("email")).sendKeys("pradeep01@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("9810000011");
		driver.findElement(By.id("street1")).sendKeys("Mosque Street");
		driver.findElement(By.id("city")).sendKeys("Coimbatore");
		driver.findElement(By.id("stateProvince")).sendKeys("Tamil Nadu");
		driver.findElement(By.id("postalCode")).sendKeys("641001");
		driver.findElement(By.id("country")).sendKeys("India");
		driver.findElement(By.id("submit")).click();
		
		return new HomePage(driver);
		
	}

	public HomePage validateAddcontacts() {
		
		String expectedId = "Click on any contact to view the Contact Details";
		String actualId = driver.findElement(By.xpath("//p[contains(text(), 'Click on any contact to view the Contact Details')]")).getText();
		
		if(expectedId.equalsIgnoreCase(actualId)) {
			
			System.out.println("Contacts Added Successfully");
		}else{
			
			System.out.println("Contacts Failed To Add");
			
		}
		
		return new HomePage(driver);
		
	}
	
	public HomePage newcontacts() {
		
		driver.findElement(By.xpath("//button[@id='add-contact']")).click();
		driver.findElement(By.id("firstName")).sendKeys("Stephen");
		driver.findElement(By.id("lastName")).sendKeys("Raj");
		driver.findElement(By.id("birthdate")).sendKeys("1985/11/03");
		driver.findElement(By.id("email")).sendKeys("stephen@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("9810230011");
		driver.findElement(By.id("street1")).sendKeys("church Street");
		driver.findElement(By.id("city")).sendKeys("Bangalore");
		driver.findElement(By.id("stateProvince")).sendKeys("Karnataka");
		driver.findElement(By.id("postalCode")).sendKeys("560001");
		driver.findElement(By.id("country")).sendKeys("India");
		driver.findElement(By.id("submit")).click();
		
		return new HomePage(driver);
		
	}
	
	public HomePage contactsEdit() {
		
		driver.findElement(By.xpath("//td[text()='Stephen Raj']")).click();
		driver.findElement(By.xpath("//button[@id='edit-contact']")).click();
		driver.findElement(By.id("firstName")).clear();
		driver.findElement(By.id("firstName")).sendKeys("Madhan ");
		driver.findElement(By.id("lastName")).clear();
		driver.findElement(By.id("lastName")).sendKeys("Kumar");
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("Madhan@gmail.com");
		driver.findElement(By.id("phone")).clear();
		driver.findElement(By.id("phone")).sendKeys("9810009999");
		driver.findElement(By.id("street1")).clear();
		driver.findElement(By.id("street1")).sendKeys("Mosque Street");
		driver.findElement(By.id("city")).clear();
		driver.findElement(By.id("city")).sendKeys("Kolkata");
		driver.findElement(By.id("stateProvince")).clear();
		driver.findElement(By.id("stateProvince")).sendKeys("West Bengal");
		driver.findElement(By.id("postalCode")).clear();
		driver.findElement(By.id("postalCode")).sendKeys("400002");
		driver.findElement(By.id("submit")).click();
		

		return new HomePage(driver);
		
	}
	
	public HomePage validatecontactsEdit() {
		
		String expectedId = "Return to Contact List";
		String actualId = driver.findElement(By.xpath("//button[@id='return']")).getText();
		
		if(expectedId.equalsIgnoreCase(actualId)) {
			
			System.out.println("Contacts Edited Successfully");
		}else{
			
			System.out.println("Contacts Edited Failed");
			
		}
		
		return this;
		
	}
	
	
	public HomePage deletecontacts() throws InterruptedException {
		
		driver.findElement(By.xpath("//td[text()='Pradeep Kumar']")).click();
		driver.findElement(By.id("delete")).click();
		
		
		Thread.sleep(1000);
		
		 Alert alert = driver.switchTo().alert();
	        alert.accept();
		
	      driver.findElement(By.id("triggerAlertButton")).click();

		return new HomePage(driver);
		
	}
	
	
	public HomePage validatedeletecontacts() {
		
		String expectedId = "Click on any contact to view the Contact Details";
		String actualId = driver.findElement(By.xpath("//p[contains(text(), 'Click on any contact to view the Contact Details')]")).getText();
		
		if(expectedId.equalsIgnoreCase(actualId)) {
			
			System.out.println("Contacts Deleted Successfully");
		}else{
			
			System.out.println("Contacts Failed To Delete");
			
		}
		
		return this;
		
	}
	
	
	
	}


	
