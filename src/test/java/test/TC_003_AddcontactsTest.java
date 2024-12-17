package test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethod;
import pages.HomePage;

public class TC_003_AddcontactsTest extends ProjectSpecificationMethod {
	

	@BeforeTest
	public void setup() throws IOException {
		
		readFromPropFile("LoginTestData");
	}

	
	@Test (priority = 2)
	public void addContactsTest() throws IOException {
		// TODO Auto-generated method stub

		readFromPropFile("LoginTestData");
		HomePage obj = new HomePage(driver);
		obj.emailId(prop.getProperty("validemail"))
		.password(prop.getProperty("validpassword"))
		.submitButton()
		.details()
		.newcontacts()
		.validateAddcontacts();
		
		
	}

}
