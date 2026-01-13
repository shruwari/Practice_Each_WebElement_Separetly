package PracticeWebElement;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import java.time.Duration;

	public class Practice_Droppable {
		
	    public static void main(String[] args) throws InterruptedException {

	     
	        // 2️⃣ Create a new Chrome browser instance
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	        // 3️⃣ Go to the DemoQA Droppable page
	        driver.get("https://demoqa.com/droppable");

	        // 4️⃣ Locate the draggable source and droppable target
	        WebElement draggable = driver.findElement(By.id("draggable"));
	        WebElement droppable = driver.findElement(By.id("droppable"));

	        // 5️⃣ Use Actions class to drag from source and drop on target
	        Actions actions = new Actions(driver);
	        actions.dragAndDrop(draggable, droppable).perform();

	        // 6️⃣ Optional: Validate the drop by checking updated text
	        String resultText = droppable.getText();
	        if (resultText.equals("Dropped!")) {
	            System.out.println("✔️ PASS: Drag and drop succeeded.");
	        } else {
	            System.out.println("❌ FAIL: Drag and drop not successful.");
	        }

	        // 7️⃣ Pause to see result (optional)
	        Thread.sleep(2000);

	        // 8️⃣ Close the browser
	        driver.quit();
	    }
	}

	
