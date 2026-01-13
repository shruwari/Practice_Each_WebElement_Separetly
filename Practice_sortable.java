package PracticeWebElement;


	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import java.util.List;
	import java.time.Duration;

	public class Practice_sortable {
	    public static void main(String[] args) throws InterruptedException {

	        
	        

	        // Launch browser
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	        // Navigate to Sortable demo
	        driver.get("https://demoqa.com/sortable");

	        // Locate all list items
	        List<WebElement> items = driver.findElements(By.cssSelector("#demo-tabpane-list .list-group-item"));

	        // Action builder
	        Actions actions = new Actions(driver);

	        // Example: Drag the first item and drop it after the last item
	        if (items.size() > 1) {
	            WebElement first = items.get(0);
	            WebElement last = items.get(items.size() - 1);

	            actions.clickAndHold(first)
	                   .moveToElement(last)
	                   .pause(Duration.ofSeconds(1))
	                   .release()
	                   .build()
	                   .perform();
	        }

	        // Pause so you can visually see the reorder
	        Thread.sleep(3000);

	        // Clean up
	        driver.quit();
	    }
	}



