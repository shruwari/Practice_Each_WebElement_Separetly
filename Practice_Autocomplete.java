package PracticeWebElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice_Autocomplete {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/auto-complete");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Locate autocomplete input (Multiple color names)
        WebElement autoInput = driver.findElement(By.id("autoCompleteMultipleInput"));

        // Type partial text
        autoInput.sendKeys("re");

        // Wait for suggestions to appear
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector(".auto-complete__menu")));

        // Capture all suggestions
        List<WebElement> suggestions = driver.findElements(By.cssSelector(".auto-complete__option"));

        // Select desired option 
        for (WebElement option : suggestions) {
            if (option.getText().equalsIgnoreCase("Red")) {
                option.click();
                break;
            }
        }

        //Optional: add another value
        autoInput.sendKeys("bl");
        autoInput.sendKeys(Keys.ENTER); // selects first matching option

        // Close browser
        // driver.quit();
    
        /* I need to enter the 3 words into the text box  2. match the 3 words from options */
    
    }
}
