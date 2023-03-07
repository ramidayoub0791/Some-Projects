package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButton {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");
        WebElement malebtn=driver.findElement(By.cssSelector("input[value='Male']"));
      boolean isEnabled= malebtn.isEnabled();

      System.out.println("the radio button is enabled : "+isEnabled);
      boolean isDisplayed= malebtn.isDisplayed();
        System.out.println("the radio button is displayed : "+isDisplayed);
      boolean isSelected=malebtn.isSelected();
        System.out.println("the radio button is selected : "+isSelected);
        Thread.sleep(2000);
        if(!isSelected) {
            malebtn.click();
            isSelected=malebtn.isSelected();
            System.out.println("the radio button is selected : "+isSelected);

        }
    }
}
