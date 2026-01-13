package PracticeWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice_Progress_bar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	        // 1. Set up WebDriver (Chrome)
		       
		        ChromeDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();

		        // 2. Open DemoQA Progress Bar page
		        driver.get("https://demoqa.com/progress-bar");

		        // 3. Click Start button
		        WebElement startBtn = driver.findElement(By.id("startStopButton"));
		        startBtn.click();

		        // 4. Wait until progress reaches 100%
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		        wait.until(ExpectedConditions.textToBe(By.cssSelector("div#progressBar > div"),
		                                              "100%"));

		        // 5. Print final status
		        System.out.println("Progress reached 100%");

		        // 6. Optionally click Stop (Start button toggles to Stop)
		        WebElement stopBtn = driver.findElement(By.id("startStopButton"));
		        stopBtn.click();

		        // 7. Quit driver
		        driver.quit();
		    }
}


		
		
	