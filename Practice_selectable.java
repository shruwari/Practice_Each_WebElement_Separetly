package PracticeWebElement;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;
import java.util.List;

public class Practice_selectable {


	    public static void main(String[] args) throws InterruptedException {

	    
	        // 2. Launch Chrome
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	        // 3. Open the Selectable page
	        driver.get("https://demoqa.com/selectable");

	        // 4. Grab all list items from the selectable list
	        List<WebElement> items = driver.findElements(By.cssSelector("#verticalListContainer li"));

	        // 5. Single click on first item
	        if (!items.isEmpty()) {
	            items.get(0).click();
	        }

	        // Optional: Wait so you can see the selection
	        Thread.sleep(1500);

	        // 6. Example: Multiple selection using CTRL (or CMD on Mac)
	        Actions actions = new Actions(driver);
	        // Hold down Control (for Windows/Linux) — use Keys.COMMAND for Mac if needed
	        actions.keyDown(org.openqa.selenium.Keys.CONTROL);
	        // Click items 2 and 3 with control key held
	        if (items.size() > 2) {
	            actions.click(items.get(1))
	                   .click(items.get(2));
	        }
	        actions.keyUp(org.openqa.selenium.Keys.CONTROL);
	        actions.build().perform();

	        // Optional: wait to observe result
	        Thread.sleep(3000);

	        // 7. Close browser
	        driver.quit();
	    }
	}

