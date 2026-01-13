package PracticeWebElement;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice_alerts {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/alerts");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        // ---------- First Alert ----------
        WebElement btn = driver.findElement(By.id("alertButton"));
        btn.click();

        Alert al = driver.switchTo().alert();
        System.out.println("First Alert Text: " + al.getText());
        al.accept();

        // ---------- Second Alert (Timer Alert) ----------
        WebElement btn_wait = driver.findElement(By.id("timerAlertButton"));
        btn_wait.click();

        Alert delayedAlert = wait.until(ExpectedConditions.alertIsPresent());
        System.out.println("Second Alert Text: " + delayedAlert.getText());
        delayedAlert.accept();

        // ---------- Third Alert (Confirm Alert) ----------
        WebElement confirmBtn = driver.findElement(By.id("confirmButton"));
        confirmBtn.click();

        Alert confirmAlert = wait.until(ExpectedConditions.alertIsPresent());
        System.out.println("Third Alert Text: " + confirmAlert.getText());
        confirmAlert.accept();   // use dismiss() for Cancel

        WebElement result = driver.findElement(By.id("confirmResult"));
        System.out.println("Confirm Result: " + result.getText());

        // ---------- Fourth Alert (Prompt Alert) ----------
        WebElement promptBtn = driver.findElement(By.id("promptButton")); // 
        promptBtn.click();  
 
        Alert promptAlert = wait.until(ExpectedConditions.alertIsPresent());
        System.out.println("Fourth Alert Text: " + promptAlert.getText());
        promptAlert.sendKeys("Last type of Alert");
        promptAlert.accept();

        WebElement promptResult = driver.findElement(By.id("promptResult"));
        System.out.println("Prompt Result: " + promptResult.getText());

        driver.quit();
    }
}
