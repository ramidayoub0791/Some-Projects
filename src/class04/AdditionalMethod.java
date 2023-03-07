package class04;

import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.chrome.ChromeDriver;

public class AdditionalMethod {
    public static void main(String[] args) throws InterruptedException {
        //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
     //   System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
// create a WebDriver instance
        WebDriver driver= new ChromeDriver();
//        goto syntaxProject.com simple-form-demo
        driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        WebElement enterName= (WebElement) driver.findElement(By.xpath("//input[contains(@placeholder,'Please enter your Message')]"));
     //   driver.findElement(By.xpath("//input[contains(@id,'user-message')]")).sendKeys("Rami");
        enterName.sendKeys("Rami");
       Thread.sleep(3000);

        driver.findElement(By.xpath("//button[text()='Show Message']")).click();


        WebElement enterA=driver.findElement(By.xpath("//input[contains(@placeholder,' value')][1]"));
        enterA.sendKeys("10");
        Thread.sleep(3000);

        WebElement enterB=driver.findElement(By.xpath("//input[@id='sum2']"));
        enterB.sendKeys("20");
        Thread.sleep(3000);

        WebElement calcTotal=driver.findElement(By.xpath("//button[@onclick='return total()']"));
        calcTotal.click();

        WebElement total=driver.findElement(By.xpath("//span[@id='displayvalue']"));
        String prin=total.getText();
        System.out.println(prin);
/*
// find the webElement button
        WebElement btn = driver.findElement(By.cssSelector("button#buttoncheck"));
//        get the text from the btn webelement
        String text = btn.getText();
//        print it on console
        System.out.println("the text in the button is :"+text);


//        get the value of the attribute "id" from this WebElement
        String idvalue = btn.getAttribute("id");
//        print it on the console
        System.out.println("the value of the attribute id is :"+idvalue);
*/
    }
}