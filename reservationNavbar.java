import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class reservationNavbar {
	
	
public static void main(String args[]) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		
		    driver.get("https://restaurantsclient.herokuapp.com/#/");
			
			driver.manage().window().maximize() ;
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	
			Thread.sleep(4000);
			
			driver.findElement(By.xpath("//*[@id=\"js-navbar-collapse\"]/ul/li[4]/a")).click();
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("test@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("testic");
				
		    Thread.sleep (2000);
		    driver.findElement(By.xpath("/html/body/div[2]/div/form/div[5]/input")).click();
	        driver.findElement(By.xpath("//*[@id=\"js-navbar-collapse\"]/ul/li[2]/a")).click();
			
		    Thread.sleep (2000);
			
		    //filling reservation parameters
			
			driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/form/div/div[1]/input")).sendKeys("2");

			WebElement datepicker = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/form/div/div[2]/md-datepicker/button"));
			datepicker.click();
			datepicker.sendKeys(Keys.ENTER);
			 
		    driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/form/div/div[3]/div/table/tbody/tr[2]/td[1]/input")).sendKeys("20");
			
		    Thread.sleep (2000);
		     
		    driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/form/div/div[4]/input")).click();
		    driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/a")).click();
		     
		     
         }

}
