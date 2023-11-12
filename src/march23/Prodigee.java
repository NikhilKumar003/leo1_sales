package march23;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prodigee {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://uat1sales.leo1.in/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='Username']")).sendKeys("nikhil.kumar@financepeer.co");
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Test1@1234");
        driver.findElement(By.xpath("//span[@class='MuiButton-label-213']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='MuiButton-label-96']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("outlined-name")).sendKeys("251252");
        driver.findElement(By.xpath("//span[text()='Submit']")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("div#select-age")).click();// partner search box
        Thread.sleep(1000);
	    driver.findElement(By.cssSelector("li[data-value$='O']")).sendKeys(Keys.ENTER);
	    driver.findElement(By.xpath("//span[text()=' Push']")).click(); 
	}

}
