package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Newcustomer1 {

	
	
	
	
	
	
	WebDriver driver;
	
By customer=By.name("name");
By gen=By.name("rad1");
By dob1=By.name("dob");
By add=By.name("addr");
By cit=By.name("city");
By state1=By.name("state");
By pin1=By.name("pinno");
By telephone1=By.name("telephoneno");
By email=By.name("emailid");
By sub1=By.name("sub");

public Newcustomer1(WebDriver driver){
	this.driver=driver;
	
}
public void customer1(String uname){
	driver.findElement(customer).sendKeys(uname);
}

public void gender1(String ugender){
	driver.findElement(gen).sendKeys(ugender);
}
public void dob1(String udob){
	driver.findElement(dob1).sendKeys(udob);
}
public void addre1(String uaddress){
	driver.findElement(add).sendKeys(uaddress);
}
public void city1(String ucity){
	driver.findElement(cit).sendKeys(ucity);
}
public void state12(String ustate){
	driver.findElement(state1).sendKeys(ustate);
}
public void pin(String upin){
	driver.findElement(pin1).sendKeys(upin);
}

public void tele(String utelephone){
	driver.findElement(telephone1).sendKeys(utelephone);
}
public void email1(String uemail){
	driver.findElement(email).sendKeys(uemail);
}
public void submit1(){
	driver.findElement(sub1).click();
	
}


}
