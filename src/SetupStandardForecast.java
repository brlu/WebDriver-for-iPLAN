import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SetupStandardForecast extends StandardForecastNavigate{

	WebDriver driver;
	String target;
	String hist_period = "26";
	String fcst_period = "13";
	
	public SetupStandardForecast(){
		driver = Login.driver;
	}
	
	@Test
	public void setupFcstDefinition() throws InterruptedException{

		super.nagivateToStandardForecast();
		//driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
		//Select Standard Forecast Definition
		this.target = "html/body/form/table/tbody/tr/td[3]/wizard/div/div[2]/div[1]/ol/li[2]/span";
		//Login.commonfunc.waitForPageLoad(driver, "xpath", this.target, 3);
		driver.findElement(By.xpath(this.target)).click();
		Thread.sleep(2000L);

		//Select System Standard Forecast
		this.target = "html/body/form/table/tbody/tr/td[3]/wizard/div/div[2]/div[1]/ol/li/span";
		//Login.commonfunc.waitForPageLoad(driver, "xpath", this.target, 3);
		driver.findElement(By.xpath(this.target)).click();
		Thread.sleep(2000L);

		// change history period
		this.target = "html/body/form/table/tbody/tr/td[3]/wizard/div/div[2]/table/tbody/tr[6]/td[2]/input";
		//Login.commonfunc.waitForPageLoad(driver, "xpath", this.target, 3);
		driver.findElement(By.xpath(this.target)).clear();
		driver.findElement(By.xpath(this.target)).sendKeys(hist_period);
		Thread.sleep(2000L);

		// change fcst period
		this.target = "html/body/form/table/tbody/tr/td[3]/wizard/div/div[2]/table/tbody/tr[8]/td[2]/input";
		//Login.commonfunc.waitForPageLoad(driver, "xpath", this.target, 3);
		driver.findElement(By.xpath(this.target)).clear();
		driver.findElement(By.xpath(this.target)).sendKeys(fcst_period);
		Thread.sleep(2000L);

		//next btn
		this.target = "html/body/form/table/tbody/tr/td[3]/wizard/div/div[2]/input[2]";
		driver.findElement(By.xpath(this.target)).click();
		Thread.sleep(3000L);
		
		//Select Dataset Tree
		this.target = "html/body/form/table/tbody/tr/td[3]/wizard/div/div[2]/table/tbody/tr/td[1]/div[1]/div";
		driver.findElement(By.xpath(this.target));
		//Login.commonfunc.waitForPageLoad(driver, "xpath", this.target, 3);

		Thread.sleep(2000L);
		//product code
		//this.target = "html/body/form/table/tbody/tr/td[3]/wizard/div/div[2]/table/tbody/tr/td[1]/div[1]/div/table/tbody/tr[16]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr/td[2]/img";
		//if (driver.findElement(By.xpath(this.target)).isSelected()){
		//	driver.findElement(By.xpath(this.target)).click();
		//}
		
		//Save and Execute
		//this.target = "html/body/form/table/tbody/tr/td[3]/wizard/div/div[2]/input[3]";
		//driver.findElement(By.xpath(this.target)).click();
		
		//Save and Return
		this.target = "html/body/form/table/tbody/tr/td[3]/wizard/div/div[2]/input[2]";
		driver.findElement(By.xpath(this.target)).click();
		
		
		
	}

}
