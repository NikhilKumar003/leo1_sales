package march23;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
//	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
	import io.github.bonigarcia.wdm.WebDriverManager;
	import java.time.Duration;
	import java.util.List;

	public class Listwithdigio {
	    public static void main(String[] args) {
	        WebDriverManager.chromiumdriver().setup();
	        WebDriver driver = new ChromeDriver();
//	        WebDriverWait wait = new WebDriverWait(driver, 20); // Increase the timeout to 20 seconds
	        Wait<WebDriver> wait = new FluentWait<>(driver)
	        		.withTimeout(Duration.ofSeconds(10))
	                .pollingEvery(Duration.ofMillis(500))
	                .ignoring(org.openqa.selenium.NoSuchElementException.class);
	        // Go to the webpage with the iframe
	        driver.get("https://uat1.leo1.in/app/dashboard/upload-document/?appId=252098&typeOfApp=B2B");
	        driver.findElement(By.xpath("//span[normalize-space()='Complete KYC Process']")).click(); 
//	        Thread.sleep(2000);
	        // Get all iframes on the page
	        List<WebElement> iframes = driver.findElements(By.tagName("iframe"));

	        // Iterate through all iframes to find the desired one
	        for (WebElement iframe : iframes) {
	            try {
	                // Switch to the current iframe
	                driver.switchTo().frame(iframe);

	                // Find the inner element inside the iframe using its unique attribute (e.g., class, text, etc.)
	                WebElement elementInsideIframe = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='h-full w-full flex items-center justify-between']")));
	                elementInsideIframe.click();
	                // Do something with the element inside the iframe
	                // ...

	                // Switch back to the main content of the page
	                driver.switchTo().defaultContent();
	                break; // Break the loop once we successfully switch to the desired iframe
	            } catch (Exception e) {
	                // If the element is not found or other exceptions occur, continue to the next iframe
	                driver.switchTo().defaultContent();
	            }
	        }

	        // Continue with actions on elements outside the iframe

	        // Close the browser
	     //   driver.quit();
	    }
	}


