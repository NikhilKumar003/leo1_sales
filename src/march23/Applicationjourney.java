package march23;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Applicationjourney {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Thinkpad\\Downloads\\chromedriver_win32new\\chromedriver.exe\"");
		//WebDriver driver = new ChromeDriver();
		driver.get("https://leo1.in/");
		driver.manage().window().maximize(); 	
		//driver.findElement(By.cssSelector("(//button)[1]")).click();
	//click on login button
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		WebElement number= driver.findElement(By.cssSelector("input#mobile"));
		number.sendKeys("7842290549");//enter mobile number
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		//number.sendKeys(Keys.ENTER);////div[@class='relative border-0 rounded-lg shadow-lg flex flex-col w-11/12 lg:max-w-md bg-white outline-none focus:outline-none px-6 lg:px-18 py-14 lg:py-6']//button[@id='redirectButton']
		driver.findElement(By.xpath("//div[@class='relative border-0 rounded-lg shadow-lg "
				+ "flex flex-col w-11/12 lg:max-w-md bg-white outline-none focus:outline-none "
				+ "px-6 lg:px-18 py-14 lg:py-6']//button[@id='redirectButton']")).click();
	    //  driver.findElement(By.id("redirectButton")).click();
		//driver.findElement(By.cssSelector(null))
	}
	

}
