package PracticeWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice_modalDialogs {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            driver.get("https://demoqa.com/modal-dialogs");
            driver.manage().window().maximize();

            /* ========= SMALL MODAL TRY BLOCK ========= */
            try {
                WebElement smallModalBtn = wait.until(
                        ExpectedConditions.elementToBeClickable(By.id("showSmallModal")));
                smallModalBtn.click();

                WebElement smallModalText = wait.until(
                        ExpectedConditions.visibilityOfElementLocated(
                                By.cssSelector("#example-modal-sizes-title-sm + .modal-body")));

                System.out.println("Small Modal Text:");
                System.out.println(smallModalText.getText());

                driver.findElement(By.id("closeSmallModal")).click();

            } catch (Exception e) {
                System.out.println("Small Modal failed: " + e.getMessage());
            }

            /* ========= LARGE MODAL TRY BLOCK ========= */
            try {
                WebElement largeModalBtn = wait.until(
                        ExpectedConditions.elementToBeClickable(By.id("showLargeModal")));
                largeModalBtn.click();

                WebElement largeModalText = wait.until(
                        ExpectedConditions.visibilityOfElementLocated(
                                By.cssSelector("#example-modal-sizes-title-lg + .modal-body")));

                System.out.println("\nLarge Modal Text:");
                System.out.println(largeModalText.getText());

                driver.findElement(By.id("closeLargeModal")).click();

            } catch (Exception e) {
                System.out.println("Large Modal failed: " + e.getMessage());
            }

        } finally {
            driver.quit();
        }
    }
}
