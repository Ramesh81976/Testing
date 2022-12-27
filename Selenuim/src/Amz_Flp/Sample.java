package Amz_Flp;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Sample  extends Generic
{
	int parseInt1; int parseInt2;
	@Test
	public void amazon() throws AWTException
	{
	driver.get("	https://www.amazon.in");
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone 14");
	 driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	 driver.findElement(By.xpath("//img[@class='s-image']")).click();
	 Set<String> t = driver.getWindowHandles();
	 ArrayList<String> l = new ArrayList<String>(t);
	 //Thread.sleep(2000);
	 String tab = l.get(1);
	 driver.switchTo().window(tab);
	 String text1 = driver.findElement(By.xpath("//span[@class='a-price aok-align-center reinventPricePriceToPayMargin priceToPay']")).getText();
	 String replaceAll = text1.replaceAll(",", "");
	 String replaceFirst = replaceAll.replaceFirst("₹", "");
	 int parseInt1= Integer.parseInt(replaceFirst);
	 	System.out.println(parseInt1);
	}
	@Test
	public void amazon1() throws AWTException
	{
	 driver.get("	https://www.amazon.in");
	 driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone 13");
	 driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	 driver.findElement(By.xpath("//span[.='Apple iPhone 13 (256GB) - (Product) RED']")).click();
	 Set<String> t = driver.getWindowHandles();
	 ArrayList<String> l = new ArrayList<String>(t);
	 //Thread.sleep(2000);
	 String tab = l.get(1);
	 driver.switchTo().window(tab);
	 String text2 = driver.findElement(By.xpath("//span[@class='a-price aok-align-center reinventPricePriceToPayMargin priceToPay']")).getText();
     String replaceAll = text2.replaceAll(",", "");
     String replaceFirst = replaceAll.replaceFirst("₹", "");
     int parseInt2 = Integer.parseInt(replaceFirst);
	 System.out.println(parseInt2);
	if(parseInt1>parseInt2)
	{
		System.out.println("iphone 14 price("+parseInt1+") is more");
	}
	}
	}
