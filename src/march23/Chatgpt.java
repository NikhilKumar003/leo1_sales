package march23;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
//import com.sun.tools.javac.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chatgpt{

    public static void main(String[] args) throws Exception  {
        // ChromeOptions options = new ChromeOptions();
        // options.addArguments("--remote-allow-origins=*");
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thinkpad\\Desktop\\autodocs\\chromedriver.exe");
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
        WebElement createApplicationButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[class='hidden md:flex justify-center md:justify-end'] button[class='text-base rounded-3xl border-2 border-blue-400 font-medium text-blue-500 px-3 py-2 hover:ring-2 hover:ring-blue-500 hover:ring-opacity-20 filter hover:brightness-95']")));
        createApplicationButton.click();

        // Fill application details{%$#@!NAME!@#$%}
        WebElement studentNameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name='studentName']")));
        studentNameInput.sendKeys("tesohhoon"); // Student name
        driver.findElement(By.cssSelector("input[name='folioRollNumber']")).sendKeys("324879"); // Roll number
        driver.findElement(By.cssSelector("input[name='studentDOB']")).sendKeys("23091999"); // DoB
       // Thread.sleep(2000);
       driver.findElement(By.cssSelector("#rc_select_0")).click();
       driver.findElement(By.cssSelector("#rc_select_0")).sendKeys(Keys.ENTER);// Gender
//        genderSelect.selectByVisibleText("Male");
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
        Thread.sleep(2000);

        driver.findElement(By.xpath("//span[normalize-space()='Complete KYC Process']")).click(); 
        Thread.sleep(2000);// KYC process
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
        }//        WebElement parentIframe = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[id^='parentdigio-ifm-']")));
//
        driver.switchTo().defaultContent();
//        // Switch to the parent iframe
//        driver.switchTo().frame(parentIframe);
//
//        // Now, find the inner iframe inside the parent iframe
//        WebElement iframe = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("iframe[id^='digio-ifm-']")));
//        driver.switchTo().frame(iframe);
//        // Switch to the inner iframe
//        driver.switchTo().frame(iframe);
//
//        // Now you can interact with elements inside the inner iframe
//        WebElement elementInsideIframe = driver.findElement(By.xpath("//div[@class='h-full w-full flex items-center justify-between']"));
////        elementInsideIframe.click();
//
//        // Switch back to the main content of the page
//        driver.switchTo().defaultContent();
//        
//        
//        WebElement iframe = driver.findElement(By.cssSelector("iframe[src='data:image/gif;base64,iVBORw0KGgoAAAANSUhEUgAAABQAAAAUCAY"
//        		+ "AAACNiR0NAAAA60lEQVR42tXUPQqEMBAFYO+kYGFhYeFaWAm2qYyFlxBsraxELCzF1ip4Br2CR5klCyuLyeRni4UNTPf4ILxhHOfv3jzPMAwD6HJd1wF"
//        		+ "jTJ2r6xpc131NWZZoOMuyKzeOozzXtu0VUqGf2HuWZRHRKIqE4B2VYXwIISI4TZM0zIdSChjmeR5s2yb/dt/3KIph67qqizFFjTBT1ArTlcQnz3M7DCtAt"
//        		+ "1JfY8aoDaZFi6JQFqAqqmkaEU3TVNsmhlZVJYLHcUAQBNrVuKNxHMN5nvJv7/sOYRiC7/vKPePnjWNJkuCY7QOAx08O9BNR9VtE5qAr5wAAAABJRU5ErkJggg==']"));
//
//        // Switch to the iframe
//        driver.switchTo().frame(iframe);
//        WebElement elementInsideIframe = driver.findElement(By.xpath("//div[@class='h-full w-full flex items-center justify-between']"));

//        driver.switchTo().defaultContent();
      //  driver.findElement(By.id("wrapperdigio-ifm-1689878353065")).click();

        // Upload Passport Size Photo
        WebElement fileInput = driver.findElement(By.xpath("//div[@id='wrapperdigio-ifm-1683469755932']//input[@type='file']"));
        fileInput.sendKeys("C:\\Users\\Thinkpad\\Desktop\\autodocs\\DEMO PASSPORT SIZE PHOTO.jpg");
    }
}
