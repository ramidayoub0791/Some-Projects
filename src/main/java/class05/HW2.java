package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HW2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        Thread.sleep(2000);
        List<WebElement> options = driver.findElements(By.cssSelector("input[class='cb1-element']"));
        for (WebElement option : options) {
            String check = option.getAttribute("value");
            if (check.equalsIgnoreCase("Option-1")) {
                option.click();
            } else if (check.equalsIgnoreCase("Option-2")) {
                option.click();
            } else if (check.equalsIgnoreCase("Option-3")) {
                option.click();
            } else if (check.equalsIgnoreCase("Option-4")) {
                option.click();
            }
        }
        Thread.sleep(2000);
        WebElement uncheck=driver.findElement(By.cssSelector("input[id='check1']"));
        //   boolean choice=uncheck.getAttribute("value");
        uncheck.click();
    }
}
/*1. u need to write down the code that can select  1 check box out of 4 mentioned,
eg:option1,option2,option3,option4
Note write down the logic in dynamic way i.e one change in if else condition can change ur selection*/
