package org.mouse;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverAction {
	
	public static WebDriver driver;

	  public static void main(String[] args) throws IOException, InterruptedException {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\MouseOverAction\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.greenstechnologys.com/java-training-in-chennai.html");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		WebElement close = driver.findElement(By.className("close"));
		close.click();
		WebElement mouseOver = driver.findElement(By.xpath("//div[@title='Courses']"));
		Actions act=new Actions(driver);
		act.moveToElement(mouseOver).perform();
		WebElement mouse = driver.findElement(By.xpath("//div[@title='Java']"));
		act.moveToElement(mouse).perform();
		
		Thread.sleep(4000);
		WebElement close1 = driver.findElement(By.className("close"));
		close1.click();
		WebElement mouseOver1 = driver.findElement(By.xpath("//div[@title='Courses']"));
		Actions act1=new Actions(driver);
		act1.moveToElement(mouseOver1).perform();
		WebElement mouse1 = driver.findElement(By.xpath("//div[@title='Java']"));
		act.moveToElement(mouse1).perform();
	  }
	  

}
