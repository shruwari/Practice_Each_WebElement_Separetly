package PracticeWebElement;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class browserWindow {

	    public static void main(String[] args) {

	        // Step 1: Launch browser
	        WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        //driver.manage().window().maximize();

	        // Step 2: Open URL
	        driver.get("https://demoqa.com/browser-windows");

	        // Store parent window
	        String parentWindow = driver.getWindowHandle();

	        // ================= New Tab =================
	        driver.findElement(By.id("tabButton")).click();

	        switchToChildAndPrintText(driver, parentWindow);

	        // ================= New Window =================
	        driver.findElement(By.id("windowButton")).click();

	        switchToChildAndPrintText(driver, parentWindow);

	        // ================= New Window Message =================
	        driver.findElement(By.id("messageWindowButton")).click();

	        switchToChildAndPrintText(driver, parentWindow);

	        // Close browser
	        driver.quit();
	    }

	    // Reusable method for window handling
	    public static void switchToChildAndPrintText(WebDriver driver, String parentWindow) {

	        Set<String> allWindows = driver.getWindowHandles();

	        for (String window : allWindows) {
	            if (!window.equals(parentWindow)) {
	                driver.switchTo().window(window);

	                System.out.println("Text from child window:");
	                try {
	                    WebElement body = driver.findElement(By.tagName("body"));
	                    System.out.println(body.getText());
	                } catch (NoSuchElementException e) {
	                    System.out.println("This is a message window (no HTML body present)");
	                driver.close(); // close child
	            }
	        }
	        driver.switchTo().window(parentWindow); // back to parent
	    }
	    }
	}
	
