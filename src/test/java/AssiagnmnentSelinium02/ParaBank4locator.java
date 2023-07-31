package AssiagnmnentSelinium02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaBank4locator {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromiumdriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        driver.manage().window().maximize();
//Name locator
        driver.findElement(By.name("username")).sendKeys("Tasu123");
        driver.findElement(By.name("password")).sendKeys("123654");
        Thread.sleep(5000);
        //LINKTEXT
        driver.findElement(By.linkText("About Us")).click();
        driver.findElement(By.linkText("Services")).click();

        //Partial linktest
        driver.findElement(By.partialLinkText("Admin")).click();
        Thread.sleep(5000);
//CSS LOCATOR
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("habib");



    }
}
