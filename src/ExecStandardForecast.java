import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;

public class ExecStandardForecast extends StandardForecastNavigate {

	public ExecStandardForecast(){
		driver = Login.driver;
	}
	
	@Test
	public void exec() throws InterruptedException{
		
		driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
		super.nagivateToStandardForecast();
		
		//Select Execute Standard Forecast Definition
		this.target = "html/body/form/table/tbody/tr/td[3]/wizard/div/div[2]/div[1]/ol/li[4]/span";
		//Login.commonfunc.waitForPageLoad(driver, "xpath", this.target, 3);
		driver.findElement(By.xpath(this.target)).click();
		
		//Select System Forecast
		this.target = "/html/body/form/table/tbody/tr/td[3]/wizard/div/div[2]/div[1]/ol/li/span";
		//Login.commonfunc.waitForPageLoad(driver, "xpath", this.target, 3);
		driver.findElement(By.xpath(this.target)).click();

		Thread.sleep(5000L);
		
	}


}
