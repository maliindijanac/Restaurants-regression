import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class login {

public static void main(String args[]) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		    driver.get("https://restaurantsclient.herokuapp.com/#/");
			
			driver.manage().window().maximize() ;
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	
			Thread.sleep(4000);
			
			driver.findElement(By.xpath("//a[@class='ng-scope']")).click();
			
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("test@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("testic");
			
			driver.findElement(By.xpath("/html/body/div[2]/div/form/div[5]/input")).click();
	
            Thread.sleep (2000);
            driver.close();


          }

}

