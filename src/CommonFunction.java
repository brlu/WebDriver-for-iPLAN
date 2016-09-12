import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonFunction implements ICommonFunction{

	public WebDriver createWebDriver(String browserType){
		WebDriver driver = null;
		if (browserType == "FIREFOX"){
			driver =  new FirefoxDriver();			
		}else if (browserType == "CHROME"){
			System.setProperty("webdriver.chrome.driver", "c:\\Java\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		return driver;
	}

	public void waitForPageLoad(WebDriver driver, String type, String element, int waitTime) {

		WebDriverWait wait = new WebDriverWait(driver, waitTime);

		if (type.toUpperCase() == "ID") {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id(element)));
		} else if (type.toUpperCase() == "XPATH")
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(element)));
	}

}
