package class05;

    import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

    public class WindowHandle {
        public static void main(String[] args) {

//        tell your project where the webdriver is located.
//        for mac user please do not use .exe with chromedriver
            System.setProperty("webdriver.chrome.driver", "myDrivers/chromedriver.exe");

            //        create an instance of WebDriver
            WebDriver driver = new ChromeDriver();
//        max the window
            driver.manage().window().maximize();

//        goto syntaxprojects.com
            driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S-1291190790%3A1678243026259432&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ifkv=AWnogHdb8nCgg9TK7ONUl6jFPC9dbH3k4x5J18iYLiMhlVrkmW1A9lYhPPUuxiuC-8MuzwmUSUWW&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

//        click on the help button
            driver.findElement(By.xpath("//a[text()='Help']")).click();
//        click on privacy
            driver.findElement(By.xpath("//a[text()='Privacy']")).click();

//        get the window handle of the parent window
            String parentWindowHandle = driver.getWindowHandle();
            System.out.println(parentWindowHandle);


//        get window handles of all the windows that have been opened up
            Set<String> windowHandles = driver.getWindowHandles();
//        print all the window handles
            for(String wh:windowHandles){
               // System.out.println(wh);
                driver.switchTo().window(wh);
               String tit= driver.getTitle();
                if (tit.equalsIgnoreCase("Privacy Policy – Privacy & Terms – Google"))
                break;
            }
            System.out.println(driver.getTitle());
            driver.switchTo().window(parentWindowHandle);
            System.out.println(driver.getTitle());
        }
    }

