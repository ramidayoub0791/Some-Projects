package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
       WebElement createNewbtn= driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
     createNewbtn.click();
     Thread.sleep(3000);
     WebElement name=driver.findElement(By.cssSelector("input[name='firstname']"));
     name.sendKeys("abracadabra");

        WebElement lastName=driver.findElement(By.cssSelector("input[name$='lastname']"));
        lastName.sendKeys("pass123");

        WebElement email=driver.findElement(By.cssSelector(""));
        name.sendKeys("");
    }
}
