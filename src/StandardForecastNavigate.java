import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class StandardForecastNavigate {

	WebDriver driver;
	String target;
	
	public StandardForecastNavigate(){
		driver = Login.driver;
	}
	

	//@Test
	public void nagivateToStandardForecast(){
		//driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame_top_banner");

		//Login.commonfunc.waitForPageLoad(driver, "ID", "icon_navmenu", 3);
		driver.findElement(By.id("icon_navmenu")).click();
		//Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame_right_main");

		//Menu Navigation
		//Login.commonfunc.waitForPageLoad(driver, "ID", "ui-id-10", 3);
		driver.findElement(By.id("ui-id-12")).click();
		
		//Login.commonfunc.waitForPageLoad(driver, "ID", "ui-id-11", 3);
		driver.findElement(By.id("ui-id-13")).click();		
		
		//Login.commonfunc.waitForPageLoad(driver, "ID", "ui-id-12", 3);
		//driver.findElement(By.id("ui-id-12")).click();		
	}

}
