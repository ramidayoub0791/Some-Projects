package class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class tablesDynamic {
    public static void main(String[] args) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            WebDriver driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
             driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Default.aspx");
            driver.findElement(By.cssSelector("input[name='ctl00$MainContent$username']")).sendKeys("Tester");
             driver.findElement(By.cssSelector("input[id='ctl00_MainContent_password']")).sendKeys("test");
             driver.findElement(By.xpath("//input[@type='submit']")).click();

            List<WebElement> productColumn =driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td[3]"));
            for (int i=0;i<productColumn.size();i++){
                if (productColumn.get(i).getText().equalsIgnoreCase("ScreenSaver")){
                    System.out.println(productColumn.get(i).getText());
                    System.out.println("The screen saver is located at row number "+(i+2));/* here 2 is correction between
                    java loop and the table source language*/
                    driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr["+(i+2)+"]/td[1]")).click();
                   }
                }
            /* Or by another meaning :
         driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[0+2]/td[1]")).click();
         driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[2+2]/td[1]")).click();*/

            }

        }


