package abcd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;






public class Loginpageq {

WebDriver driver;
public Loginpageq(WebDriver driver){
	this.driver=driver;
}
@FindBy(name="name") WebElement user1;
@FindBy(name="rad1") WebElement gender1;
@FindBy(name="dob") WebElement birth;
@FindBy(name="addr") WebElement addres;
@FindBy(name="city") WebElement city1;
@FindBy(name="state") WebElement state1;
@FindBy(name="pinno") WebElement pin;
@FindBy(name="telephoneno") WebElement tele;
@FindBy(name="emailid") WebElement email;
@FindBy(name="password") WebElement pass;
@FindBy(name="sub") WebElement button;

public void testcases(String uname,String ugender,String udob,String uaddres,String ucity,String ustate,String upin,String uphone,String uemail,String upass1){
	user1.sendKeys(uname);
	gender1.sendKeys(ugender);
	birth.sendKeys(udob);
	addres.sendKeys(uaddres);
	city1.sendKeys(ucity);
	state1.sendKeys(ustate);
	pin.sendKeys(upin);
	tele.sendKeys(uphone);
	email.sendKeys(uemail);
	pass.sendKeys(upass1);
	button.click();
	
	
	
	
	
	
	
	
	
	
	
	
}











}
