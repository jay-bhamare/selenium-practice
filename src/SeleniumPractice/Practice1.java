package SeleniumPractice;

import java.io.File;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Practice1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jayesh Bhamre\\Documents\\Eclipse-workspace\\Selenium practice\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		 driver.get("https://grow.google/grow-your-career/#?modal_active=none");
		  driver.manage().window().maximize();
		 
			driver.manage().getCookies();		
		 driver.findElement(By.xpath("//button[normalize-space()='OK, got it']")).click();
		  driver.findElement(By.xpath("//li[5]//button[1]")).click();
		 WebElement menu = driver.findElement(By.xpath("//span[normalize-space()='Nonprofits and Community Organizations']"));
		 Actions actions= new Actions(driver);
		 actions.moveToElement(menu).perform();
		 driver.findElement(By.linkText("Nonprofits and Community Organizations")).click();
			driver.manage().getCookies();
			
      
			WebElement form = driver.findElement(By.xpath("//a[@data-label='Become a partner']//button[@type='button'][normalize-space()='Become a partner']"));
		 Actions action= new Actions(driver);
		 action.moveToElement(form).perform();
		driver.findElement(By.linkText("Become a partner")).click();
			
			driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Jayesh");
			driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Bhamare");
			driver.findElement(By.xpath("//form[@name='partnerForm']//input[@id='Email Address']")).sendKeys("Jaybhamare20@gmail.com");
			driver.findElement(By.xpath("//input[@id='Title']")).sendKeys("Jayesh");
			driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("333-444-5555");
			driver.findElement(By.xpath("//input[@id='Organization Name']")).sendKeys("Cybage");
			driver.findElement(By.xpath("//input[@id='Organization website address']")).sendKeys("cybage.com");
		
		Select organization = new Select(driver.findElement(By.name("_00N80000005FS6g")));
		organization.selectByVisibleText("Library");
	

		driver.findElement(By.xpath("//input[@value='American Indian']")).click();
		driver.findElement(By.xpath("//input[@value='Asian American and Pacific Islander']")).click();
		
		Select primaryaudience = new Select(driver.findElement(By.name("_00N80000005FS6h")));
		primaryaudience.selectByVisibleText("Educators");

		Select Secondaryaudience = new Select(driver.findElement(By.name("_00N1E000005uraW")));
		Secondaryaudience.selectByVisibleText("Startups");

		Select additionalaudience= new Select(driver.findElement(By.name("_00N1E000005urab")));
		additionalaudience.selectByVisibleText("Jobseekers");
		
		Select individuals = new Select(driver.findElement(By.name("_00N80000005FS6j")));
		individuals.selectByVisibleText("250-500");
		
		Select program = new Select(driver.findElement(By.name("_00N1E000005ural")));
		program.selectByVisibleText("Word of Mouth");
		
		driver.findElement(By.xpath("//input[@id='Organization Street Address']")).sendKeys("abcd");
		driver.findElement(By.xpath("//input[@id='City']")).sendKeys("pune");

		Select state = new Select(driver.findElement(By.name("state")));
		state.selectByVisibleText("Alaska");
		
		driver.findElement(By.xpath("//input[@id='Postal Code']")).sendKeys("555546");
		
		Select country = new Select(driver.findElement(By.name("country")));
		country.selectByVisibleText("Canada");
		
		driver.findElement(By.xpath("//textarea[@id='Individual Cities']")).sendKeys("Nashik");
		driver.findElement(By.xpath("//input[@name='_00N1E0000065q7U']")).sendKeys("jayesh@instagram");
		driver.findElement(By.xpath("//input[@name='_00N1E0000065q7P']")).sendKeys("jayesh@twitter");
		driver.findElement(By.xpath("//textarea[@id='Know About Org']")).sendKeys("none");

		driver.findElement(By.xpath("//form[@name='partnerForm']//input[@id='Privacy Consent']")).click();

		//File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileHandler.copy(file,new File("D:\\redmi note 7s backup\\ss"));
		
	WebElement submit = driver.findElement(By.xpath("//button[normalize-space()='Submit your application']"));
		 Actions formsubmit= new Actions(driver);
	formsubmit.moveToElement(submit).perform();
	driver.findElement(By.linkText("Submit your application")).click();
		
		driver. quit();

	}

}
