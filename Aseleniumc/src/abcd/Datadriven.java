package abcd;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datadriven {

	
	
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws IOException, Exception {

System.setProperty("webdriver.chrome.driver", "E:/chrome91/chromedriver.exe");
FileReader f=new FileReader("C:/Users/salman/Desktop/datadriven.txt");
BufferedReader br=new BufferedReader(f);
int a=0;
int b=0;
String line;
while((line=br.readLine())!=null){
	a=a+1;
	b=b+1;
	if(a>0){
		String[] input=line.split(",",2);
driver=new ChromeDriver();
driver.get("http://demo.guru99.com/V1/index.php");
driver.findElement(By.name("uid")).sendKeys(input[0]);
driver.findElement(By.name("password")).sendKeys(input[1]);
driver.findElement(By.name("btnLogin")).click();
//Thread.sleep(4000);
//String url=driver.getCurrentUrl();
//if(url.equals("")){
		
		
		
		
	}
}
	

	}

}
