package class05;

    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
    import org.openqa.selenium.chrome.ChromeOptions;

public class handleWindow {
        public static void main(String[] args) throws InterruptedException {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
            System.setProperty("webdriver.chrome.driver", "myDrivers/chromedriver.exe");
            // create a WebDriver instance
            WebDriver driver = new ChromeDriver(options);

//        task : goto gmail signup and get the window handle

//        goto gmail signup page
            driver.get("http://accounts.google.com/signup");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//a[@href='https://support.google.com/accounts?hl=en&p=account_iph']")).click();


//        get the window handle for the current page
            String gmailHandle = driver.getWindowHandle();

//        print
            System.out.println("the handle of the current page is :"+gmailHandle);


        }
    }

