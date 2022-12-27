package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom
{
	//declaration
   @FindBy(xpath="//div[.='Login ']")
   private WebElement Btn;
	//initialization
	Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//utilization
	public void Button()
	{
		Btn.click();
	}	
}
