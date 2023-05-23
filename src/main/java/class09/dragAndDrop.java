package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class dragAndDrop {
    public static void main(String[] args) {


//        tell your project where the webdriver is located.
//        for mac user please do not use .exe with chromedriver
        // System.setProperty("webdriver.chrome.driver", "myDrivers/chromedriver.exe");

        //        create an instance of WebDriver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
//        max the window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.get("https://jqueryui.com/droppable/");

        driver.switchTo().frame(0);

//        get the element which u want to drag
        WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));

//        get the dropable element

        WebElement dropable = driver.findElement(By.xpath("//div[@id='droppable']"));

// action class
        Actions action= new Actions(driver);
        action.dragAndDrop(draggable,dropable).perform();

    }
}