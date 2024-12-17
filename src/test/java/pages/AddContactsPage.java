package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificationMethod;

public class AddContactsPage extends ProjectSpecificationMethod {
	
	
	public AddContactsPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	

}
	
	
	
