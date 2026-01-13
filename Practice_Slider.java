package PracticeWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice_Slider {

		    public static void main(String[] args) {

		        // Launch browser
		        WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		        // Open slider page
		        driver.get("https://demoqa.com/slider");

		        // Locate slider input
		        WebElement slider = driver.findElement(By.xpath("//input[@type='range']"));

		        // Create Actions class
		        Actions actions = new Actions(driver);

		        // Move slider (positive = right, negative = left)
		        actions.clickAndHold(slider)
		               .moveByOffset(50, 0)   // adjust value as needed
		               .release()
		               .perform();

		        // Get slider value
		        String sliderValue = slider.getAttribute("value");
		        System.out.println("Slider Value is: " + sliderValue);

		        // Close browser
		        driver.quit();
		    
		}


}

/* slider ko move kerne k liye action classs lagegi kyuki mouse ka responsibility hai .... 
 * 
 * 
 * click and hold 
 * move by offset 
 *  
 * 
 * 
 * */
 
		
	
