package march23;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.FluentWait;
//import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InstituteDashboard {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 WebDriverManager.chromiumdriver().setup();
	    	WebDriver driver = new ChromeDriver();
	       //WebDriverWait wait = new WebDriverWait(driver, 10);
//	    	 Wait<WebDriver> wait = new FluentWait<>(driver)
//	         		.withTimeout(Duration.ofSeconds(10))
//	                 .pollingEvery(Duration.ofMillis(500))
//	                 .ignoring(org.openqa.selenium.NoSuchElementException.class);

	        driver.get("https://institute.leo1.in/");
	        driver.manage().window().maximize();
	        WebElement email= driver.findElement(By.cssSelector("input[placeholder='Enter your email']"));
//	        email.click();
	        email.sendKeys("singh.ajay@financepeer.co");
//	        Thread.sleep(2000);
	        WebElement pass= driver.findElement(By.cssSelector("input[placeholder='Enter your password']"));
	        pass.sendKeys("School@1234");
	        Thread.sleep(2000);
	        driver.findElement(By.cssSelector("button[type='submit']")).click();
	        driver.findElement(By.cssSelector("input[placeholder='Enter your email']")).sendKeys("singh.ajay@financepeer.co");
	        Thread.sleep(5000);
	        WebElement element = driver.findElement(By.xpath("//span[@class='Sidebar_MenuActiveItemText__6_E5Q']"));
            element.click();  
            Thread.sleep(2000);
            WebElement element1 = driver.findElement(By.xpath("//span[@class='ps-menu-label css-12w9als']"));
            element1.click();
//	        locate the sidebar
//	        WebElement divElement = driver.findElement(By.xpath("//div[@id='sidebar']"));
//
//	        // Perform actions on the div element, for example, click it
//	        divElement.click();
//	        Thread.sleep(3000);
//	        WebElement spanElement = driver.findElement(By.xpath("//span[@class='ps-menu-label ps-open css-12w9als']"));
//
////	         Perform actions on the span element, for example, click it
//	        spanElement.click();
//	        Thread.sleep(2000);
//	        WebElement feepay = driver.findElement(By.xpath("//span[@class='ps-menu-label css-12w9als']"));
//	        feepay.click();
	        
	}

}
