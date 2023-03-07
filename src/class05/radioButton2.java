package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class radioButton2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");
  List<WebElement>radiobtns= driver.findElements(By.xpath("//input[@name='ageGroup']"));
   for (WebElement radiobtn:radiobtns){
       String age=radiobtn.getAttribute("value");

       if (age.equalsIgnoreCase(("5 - 15"))){
           radiobtn.click();
       }


   }
    }
}
