import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class createACC {
	
public static void main(String args[]) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		    driver.get("https://restaurantsclient.herokuapp.com/#/");
			
			driver.manage().window().maximize() ;
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	
			Thread.sleep(4000);
		
			
		    driver.findElement(By.xpath("//*[@id=\"js-navbar-collapse\"]/ul/li[4]/a")).click();
			driver.findElement(By.xpath("/html/body/div[2]/div/form/div[2]/a")).click();
			
			
			driver.findElement(By.xpath("//*[@id=\"first\"]")).sendKeys("Ime");
			driver.findElement(By.xpath("/html/body/div[2]/div/form/div[4]/input")).sendKeys("Prezime");
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("test.test@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("033 333 333");
			
			
			driver.findElement(By.xpath("/html/body/div[2]/div/form/div[7]/div[1]/select")).click();
			driver.findElement(By.xpath("/html/body/div[2]/div/form/div[7]/div[1]/select/option[2]")).click();
	        driver.findElement(By.xpath("/html/body/div[2]/div/form/div[7]/div[2]/select")).click();
			driver.findElement(By.xpath("/html/body/div[2]/div/form/div[7]/div[2]/select/option[1]")).click();
	        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("demo");
		    driver.findElement(By.xpath("//*[@id=\"passConf\"]")).sendKeys("demo");
	        driver.findElement(By.xpath("/html/body/div[2]/div/form/div[10]/input")).click();
			
			Thread.sleep (4000);
			
            driver.close();
            
           }



}
