package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HomeWork {
       public static void main(String[] args) {
       ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
      //  WebDriver driver = new ChromeDriver(options);
        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");


        driver.findElement(By.cssSelector("input[name='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Hum@nhrm123\n");
        driver.findElement(By.cssSelector("input[type='submit']")).click();

        driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/b")).click();

        List<WebElement>idCol=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
       for (int i=0;i<idCol.size();i++){
       if (idCol.get(i).getText().equalsIgnoreCase("52381A")){
           System.out.println("The required id is available on row number :"+(i+1));
           driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[4]/td[1]")).click();
       }
}

            }
        }
/* goto http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
username=Admin
password=Hum@nhrm123
2. click on PIM option
3. from the table select Any  value of id and click the check box associated with it
make sure that ur code is dynamic i.e
changing the id doesnt effect the logic or xpath*/


