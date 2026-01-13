package PracticeWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;
import java.util.List;

public class Practice_checkBox {

		    public static void main(String[] args) throws InterruptedException {

		          // 2️⃣ Launch browser
		        WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		        // 3️⃣ Navigate to Checkbox page
		        driver.get("https://demoqa.com/checkbox");

		        // 4️⃣ Expand all tree nodes (click expand icons)
		        // First expand the Home node
		        WebElement expandHome = driver.findElement(By.cssSelector("button[title='Toggle']"));
		        expandHome.click();

		        // Optionally wait so you can see expansion
		        Thread.sleep(1000);

		        // Expand Office node
		        WebElement expandOffice = driver.findElement(By.xpath("//span[@class='rct-node-collapsed']//button"));
		        expandOffice.click();

		        // Optionally wait
		        Thread.sleep(1000);

		        // 5️⃣ Check one or more checkboxes by clicking on the label
		        // Example: Click "Desktop", "Documents", "Downloads"
		        WebElement desktopCheckbox = driver.findElement(By.xpath("//label[@for='tree-node-desktop']"));
		        WebElement documentsCheckbox = driver.findElement(By.xpath("//label[@for='tree-node-documents']"));
		        WebElement downloadsCheckbox = driver.findElement(By.xpath("//label[@for='tree-node-downloads']"));

		        desktopCheckbox.click();
		        Thread.sleep(500);
		        documentsCheckbox.click();
		        Thread.sleep(500);
		        downloadsCheckbox.click();
		        Thread.sleep(500);

		        // 🔎 Optionally verify selected state
		        System.out.println("Desktop selected: " +
		            driver.findElement(By.id("tree-node-desktop")).isSelected());

		        // 6️⃣ Wait so you can visually confirm
		        Thread.sleep(2000);

		        // 7️⃣ Close browser
		        driver.quit();
		    }
		}

 
	

