

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class ViewStandardForecast extends StandardForecastNavigate{
	
	int selectDataDropdownCount;
	WebDriver driver;
	String target;
	
	
	public ViewStandardForecast(){
		this.selectDataDropdownCount = 2;
		driver = Login.driver;
	}

	@Test
	public void viewForecast() throws InterruptedException{

		super.nagivateToStandardForecast();
		//driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
		
		//Select Standard Forecast Definition
		this.target = "/html/body/form/table/tbody/tr/td[3]/wizard/div/div[2]/div[1]/ol/li[5]/span";
		//Login.commonfunc.waitForPageLoad(driver, "xpath", this.target, 3);
		driver.findElement(By.xpath(this.target)).click();
		
		//Select View System Forecast
		this.target = "/html/body/form/table/tbody/tr/td[3]/wizard/div/div[2]/div[1]/ol/li/span";
		//Login.commonfunc.waitForPageLoad(driver, "xpath", this.target, 3);
		driver.findElement(By.xpath(this.target)).click();
		
		this.target= "data_id";
		//Login.commonfunc.waitForPageLoad(driver, "id", this.target, 3);
		Select selectData = new Select(driver.findElement(By.id(this.target)));
		
		int count = selectData.getOptions().size();		
		String tab_xpath_front = "html/body/form/table/tbody/tr/td[3]/wizard/div/div[2]/div[2]/ul/li[";
		String tab_xpath_end = "]/a";

		
		for (int i=0;i<count;i++){
			if (i==this.selectDataDropdownCount) break;
			else{
				driver.switchTo().defaultContent();
				driver.switchTo().frame("frame_right_main");
				//Thread.sleep(2000);
				
				this.target = "data_id";
				//Login.commonfunc.waitForPageLoad(driver, "id", this.target, 3);
				Select selectData1 = new Select(driver.findElement(By.id(this.target)));
				selectData1.selectByIndex(i);
				
				Thread.sleep(2000);
				for(int tabnum=1;tabnum<=4;tabnum++){
					this.target = tab_xpath_front + tabnum +tab_xpath_end;
					//Login.commonfunc.waitForPageLoad(driver, "xpath", this.target, 3);
					driver.findElement(By.xpath(this.target)).click();
					Thread.sleep(1000);
				}				
			}
			
		}		
		
	}
	
	//@After
	public void leave(){
		System.out.println();
		System.out.println("View Standard Forecast--> Passed");
		
		//Login.driver.quit();		
	}
	
}
