package PracticeWebElement;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import java.time.Duration;
	public class Practice_Link {
	    public static void main(String[] args) throws InterruptedException {

	      
	        // 2️⃣ Launch browser
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        // 3️⃣ Navigate to the Links page
	        driver.get("https://demoqa.com/links");

	        // Optional: Explicit wait
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

	        // —— CLICK THE SIMPLE LINK —— //
	        WebElement homeLink = driver.findElement(By.id("simpleLink"));

	        // Click the "Home" link
	        homeLink.click();

	        // Wait a moment so that a new tab opens
	        Thread.sleep(2000);

	        // Switch back to original tab
	        for (String handle : driver.getWindowHandles()) {
	            driver.switchTo().window(handle);
	        }

	        // —— CLICK API/STATUS LINKS —— //

	        // Example: click the "Created" link
	        WebElement createdLink = wait.until(
	                ExpectedConditions.elementToBeClickable(By.id("created")));
	        createdLink.click();

	        // Wait for the response message to appear
	        WebElement linkResponse = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(By.id("linkResponse")));

	        // Print the status text shown
	        System.out.println("Response for Created link: " + linkResponse.getText());

	        // —— CLICK OTHER STATUS LINKS —— //
	        driver.findElement(By.id("no-content")).click();
	        Thread.sleep(500);

	        driver.findElement(By.id("moved")).click();
	        Thread.sleep(500);

	        driver.findElement(By.id("bad-request")).click();
	        Thread.sleep(500);

	        driver.findElement(By.id("unauthorized")).click();
	        Thread.sleep(500);

	        driver.findElement(By.id("forbidden")).click();
	        Thread.sleep(500);

	        driver.findElement(By.id("invalid-url")).click();
	        Thread.sleep(500);

	        // —— OBSERVE OUTPUT —— //
	        Thread.sleep(2000);

	        // Close browser
	        driver.quit();
	    }
	}

	
