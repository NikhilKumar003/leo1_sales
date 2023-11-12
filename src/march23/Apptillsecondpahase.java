package march23;

//import java.nio.file.Paths;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.Select;

//import com.sun.org.apache.bcel.internal.generic.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Apptillsecondpahase {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
   	 WebDriverManager.chromiumdriver().setup();
   	WebDriver driver = new ChromeDriver();
      //WebDriverWait wait = new WebDriverWait(driver, 10);

       driver.get("https://uat1.leo1.in/app/dashboard/");
       driver.manage().window().maximize();
       Wait<WebDriver> wait = new FluentWait<>(driver)
       		.withTimeout(Duration.ofSeconds(10))
               .pollingEvery(Duration.ofMillis(500))
               .ignoring(org.openqa.selenium.NoSuchElementException.class);

       // Click on login button
       WebElement mobileNumberInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='mobile']")));

       // Click on login button
       mobileNumberInput.sendKeys("7842290549");
       driver.findElement(By.xpath("//form[@action='#']//button[@id='redirectButton']")).click();
       // Enter OTP
       WebElement otpInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@aria-label='Please enter verification code. Digit 1']")));
       otpInput.sendKeys("1111");
//
       // Click on verify button
       WebElement verifyButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='shadow-fp-login bg-white px-6 xl:px-8 py-6 rounded-xl xl:w-[30em]']//div//div//div//button[@id='redirectButton']")));
       verifyButton.click();
       // Click on create application
       WebElement appbbtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[class='hidden md:flex justify-center md:justify-end'] button[class='text-base rounded-3xl border-2 border-blue-400 font-medium text-blue-500 px-3 py-2 hover:ring-2 hover:ring-blue-500 hover:ring-opacity-20 filter hover:brightness-95']")));
       appbbtn.click();

       // Fill application details{%$#@!NAME!@#$%}
       WebElement stname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name='studentName']")));
       stname.sendKeys("testnnjnikhl"); // Student name
       driver.findElement(By.cssSelector("input[name='folioRollNumber']")).sendKeys("324879"); // Roll number
       driver.findElement(By.cssSelector("input[name='studentDOB']")).sendKeys("23091999"); // DoB
      // Thread.sleep(2000);
      driver.findElement(By.cssSelector("#rc_select_0")).click();
      driver.findElement(By.cssSelector("#rc_select_0")).sendKeys(Keys.ENTER);// Gender
//       genderSelect.selectByVisibleText("Male");
    //  Thread.sleep(2000);
       driver.findElement(By.id("rc_select_1")).sendKeys("SRI TRIVENI");
       Thread.sleep(1000);
       driver.findElement(By.id("rc_select_1")).sendKeys(Keys.ARROW_DOWN);
       driver.findElement(By.id("rc_select_1")).sendKeys(Keys.ENTER);

       driver.findElement(By.cssSelector("#rc_select_2")).click(); // Select branch
       Thread.sleep(1000);
       driver.findElement(By.id("rc_select_2")).sendKeys(Keys.ARROW_DOWN);
       driver.findElement(By.id("rc_select_2")).sendKeys(Keys.ENTER);

       driver.findElement(By.cssSelector("#rc_select_3")).click(); // Select course
       Thread.sleep(500);
       driver.findElement(By.id("rc_select_3")).sendKeys(Keys.ARROW_DOWN);
       driver.findElement(By.id("rc_select_3")).sendKeys(Keys.ENTER);

       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
       Thread.sleep(3000);
       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("window.scroll(0,12500)");
       Thread.sleep(2500);
       driver.findElement(By.cssSelector("button[type='button'] span")).click(); // Click on proceed
       Thread.sleep(6000);
//     
       js.executeScript("window.scroll(0,5500)");
       Thread.sleep(2500);
       WebElement proced2 = driver.findElement(By.xpath("//span[normalize-space()='Proceed']"));
       proced2.click();
       Thread.sleep(2500);
       js.executeScript("window.scroll(0,600)");
       Thread.sleep(2500);
       WebElement elet = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".ant-select-selection-item")));
//       elet.click();
       JavascriptExecutor jsi = (JavascriptExecutor) driver;
       jsi.executeScript("arguments[0].scrollIntoView(true);", elet);
       elet.click();
       WebElement elebt = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".ant-select-selection-item")));
       elebt.sendKeys(Keys.ARROW_DOWN);
       Thread.sleep(2500);
       elet.sendKeys(Keys.ENTER);
       Thread.sleep(2500);
       WebElement monthy = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[name='monthlyIncome']")));
       monthy.sendKeys("50000");
       
//     
       
//      
	
	}

}
