package PracticeWebElement;

    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import java.time.Duration;
	import java.util.List;
   	import org.openqa.selenium.By;
   	import org.openqa.selenium.WebDriver;
   	import org.openqa.selenium.WebElement;
   	import org.openqa.selenium.chrome.ChromeDriver;
   	import org.openqa.selenium.interactions.Actions;
  	import java.time.Duration;


	    	public class Practice_resizable {
	    	    public static void main(String[] args) throws InterruptedException {

	    	        // 2️⃣ Open browser and navigate
	    	        WebDriver driver = new ChromeDriver();
	    	        driver.manage().window().maximize();
	    	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    	        driver.get("https://demoqa.com/resizable");

	    	        // 3️⃣ Scroll into view if needed (optional)
	    	        WebElement resizableSection = driver.findElement(By.id("resizableBoxWithRestriction"));
	    	        ((org.openqa.selenium.JavascriptExecutor) driver)
	    	            .executeScript("arguments[0].scrollIntoView(true);", resizableSection);

	    	        // 4️⃣ Locate the resize handle on the box
	    	        // On demoqa’s resizable the handle is a <span> inside the resizable container
	    	        WebElement resizeHandle = driver.findElement(
	    	            By.cssSelector("#resizableBoxWithRestriction span"));  // handle at bottom-right

	    	        // 5️⃣ Use Actions class to resize by drag
	    	        Actions actions = new Actions(driver);

	    	        // Example: Increase width by ~150px and height by ~100px
	    	        actions
	    	            .clickAndHold(resizeHandle)
	    	            .moveByOffset(150, 100)   // X and Y offset
	    	            .release()
	    	            .perform();

	    	        // ⏱ Pause so you can see it happen
	    	        Thread.sleep(3000);

	    	        // 6️⃣ Quit
	    	        driver.quit();
	    	    }
	    	}

	    
	

