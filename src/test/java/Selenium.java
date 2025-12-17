import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Selenium {
    @Test
    public void helloJayjay() {
        WebDriver driver = WebDriverManager.chromedriver().create();

        driver.get("https://www.saucedemo.com/");
//Fluent wait
        FluentWait<WebDriver> wait = new FluentWait<>(driver);
        wait.withTimeout(Duration.ofSeconds(10));
        wait.pollingEvery(Duration.ofMillis(100));
        wait.ignoring (NoSuchElementException.class);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input#user-name")) );
        driver.findElement(By.cssSelector("input#user-name" )).sendKeys( "standard_user");
        driver.findElement(By.xpath("//*[@id=\"password\"]" )) .sendKeys("secret_sauce");

        driver.findElement(By. id("login-button" )).click();

//        assertEquals();

//        explicit wait
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
//
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input#user-name")));
//        driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
//
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"password\"]")));
//        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
//
//        wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
//        driver.findElement(By.id("login-button")).click();

//        driver.navigate().refresh();
//        driver.navigate().to("https://jayjay.co/");
//        driver.navigate().back();
//        driver.navigate().forward();

//        String title = driver.getTitle();
//        String currentURL = driver.getCurrentUrl();
//        System.out.println("Title pada halaman ini: "+title);
//        System.out.println("Current URL pada halaman ini: "+currentURL);
    }
}
