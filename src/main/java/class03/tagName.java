package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class tagName {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        List<WebElement> tags=driver.findElements(By.tagName("a"));
        for (WebElement tag:tags){
            String link=tag.getAttribute("href");
            System.out.println(link);

        }
    }
}
