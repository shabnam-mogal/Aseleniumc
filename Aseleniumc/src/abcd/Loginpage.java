package abcd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {

	
	

	
	
	
	
WebDriver driver;
public Loginpage(WebDriver driver){
this.driver=driver;
}
@FindBy(name="uid")	WebElement user;
@FindBy(name="password") WebElement pass;
@FindBy(name="btnLogin") WebElement button;
public void testcasename(String uname,String upass){
	user.sendKeys(uname);
	pass.sendKeys(upass);
	button.click();
	
}
}
