package test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethod;
import pages.HomePage;

public class TC_001_SignupTest extends ProjectSpecificationMethod {


	@BeforeTest
	public void setup() throws IOException {
		
		readFromPropFile("LoginTestData");
	}
	
	
	@Test (priority = 0)
	public void signupTest() {
		// TODO Auto-generated method stub

		HomePage obj = new HomePage(driver);
		obj.signupClick()
		.firstName()
		.lastName()
		.emailId()
		.pass()
		.submitButton()
		.validateSignup();
		
		
	}

}
