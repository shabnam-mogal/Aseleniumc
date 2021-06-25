package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage3 {

	
	
	
	
	
WebDriver driver;
By user=By.name("uid");

By pass=By.name("password");

By button=By.name("btnLogin");

public Loginpage3(WebDriver driver){
	
	this.driver=driver;
}
public void typeuser(String uname){
	driver.findElement(user).sendKeys(uname);
}
public void Typepass(String upass){
	driver.findElement(pass).sendKeys(upass);
}
public void submitbutton(){
	driver.findElement(button).click();
}

	
}
