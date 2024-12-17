package test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethod;
import pages.HomePage;

public class TC_002_LoginTest extends ProjectSpecificationMethod{

	@BeforeTest
	public void setup() throws IOException {
		
		readFromPropFile("LoginTestData");
	}
	
	@Test (priority = 1)
	public void loginTest() {
		// TODO Auto-generated method stub

		HomePage obj = new HomePage(driver); 
		obj.emailId(prop.getProperty("validemail"))
		.password(prop.getProperty("validpassword"))
		.submitButton()
		.validateLogin();
		
	}

	
}
