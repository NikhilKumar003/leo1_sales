package march23;


	import java.time.Duration;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

//	import org.openqa.selenium.chrome.ChromeOptions;
//	import org.openqa.selenium.support.ui.WebDriverWait;
//	import org.openqa.selenium.support.ui.ExpectedConditions;
	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Digioframe{
	    public static void main(String[] args) throws Exception {
	        WebDriverManager.chromiumdriver().setup();
	        WebDriver driver = new ChromeDriver();
	        Wait<WebDriver> wait = new FluentWait<>(driver)
	        		.withTimeout(Duration.ofSeconds(10))
	                .pollingEvery(Duration.ofMillis(500))
	                .ignoring(org.openqa.selenium.NoSuchElementException.class);

	        // Go to a webpage with iframes
	        driver.get("https://uat3.leo1.in/app/dashboard/upload-document/?appId=252070&typeOfApp=B2B");
	        Thread.sleep(3000);
	        WebElement image = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.ant-btn-round")));
	        image.click();

//	        driver.findElement(By.xpath("//span[normalize-space()='Complete KYC Process']")).click(); 
//	        Thread.sleep(3000);
//	        // Switch to the first iframe (index 0)
//	        driver.switchTo().frame(0);
//	        Thread.sleep(3000);
//	        // Now you can interact with elements inside the iframe
//	        WebElement elementInsideIframe = driver.findElement(By.xpath("//div[@class='h-full w-full flex items-center justify-between']"));
//	        elementInsideIframe.click();
//
//	        // Switch back to the main content of the page
//	        driver.switchTo().defaultContent();

	        // Continue with actions on elements outside the iframe
//	        WebElement outsideIframeElement = driver.findElement(By.cssSelector("#outsideIframeElement"));
//	        outsideIframeElement.sendKeys("Hello, world!");

	        // Close the browser
//	        driver.quit();
//	        WebElement image= driver.findElement(By.cssSelector("#main-content > div > div > div > div > div > div > div.py-3.mt-8 >"
//	       		+ " div.mt-8.bg-white.rounded-3xl.shadow.border.px-8.py-3.pb-0 > div > div > div > div:nth-child(2) > "
//	       		+ "div:nth-child(2) > div > span > div.ant-upload.ant-upload-select > span > div > button"));
//	       image.click();
////	            image.sendKeys("C:\\Users\\Thinkpad\\Desktop\\autodocs\\DEMO PASSPORT SIZE PHOTO.jpg");
//	            	  String rfp="DEMO PASSPORT SIZE PHOTO.jpg";
//		  String afb=Paths.get("src","resourse",rfp).toFile().getAbsolutePath();
//		  image.sendKeys(afb);
	    // Locate the image upload button using CSS selector
//	     String picc= System.getProperty("user.dir");
//	       driver.findElement(By.cssSelector("#main-content > div > div > div > div > div > div > div.py-3.mt-8 >"
//	      		+ " div.mt-8.bg-white.rounded-3xl.shadow.border.px-8.py-3.pb-0 > div > div > div > div:nth-child(2) > "
//	      		+ "div:nth-child(2) > div > span > div.ant-upload.ant-upload-select > "
//	      		+ "span > div > button")).sendKeys(picc+"\\files\\pic.jpg");
	    }
	}


