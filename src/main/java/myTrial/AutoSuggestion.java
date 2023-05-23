package myTrial;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {
    public static void main(String[] args) throws InterruptedException {

    WebDriver driver=new ChromeDriver();
    driver.get("https://www.booking.com/");
    driver.manage().window().maximize();
    WebElement input=driver.findElement(By.xpath("//input[@placeholder='Where are you going?']"));
    Thread.sleep(2000);
    input.sendKeys("Damascus");
        Thread.sleep(2000);
    input.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
    input.sendKeys(Keys.ENTER);

    }
}
