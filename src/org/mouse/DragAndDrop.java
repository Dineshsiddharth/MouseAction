package org.mouse;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	
	public static WebDriver driver;

	  public static void main(String[] args) throws IOException, InterruptedException {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\MouseOverAction\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		WebElement source = driver.findElement(By.xpath("(// a[@class='button button-orange'])[5]"));
		WebElement dest = driver.findElement(By.id("bank"));
		Actions act=new Actions(driver);
		act.dragAndDrop(source, dest).perform();
		
		WebElement source1= driver.findElement(By.xpath("(// a[@class='button button-orange'])[2]"));
		WebElement dest1 = driver.findElement(By.id("amt7"));
		Actions act1=new Actions(driver);
		act1.dragAndDrop(source1, dest1).perform();
		
		WebElement source2= driver.findElement(By.xpath("(// a[@class='button button-orange'])[6]"));
		WebElement dest2 = driver.findElement(By.id("loan"));
		Actions act2=new Actions(driver);
		act2.dragAndDrop(source2, dest2).perform();
		
		WebElement source3= driver.findElement(By.xpath("(// a[@class='button button-orange'])[4]"));
		WebElement dest3 = driver.findElement(By.id("amt8"));
		Actions act3=new Actions(driver);
		act3.dragAndDrop(source3, dest3).perform();


		

		
	  }

}
