import org.openqa.selenium.WebDriver;

public interface ICommonFunction {
	
	public WebDriver createWebDriver(String browserType);	
	public void waitForPageLoad(WebDriver driver, String type, String element, int waitTime);
	
}
