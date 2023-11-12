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
//import com.sun.org.apache.bcel.internal.generic.Select;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Apppage1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 	ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				WebDriver driver = new ChromeDriver(options);
				//WebDriverWait wait = new WebDriverWait(driver, 5);
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thinkpad\\Desktop\\autodocs\\chromedriver.exe");
				//WebDriver driver = new ChromeDriver();
				driver.get("https://uat1.leo1.in/app/dashboard/");
				driver.manage().window().maximize(); 
				//WebDriverWait wait = new WebDriverWait(driver, 5);
							//click on login button
				//WebElement mobilenu =wait.until(ExpectedConditions.visibilityOfElementLocated("//input[@id='mobile'"));
			//	mobilenu.sendKeys("7842290549");
				driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("7842290549");
				driver.findElement(By.xpath("//form[@action='#']//button[@id='redirectButton']")).click();
				Thread.sleep(1000);				
				driver.findElement(By.xpath("//input[@aria-label='Please enter verification code. Digit 1']")).sendKeys("1111");//Enter otp
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[@class='shadow-fp-login bg-white px-6 xl:px-8 py-6 rounded-xl xl:w-[30em]']"
						+ "//div//div//div//button[@id='redirectButton']")).click();// click on verify button
				Thread.sleep(10000);
                driver.findElement(By.cssSelector("a[class='hidden md:flex justify-center md:justify-end'] button[class='text-base"
                		+ " rounded-3xl border-2 border-blue-400 font-medium text-blue-500 px-3 py-2 hover:ring-2 hover:ring-blue-500 "
                		+ "hover:ring-opacity-20 filter hover:brightness-95']")).click();// click on create application 
                Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@name='studentName']")).sendKeys("vcsasdsdsaxzvcxv");//Student name
				driver.findElement(By.xpath("//input[@name='folioRollNumber']")).sendKeys("324879");// Roll number
				driver.findElement(By.xpath("//input[@name='studentDOB']")).sendKeys("23091999");// DoB
				driver.findElement(By.cssSelector("#rc_select_0")).click();//Gender
				driver.findElement(By.cssSelector("#rc_select_0")).sendKeys(Keys.ENTER);
				
				driver.findElement(By.id("rc_select_1")).sendKeys("SRI TRIVENI"); 
				Thread.sleep(1000);
				driver.findElement(By.id("rc_select_1")).sendKeys(Keys.ARROW_DOWN);
				driver.findElement(By.id("rc_select_1")).sendKeys(Keys.ENTER);
				driver.findElement(By.xpath("//input[@id='rc_select_2']")).click();//select branch
				Thread.sleep(2000);
				driver.findElement(By.id("rc_select_2")).sendKeys(Keys.ARROW_DOWN);
				driver.findElement(By.id("rc_select_2")).sendKeys(Keys.ENTER);
				driver.findElement(By.cssSelector("#rc_select_3")).click();// Select course
				Thread.sleep(500);
				driver.findElement(By.id("rc_select_3")).sendKeys(Keys.ARROW_DOWN);
				driver.findElement(By.id("rc_select_3")).sendKeys(Keys.ENTER);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
				Thread.sleep(3000);
				JavascriptExecutor js =(JavascriptExecutor)driver;
			    js.executeScript("window.scroll(0,12500)");
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("button[type='button'] span")).click();//click on proceed
//				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
				Thread.sleep(2000);
				//driver.findElement(By.xpath("//span[normalize-space()='Complete KYC Process']")).click();//kyc process
				//Thread.sleep(6000);
				//JavascriptExecutor jsv =(JavascriptExecutor)driver;
				//jsv.executeScript("window.scroll(0,1000)");
				//driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > "
					//	+ "div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > "
						//+ "div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) >"
						//+ " div:nth-child(1) > span:nth-child(1) > div:nth-child(1) > span:nth-child(1) > div:nth-child(2) > button:nth-child(1) "
						//+ "> span:nth-child(2)")).click();
				
				//WebElement fgf = driver.findElement(By.id("digio-ifm-1683481570867"));
				//driver.switchTo().frame(fgf);
				//driver.findElement(By.xpath("//*[@id=\"authjentication-view\"]/div/div[2]/div/div[11]/div/div/form/div/div[2]/button")).click();
				//Alert lrt = driver.switchTo().alert();
				//lrt.accept();
				//driver.switchTo().defaultContent();
				//WebElement framer= driver.findElement(By.xpath("//div[@class='container company-logo-container text-center']"));
			//	driver.switchTo().frame(framer);
				driver.findElement(By.xpath("//div[@id='wrapperdigio-ifm-1683469755932']//img")).click();
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]"
						+ "/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/span[1]/div[1]/span[1]/div[1]/button[1]")).sendKeys("C:\\Users\\"
								+ "Thinkpad\\Desktop\\autodocs\\DEMO PASSPORT SIZE PHOTO.jpg");

					
	}

}
