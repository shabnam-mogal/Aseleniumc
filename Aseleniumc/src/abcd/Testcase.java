package abcd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Testcase {

	public static void main(String[] args) {

		
		
		
		
System.setProperty("webdriver.chrome.driver", "E:/chrome91/chromedriver.exe");
WebDriver driver=new ChromeDriver();
Loginpage login=PageFactory.initElements(driver, Loginpage.class);
Loginpageq login1=PageFactory.initElements(driver, Loginpageq.class);
Newcustomer login2=PageFactory.initElements(driver, Newcustomer.class);
driver.get("http://www.demo.guru99.com/V4/index.php");
login.testcasename("mngr334254", "rApEmAr");
driver.navigate().to("http://www.demo.guru99.com/V4/manager/addcustomerpage.php");
login1.testcases("salmana", "female", "05/14/2000", "kothapetapost", "tirupati", "Andra pradesh", "1234567", "9123456780", "abcdefg.1234@gmail.com", "shabbu123@");
driver.navigate().to("http://www.demo.guru99.com/V4/manager/addAccount.php");

login2.Testcase("12345678", "Savings", "50001");
/*String url=driver.getCurrentUrl();
if(url.equals("http://www.demo.guru99.com/V4/manager/insertAccount.php")){
	System.out.println("saving account is sucessfully-passed");
}
else {
	System.out.println("saving account is usucessfully-failed");
}*/
	}

}
