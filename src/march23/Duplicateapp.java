package march23;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;


public class Duplicateapp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 WebDriverManager.chromiumdriver().setup();
	        WebDriver driver = new ChromeDriver();

	        driver.get("https://uat3.leo1.in/app/dashboard/");
	        driver.manage().window().maximize();
            Thread.sleep(2000);
	        driver.findElement(By.id("mobile")).sendKeys("7842290549");
	        driver.findElement(By.id("redirectButton")).click();

	        Wait<WebDriver> wait = new FluentWait<>(driver)
	        		.withTimeout(Duration.ofSeconds(10))
	                .pollingEvery(Duration.ofMillis(500))
	                .ignoring(org.openqa.selenium.NoSuchElementException.class);

	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@aria-label='Please enter verification code. Digit 1']")))
	            .sendKeys("1111");

	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='shadow-fp-login bg-white px-6 xl:px-8 py-6 rounded-xl xl:w-[30em]']"
	                + "//div//div//div//button[@id='redirectButton']")))
	            .click();
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='flex md:hidden justify-center md:justify-end']//button[@class='text-base "
	        		+ "rounded-3xl border-2 border-blue-400 font-medium text-blue-500 px-3 py-2 hover:ring-2 hover:ring-blue-500 hover:"
	        		+ "ring-opacity-20 filter hover:brightness-95'][normalize-space()='+ Create new application']"))).click();// click on create application 
            //Thread.sleep(3000);
	        //driver.quit();
	    }
	
	}


