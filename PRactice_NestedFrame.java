package PracticeWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PRactice_NestedFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		       ChromeDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();

		        // 1️⃣ Go to the nested frames page
		        driver.get("https://demoqa.com/nestedframes");

		        // 2️⃣ Count top level frames
		        int totalTopFrames = driver.findElements(By.tagName("iframe")).size();
		        System.out.println("Total top-level iframes: " + totalTopFrames);

		      /*  // 3️⃣ Switch to parent frame by its id
		        WebElement parentFrame = driver.findElement(By.id("frame1"));
		        driver.switchTo().frame(parentFrame);

		        // 4️⃣ Read text inside the parent frame
		        String parentText = driver.findElement(By.tagName("body")).getText();
		        System.out.println("Parent Frame text: " + parentText);

		        // 5️⃣ Switch to child frame (index 0 inside parent)
		        driver.switchTo().frame(0);

		        // 6️⃣ Read text from child frame
		        String childText = driver.findElement(By.tagName("p")).getText();
		        System.out.println("Child Frame text: " + childText);

		        // 💡 Go back to the parent frame
		        driver.switchTo().parentFrame();

		        // 💡 Go back to main page context
		        driver.switchTo().defaultContent();

		        driver.quit();*/
		    }
		}
