package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropDown {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");
        Thread.sleep(2000);
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='multi-select']"));
        Select sel=new Select(dropDown);
        sel.selectByValue("New Jersey");
        Thread.sleep(2000);
        sel.selectByVisibleText("Ohio");
        Thread.sleep(2000);
        sel.deselectByValue("New Jersey");
        Thread.sleep(2000);
        WebElement selectAll=driver.findElement(By.cssSelector("button[value='Print All']"));
        System.out.println("The drop down is multable:"+sel.isMultiple());

       selectAll.click();


    }
}
