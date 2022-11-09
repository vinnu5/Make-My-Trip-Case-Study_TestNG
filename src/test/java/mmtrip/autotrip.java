package mmtrip;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class autotrip extends javascript_utiljava  {
	WebDriver driver;
	@BeforeTest
	public void beforetest() throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	
		driver.get("https://www.makemytrip.com");
	driver.manage().window().maximize();
	}
	@Test
	public void testcase() throws InterruptedException {
		
		Thread.sleep(5000);
		driver.findElement(By.linkText("Holiday Packages")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='FROM CITY']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[@data-testid='Bangalore']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//span[@data-cy='toCity']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Singapore");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[text()='Singapore']")).click();
        Thread.sleep(6000);
		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
	    Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id='departure_date']")).click();

Thread.sleep(11000);
Thread.sleep(9000);
driver.findElement(By.xpath("//div[@aria-label='Thu Nov 17 2022']")).click();
Thread.sleep(6000);
driver.findElement(By.xpath("//*[@class='primaryBtn big fill btn btn-top-nav btn-lg']")).click();
Thread.sleep(6000);
WebElement slider=driver.findElement(By.xpath("(//div[@class='rc-slider-handle rc-slider-handle-2'])[2]"));
Thread.sleep(6000);
Actions ac=new Actions(driver);
Thread.sleep(6000);
ac.dragAndDropBy(slider,-170,0).build().perform();
Thread.sleep(5000);
JavascriptExecutor js= ((JavascriptExecutor)driver);
js.executeScript("window.scroll(0,1000)");
Thread.sleep(5000);
driver.findElement(By.xpath("(//p[@class='price-actual appendBottom2'])[1]")).click();
Thread.sleep(5000);
System.out.println(driver.getTitle());
ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
int s=tabs.size();
System.out.println(s);
driver.switchTo().window(tabs.get(1)); //switches to new tab
Thread.sleep(5000);
WebElement slider1=driver.findElement(By.xpath("//*[@class='hotel-row-wrapper ']/div/div/div/span"));
slider1.click();
javascript_utiljava .scrollIntoView(slider1, driver);
Thread.sleep(5000);
WebElement hotel =driver.findElement(By.xpath("//*[@class='sidePanelBody']/div[2]/div[2]/div[7]/span"));
hotel.click();
Thread.sleep(5000);
driver.findElement(By.xpath("//*[@class='makeFlex column packageUpdate']/div/p")).click();
Thread.sleep(5000);
WebElement pac=driver.findElement(By.xpath("//*[@class='add-activity-container']/div[2]"));
pac.click();
javascript_utiljava .scrollIntoView(pac, driver);
Thread.sleep(5000);
WebElement wc1=driver.findElement(By.xpath("//*[@class='sidePanelBody']/div[2]/div[2]/div[3]/span"));
wc1.click();
javascript_utiljava .scrollIntoView(wc1, driver);
Thread.sleep(8000);
driver.findElement(By.xpath("//*[@class='makeFlex column packageUpdate']/div/p")).click();
Thread.sleep(7000);
driver.findElement(By.xpath("//*[@class='initerary-nav']/li[2]")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//*[@class='initerary-nav']/li[3]")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//*[@class='initerary-nav']/li[4]")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//*[@class='initerary-nav']/li[5]")).click();
Thread.sleep(5000);
driver.quit();
}}