package AssiagnmnentSelinium02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromiumdriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
// FOR ID//
//        driver.findElement(By.id("user-name")).sendKeys("standard_user");
//        driver.findElement(By.id("password")).sendKeys("secret_sauce");
//        driver.findElement(By.id("login-button")).click();
//        Thread.sleep(8000);
//        driver.quit();

        //FOR CLASSNAME//
        driver.findElement(By.className("form_input")).sendKeys("standard_user");
        driver.findElement(By.className("input_error")).sendKeys("secret_sauce");
        driver.findElement(By.className("submit-button")).click();
        Thread.sleep(8000);
        driver.quit();




    }
}
