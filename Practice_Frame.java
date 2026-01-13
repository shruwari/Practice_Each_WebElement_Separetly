package PracticeWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		
		
		 // ---------- Switch to Frame 1 ----------
	    driver.switchTo().frame("frame2Wrapper");
	    
	    WebElement frame1Text = driver.findElement(By.id("sampleHeading"));
        System.out.println("Frame 1 Text: " + frame1Text.getText());

        
      //----------------------Switch to second form--------------------------------
        
        driver.switchTo().frame("sampleHeading");
        WebElement Frome2Text = driver.findElement(By.id("sampleHeading"));
        
        // Back to main page
        driver.switchTo().defaultContent();

        driver.quit();
	    
        
		
	}

}
