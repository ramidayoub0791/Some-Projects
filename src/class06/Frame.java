package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

    public static void main(String[] args) throws InterruptedException {


        //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "myDrivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
//        goto syntax project /dropDown demo
        driver.get("http://www.uitestpractice.com/Students/Switchto");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        // switch to a frame by index
        driver.switchTo().frame(0);
        driver.findElement(By.cssSelector("input[id='name']")).sendKeys("Rami");
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        WebElement text=driver.findElement(By.xpath("//h3"));
        System.out.println("The text is "+text.getText());
    //    driver.findElement(By.cssSelector("a[href='http://www.uitestpractice.com/']")).click();
        driver.switchTo().frame("iframe_a");
        WebElement getLabel=driver.findElement(By.xpath("//label"));
        System.out.println("The label is "+getLabel.getText());

        driver.switchTo().defaultContent();
        WebElement frame1=driver.findElement(By.xpath("//iframe[@name='iframe_a']"));
       driver.switchTo().frame(frame1);
        // OR :
     //  driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='iframe_a']")));
        WebElement head=driver.findElement(By.xpath("//h1[text()='Iframe']"));
        System.out.println(head.getText());

        driver.findElement(By.cssSelector("input[id='name']")).clear();



    }
}