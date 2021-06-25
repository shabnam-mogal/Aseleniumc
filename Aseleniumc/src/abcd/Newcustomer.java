package abcd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;







public class Newcustomer {

	
	
	
	
	
	WebDriver driver;
	public Newcustomer(WebDriver driver){
		this.driver=driver;
		
	}
	@FindBy(name="cusid") WebElement cus;
	@FindBy(name="selaccount") WebElement account;
	@FindBy(name="inideposit") WebElement deposit;
	@FindBy(name="button2") WebElement but;
	public void Testcase(String ucus,String uaccount,String udeposit){
		cus.sendKeys(ucus);
		account.sendKeys(uaccount);
		deposit.sendKeys(udeposit);
		but.click();
	}
	
}
