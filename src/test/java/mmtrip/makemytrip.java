package mmtrip;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class makemytrip {
	WebDriver driver;
	@Parameters("mybrowser")
	@BeforeTest()
	public void tc1(String mybrowser) {
		if(mybrowser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else if (mybrowser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
	}
@Test()
public void tc2() throws InterruptedException {
	driver.get("   https://www.makemytrip.com/");
	Thread.sleep(2000);
	driver.findElement(By.linkText("Holiday Packages")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[text()='FROM CITY']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//li[@data-testid='Bangalore']")).click();
	Thread.sleep(6000);
	driver.findElement(By.xpath("//span[@data-cy='toCity']")).click();
	driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Sin");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//div[text()='Singapore']")).click();
    Thread.sleep(6000);
	driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
	Thread.sleep(6000);
	driver.findElement(By.xpath("//*[@id='departure_date']")).click();
    Thread.sleep(11000);
    driver.findElement(By.xpath("//div[@aria-label='Thu Dec 22 2022']")).click();
    Thread.sleep(6000);
    driver.findElement(By.xpath("//button[contains(@class,'primaryBtn big')]")).click();
    
    Thread.sleep(5000);
    WebElement slider=driver.findElement(By.xpath("//*[@class='flexOne makeFlex']/div[3]//div/div//div/div[5]"));
    Thread.sleep(6000);
    Actions ac=new Actions(driver);
    Thread.sleep(6000);
    ac.dragAndDropBy(slider,-170,0).build().perform();
    Thread.sleep(5000);
    JavascriptExecutor js= ((JavascriptExecutor)driver);
    js.executeScript("window.scroll(0,1000)");
    Thread.sleep(5000);
    driver.findElement(By.xpath("//*[@class='Container']/div/div[4]/div/div[2]/div/div/div/div/div")).click();
    Thread.sleep(5000);
    System.out.println(driver.getTitle());
    ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
    int s=tabs.size();
    System.out.println(s);
    driver.switchTo().window(tabs.get(1)); //switches to new tab
    Thread.sleep(5000);
    WebElement slider1=driver.findElement(By.xpath("//*[@class='hotel-row-wrapper ']/div/div/div/span"));
    slider1.click();
    javascript_utiljava.scrollIntoView(slider1, driver);
    Thread.sleep(5000);
    WebElement hotel =driver.findElement(By.xpath("//*[@class='sidePanelBody']/div[2]/div[2]/div[7]/span"));
    hotel.click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//*[@class='makeFlex column packageUpdate']/div/p")).click();
    Thread.sleep(5000);
    WebElement pac=driver.findElement(By.xpath("//*[@class='add-activity-container']/div[2]"));
    pac.click();
    javascript_utiljava.scrollIntoView(pac, driver);
    Thread.sleep(5000);
    WebElement wc1=driver.findElement(By.xpath("//*[@class='sidePanelBody']/div[2]/div[2]/div[3]/span"));
    wc1.click();
    javascript_utiljava.scrollIntoView(wc1, driver);
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
    }
}
