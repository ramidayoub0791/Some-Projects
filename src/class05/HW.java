package class05;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");

       WebElement isselected= driver.findElement(By.cssSelector("input[id='isAgeSelected']"));
       boolean select=isselected.isSelected();
        System.out.println(select);
        if (!select){
           isselected.click();
        }
        select=isselected.isSelected();
        System.out.println(select);
    }
}
/* check if the check box    "click on this check box" is Selected
if no  Select the check box
check gain if the checkbox is Selected or not*/