package march23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Avanse {

	public static void main(String[] args) throws Exception {
     
		//Chrome driver
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--remote-allow-origins=*");
		//WebDriver driver = new ChromeDriver(options);
		//System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Thinkpad\\Downloads\\chromedriver_win32new\\chromedriver.exe\"");
		//WebDriver driver = new ChromeDriver();
		 WebDriverManager.chromiumdriver().setup();
	        WebDriver driver = new ChromeDriver();
		driver.get("https://uat13sales.financepeer.com/");
		driver.manage().window().maximize(); 	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.id("Username")).sendKeys("thambi.babu@financepeer.co");
		driver.findElement(By.id("Password")).sendKeys("Pass@1234");
		driver.findElement(By.className("MuiButton-label-213")).click();//submit
		driver.findElement(By.className("MuiButton-label-96")).click();// push lead
		//outlined-name
		driver.findElement(By.id("outlined-name")).sendKeys("168495");// app id
		//driver.close(); MuiButton-label-96
		//driver.findElement(By.className("MuiTouchRipple-root-246")).click();
	    driver.findElement(By.xpath("//span[text()='Submit']")).click(); ////*[@id="select-age"]
	    //MuiSelect-root-225  //*[@id="main"]/div/div/div[2]/main/div/div[1]/div[2]/label
	    driver.findElement(By.cssSelector("div#select-age")).click();// partner search box
	    driver.findElement(By.cssSelector("li[data-value$='V']")).sendKeys(Keys.ENTER);
	    driver.findElement(By.xpath("//span[text()=' Push']")).click(); 
	    Thread.sleep(10000);
	    System.out.println(driver.findElement(By.cssSelector("Div p")).getText());
	    driver.findElement(By.cssSelector("input[type='checkbox']")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//span[text()=' Push']")).click();
	    Thread.sleep(10000);
	   // driver.findElement(By.xpath("(//div[@role='button'])[2]")).click();
	    JavascriptExecutor js =(JavascriptExecutor)driver;
	    js.executeScript("window.scroll(0,1000)");
	   
	    driver.findElement(By.xpath("(//div[@role='button'])[24]")).click();
	    Thread.sleep(2000);
	    	   // driver.findElement(By.xpath("(//div[@role='button'])[22]")).click();
	    //driver.findElement(By.xpath("(//div[@role='button'])[23]")).click();
	    driver.findElement(By.xpath("//span[text()='RELOAD STATUS']")).click(); 
	    Thread.sleep(4000);
	    js.executeScript("window.scroll(0,-800)");
	    js.executeScript("window.scroll(0,900)");
	    Thread.sleep(4000);
	    js.executeScript("window.scroll(0,-900)");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[text()='Loans']")).click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	    driver.findElement(By.cssSelector("input[placeholder='Application ID']")).sendKeys("168249");
	    driver.findElement(By.xpath("//span[text()='Submit']")).click();
	    Thread.sleep(2000);
	    js.executeScript("window.scroll(50,200)");
	    driver.findElement(By.xpath("(//div[@role='columnheader'])[1]")).click();
	    js.executeScript("window.scroll(1000,0)");
	  //  driver.findElement(By.xpath("//div[@role='button'])[2]")).click();
	    //prodigee.sendKeys(Keys.ARROW_DOWN);
	        //prodigee.sendKeys(Keys.ENTER);
	        // driver.findElement(By.cssSelector("span[css='1']")).click();
	      // driver.findElement(By.xpath("//span[text()='MuiTouchRipple-root-246']")).click(); 
	    //    driver.findElement(By.cssSelector("li[data-value$='H']")).sendKeys(Keys.ARROW_DOWN);
	        //driver.findElement(By.cssSelector("li[data-value$='O']")).sendKeys(Keys.ENTER);
	        
	        //    driver.findElement(By.cssSelector("div#select-age")).sendKeys(Keys.ENTER);
	        		
	        		
	        ////*[@id="select-age"]/span
	    	//Select dd =new Select(Dropdn);
	    	//dd.selectByVisibleText("Prodigee");
	    	
	    	
	    //Select dd= new Select(driver.findElement(By.id("select-age")));
	    
	    
	    
	   // driver.findElement(By.id("select-age")).click();
	    //for(int i=0; i<=14; i++)
	    //{
	    	//driver.findElement(By.id("select-age")).sendKeys(Keys.ARROW_DOWN);
	    	//driver.findElement(By.id("select-age")).sendKeys(Keys.ENTER);
	
	//}
	}
}
	


