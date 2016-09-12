

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

	public static WebDriver driver;
	public static ICommonFunction commonfunc;
	String uid;
	String pwd;
	
	public Login() throws InterruptedException{
		commonfunc= new CommonFunction();
		driver = commonfunc.createWebDriver("FIREFOX");	
		driver.get("http://192.168.7.106/rim/irim_login.php");
		//driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		Thread.sleep(2000);
	}
	
	@BeforeClass
	public static void initialize(){
		System.out.println("system initialize");
	}
	
	@Before
	public void setUserAcount() throws InterruptedException{
		this.uid = "qa1_superuser";
		this.pwd = "310H1m";
		Thread.sleep(2000);
		//commonfunc.waitForPageLoad(driver, "XPATH", "//*[@id='userid']", 5);
	}
	
	@Test
	public void userLogin() throws InterruptedException{		
		driver.findElement(By.xpath("//*[@id='userid']")).sendKeys(this.uid);		
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(this.pwd);		
		driver.findElement(By.xpath("//*[@id='btn_login']")).click();
		Thread.sleep(2000);

		System.out.println();		
		System.out.println("User ID : "+ this.uid +", Login--> Passed");		
	}
	
	@After
	public void leave(){
		System.out.println();
		System.out.println("User Login--> Passed");
		
		//driver.quit();		
	}
	

}


