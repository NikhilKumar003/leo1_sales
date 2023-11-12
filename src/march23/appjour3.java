package march23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class appjour3 {
	public static void main(String[] args) throws Exception {
        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();
        Wait<WebDriver> wait = new FluentWait<>(driver)
        		.withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(org.openqa.selenium.NoSuchElementException.class);

        // Go to a webpage with iframes
        driver.get("https://uat1.leo1.in/app/dashboard/applicant-details/?appId=252133&typeOfApp=B2B");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector(".ant-select-selection-item")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.cssSelector(".ant-select-selection-item']")).sendKeys(Keys.ENTER);
	}
}
