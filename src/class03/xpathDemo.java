package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");
    driver.manage().window().maximize();
WebElement username=driver.findElement(By.xpath("//input[contains(@name,'username')]"));
username.sendKeys("tester");
Thread.sleep(3000);
WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
password.sendKeys("test");
        Thread.sleep(3000);
        username.clear();
        Thread.sleep(3000);
        password.clear();
        Thread.sleep(3000);
       WebElement usernameText= driver.findElement(By.xpath("//label[text()='Username:']"));
        System.out.println(usernameText.getText());
WebElement passwordText=driver.findElement(By.xpath("//label[text()='Password:']"));
String pasText=passwordText.getText();
        System.out.println(pasText);
//driver.close();
    }
}
