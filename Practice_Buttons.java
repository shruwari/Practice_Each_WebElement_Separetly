package PracticeWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice_Buttons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 ChromeDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	        // 3️⃣ Open Buttons page
	        driver.get("https://demoqa.com/buttons");

	        // 4️⃣ Create Actions object
	        Actions actions = new Actions(driver);

	        // —— DOUBLE CLICK —— //
	        WebElement doubleClickBtn = driver.findElement(By.id("doubleClickBtn"));
	        actions.doubleClick(doubleClickBtn).perform();

	        // Validate double click message
	        WebElement doubleClickMsg = driver.findElement(By.id("doubleClickMessage"));
	        System.out.println("DoubleClick Msg: " + doubleClickMsg.getText());

	        Thread.sleep(1000);

	        // —— RIGHT CLICK —— //
	        WebElement rightClickBtn = driver.findElement(By.id("rightClickBtn"));
	        actions.contextClick(rightClickBtn).perform();

	        // Validate right click message
	        WebElement rightClickMsg = driver.findElement(By.id("rightClickMessage"));
	        System.out.println("RightClick Msg: " + rightClickMsg.getText());

	        Thread.sleep(1000);

	        // —— SINGLE CLICK —— //
	        WebElement clickMeBtn = driver.findElement(
	            By.xpath("//button[text()='Click Me']"));
	        clickMeBtn.click();

	        // Validate single click message
	        WebElement dynamicClickMsg = driver.findElement(By.id("dynamicClickMessage"));
	        System.out.println("Click Me Msg: " + dynamicClickMsg.getText());

	        // Pause to observe
	        Thread.sleep(2000);

	        // 5️⃣ Quit
	        driver.quit();
	    }
	}	
		

