/**
 * 
 */
package aaaTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * @author Babra
 *
 */
public class TermQuoteTest {

	public static WebDriver driver;
	public static String baseUrl;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.aaalife.com/term-life-insurance-quote-input");
		
		
		// Click on zipCode and enter the valid zipcode
		driver.findElement(By.xpath("//*[@id=\"zip\"]")).sendKeys("48092");
		Thread.sleep(3000);
		// Click on Gender and select the Gender
		driver.findElement(By.id("gender")).click();
		new Select(driver.findElement(By.id("gender"))).selectByVisibleText("Female");
		Thread.sleep(3000);
		// Click on Month and Select the Visible Month "May"
		driver.findElement(By.id("month")).click();
		new Select(driver.findElement(By.id("month"))).selectByVisibleText("May");
		driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Date of Birth'])[1]/following::option[6]"))
				.click();
		Thread.sleep(3000);
		// click on Day and Select Visible Text Day "6"
		driver.findElement(By.id("day")).click();
		new Select(driver.findElement(By.id("day"))).selectByVisibleText("6");
		Thread.sleep(3000);
		// Click on Year and Select the visible Year "1987"
		driver.findElement(By.id("year")).click();
		new Select(driver.findElement(By.id("year"))).selectByVisibleText("1987");
		Thread.sleep(3000);
		// Click on "Yes" Option Under "Are you a AAA member?"
		driver.findElement(By.xpath("//*[@id=\"quoteForm\"]/div/div[1]/div[3]/fieldset/div/label[1]/span")).click();
		Thread.sleep(3000);

		// Click on Email and Enter the Email
		driver.findElement(By.id("contact_email")).sendKeys("abc@gmail.com");
		Thread.sleep(3000);
		// Click on "FT" Select the visible "FT"
		driver.findElement(By.id("feet")).click();
		new Select(driver.findElement(By.id("feet"))).selectByVisibleText("5");
		Thread.sleep(3000);
		// Click on "IN" and Select the Visible "IN"
		driver.findElement(By.id("inches")).click();
		new Select(driver.findElement(By.id("inches"))).selectByVisibleText("3");
		Thread.sleep(3000);
		// Click on Weight and enter the Weight Value
		driver.findElement(By.id("weight")).sendKeys("100");
		Thread.sleep(3000);
		// Select the option "No" Under "Have you uses nicotine in the last 12 months?"
		driver.findElement(By.xpath("//*[@id=\"quoteForm\"]/div/div[3]/div[1]/div[3]/fieldset/div/label[2]")).click();
		Thread.sleep(3000);

		// Click on Coverage Amount and Select Visible Text "$400,000"
		driver.findElement(By.id("coverageAmount")).click();
		new Select(driver.findElement(By.id("coverageAmount"))).selectByVisibleText("$400,000");
		Thread.sleep(3000);

		// Click on TermLength and Select Visible Text "100 Year"
		driver.findElement(By.id("termLength")).click();
		new Select(driver.findElement(By.id("termLength"))).selectByVisibleText("10 Years");
		Thread.sleep(3000);

		// Click on See Your Quote
		driver.findElement(By.id("seeQuote")).click();
		Thread.sleep(3000);

		System.out.println("Test complete");

		driver.close();

	}



	}


