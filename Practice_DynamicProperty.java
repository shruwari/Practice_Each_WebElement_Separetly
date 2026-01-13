package PracticeWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;




public class Practice_DynamicProperty {

	
	    public static void main(String[] args) throws InterruptedException {

	        // ❗ Optional: Remove System.setProperty if you're using Selenium Manager
	        //System.setProperty("webdriver.chrome.driver", "C:\\Path\\To\\chromedriver.exe");

	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        // Explicit wait
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	        // Open the page
	        driver.get("https://demoqa.com/dynamic-properties");

	        // —— 1️⃣ Wait for "Enable After" Button —— //
	        WebElement enableAfterBtn = wait.until(
	                ExpectedConditions.elementToBeClickable(By.id("enableAfter")));

	        if (enableAfterBtn.isEnabled()) {
	            System.out.println("✅ Enable After button is enabled!");
	        } else {
	            System.out.println("🔸 Enable After button NOT enabled yet");
	        }

	        // Click only if really enabled
	        enableAfterBtn.click(); // it should click when ready
	        System.out.println("Clicked Enable After button");

	        // —— 2️⃣ Wait for "Color Change" Button —— //
	        WebElement colorChangeBtn = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(By.id("colorChange")));

	        System.out.println("Color Change Button text: " + colorChangeBtn.getText());

	        // Just check CSS
	        System.out.println("Current color: " + colorChangeBtn.getCssValue("color"));

	        // —— 3️⃣ Wait for Visible After Button —— //
	        WebElement visibleAfterBtn = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")));

	        System.out.println("Visible After button is now visible!");
	        visibleAfterBtn.click();
	        System.out.println("Clicked Visible After button");

	        // Optional wait so we can see actions
	        Thread.sleep(2000);

	        driver.quit();
	    }
	}
	
	
	

