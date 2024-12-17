package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utils.UtilityClass;

public class ProjectSpecificationMethod extends UtilityClass {
	
	@BeforeMethod
	public void launchandLoadURL() {
		
		browserLaunch(prop.getProperty("browser"),prop.getProperty("url"));
		
	}
	
	
	@AfterMethod
	public void browsrClose() {
		
		closeBrowser();
		
	}
	
		
		
		
	}


