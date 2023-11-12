package march23;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Appjourn2 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		//WebDriverWait wait = new WebDriverWait(driver, 3);
		driver.get("https://uat1.leo1.in/app/dashboard/");
		driver.manage().window().maximize(); 
		//Thread.sleep(3000);
		driver.findElement(By.id("mobile")).sendKeys("7842290549");
        driver.findElement(By.id("redirectButton")).click();//Thread.sleep(2000);				
		driver.findElement(By.xpath("//input[@aria-label='Please enter verification code. Digit 1']")).sendKeys("1111");//Enter otp
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='shadow-fp-login bg-white px-6 xl:px-8 py-6 rounded-xl xl:w-[30em]']"
				+ "//div//div//div//button[@id='redirectButton']")).click();// click on verify b

	}

}
