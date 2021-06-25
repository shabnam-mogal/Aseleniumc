package abcd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1 {

	public static void main(String[] args) {

		
		
		
		
System.setProperty("webdriver.chrome.driver", "E:/chrome91/chromedriver.exe");
WebDriver driver=new ChromeDriver();

Loginpage3 login=new Loginpage3(driver);
Newcustomer1 login1=new Newcustomer1(driver);
driver.get("http://demo.guru99.com/V1/index.php");
login.typeuser("mngr334254");
login.Typepass("rApEmAr");
login.submitbutton();
driver.navigate().to("http://demo.guru99.com/V1/html/addcustomerpage.php");
login1.customer1("shabbu");
login1.gender1("male");
login1.dob1("05/12/2001");
login1.addre1("kothapeta");
login1.city1("tirupati");
login1.state12("andra pradesh");
login1.pin("123456");
login1.tele("9123456780");
login1.email1("abcdef.123456@gmail.com");
login1.submit1();
	}

}
