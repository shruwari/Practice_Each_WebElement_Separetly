package PracticeWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice_accordian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	        WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        driver.manage().window().maximize();

	        driver.get("https://demoqa.com");

	        driver.findElement(By.xpath("//h5[text()='Widgets']")).click();
	        driver.findElement(By.xpath("//span[text()='Accordian']")).click();

	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        /* ========== SECTION 1 ========== */
	        WebElement section1 = wait.until(
	                ExpectedConditions.elementToBeClickable(By.id("section1Heading")));
	        section1.click();

	        WebElement section1Content = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(By.id("section1Content")));
	        System.out.println("Section 1 Text:\n" + section1Content.getText());

	        /* ========== SECTION 2 ==========  wait ---> */
	        WebElement section2 = wait.until(
	                ExpectedConditions.elementToBeClickable(By.id("section2Heading")));
	        js.executeScript("arguments[0].scrollIntoView(true);", section2); // section 2 mai scroll kiya 
	        section2.click();

	        WebElement section2Content = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(By.id("section2Content")));
	        System.out.println("\nSection 2 Text:\n" + section2Content.getText());

	        /* ========== SECTION 3 ========== */
	        WebElement section3 = wait.until(
	                ExpectedConditions.elementToBeClickable(By.id("section3Heading")));
	        js.executeScript("arguments[0].scrollIntoView(true);", section3);   //section 3 mai again scroll karenge
	        section3.click();

	        WebElement section3Content = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(By.id("section3Content")));
	        System.out.println("\nSection 3 Text:\n" + section3Content.getText());

	        driver.quit();
	    }
	}


//learning :- explicit wait for listed expected conditions like element to be visible,element to be clickable etc 
//if we are not scrolling the page ,It will not be catching the text effectively !!!!