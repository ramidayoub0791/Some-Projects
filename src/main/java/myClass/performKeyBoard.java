package myClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.util.concurrent.TimeUnit;

public class performKeyBoard {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.get("https://extendsclass.com/text-compare.html");
       WebElement text=driver.findElement(By.xpath("//*[@id=\"dropZone\"]"));
        Actions action=new Actions(driver);
        action.keyDown(text, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
        WebElement text1=driver.findElement(By.xpath("//*[@id=\"dropZone2\"]"));
        action.keyDown(text1,Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
       WebElement result=driver.findElement(By.xpath("//div[@id='nb-diff']"));
        System.out.println(result.getText());
            }
        }

