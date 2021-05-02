package zeecompany.seleniuminterview;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App 
{
    public static void main( String[] args )
    {
      WebDriverManager.firefoxdriver().setup();
      WebDriver driver  = new FirefoxDriver();
      driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");
      WebElement element = driver.findElement(By.name("first_name"));
      element.sendKeys("jhone");
      System.out.println(element.getAttribute("value"));
      WebElement text = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/section/form/fieldset/div[7]/div/div/select"));
      Select dropdown  = new Select(text);
      try {
    	 dropdown.selectByValue(" ");
      }
      catch(Exception e){
    	  System.out.println(e.getMessage());
      }
      driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
      //driver.close();
    }
}
