package PracticeWebElement;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;

public class Practice_DragAndDrop {


		    public static void main(String[] args) throws InterruptedException {

		        

		        // 2. Launch browser
		        WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		        // 3. Open the Draggable page
		        driver.get("https://demoqa.com/dragabble");

		        // 4. Locate the main draggable box
		        WebElement draggableBox = driver.findElement(By.id("dragBox"));

		        // 5. Create Actions object
		        Actions actions = new Actions(driver);

		        // 6. Drag the box by an offset (e.g., 150px right and 100px down)
		        actions.dragAndDropBy(draggableBox, 150, 100).perform();

		        // 7. Optional: wait to see the result
		        Thread.sleep(2000);

		        // 8. Close the browser
		        driver.quit();
		    }
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


