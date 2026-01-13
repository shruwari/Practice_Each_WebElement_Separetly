package PracticeWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_tab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/tabs");
		// What tab
        driver.findElement(By.id("demo-tab-what")).click();
        Thread.sleep(1000);
        WebElement whatText = driver.findElement(By.id("demo-tabpane-what"));
        
        System.out.println("\nOrigin Tab Text:\n" + whatText.getText());   
        // Origin tab
       driver.findElement(By.id("demo-tab-origin")).click();
        Thread.sleep(1000);
        WebElement originText = driver.findElement(By.id("demo-tabpane-origin"));
        System.out.println("\nOrigin Tab Text:\n" + originText.getText());

        // Use tab
        driver.findElement(By.id("demo-tab-use")).click();
        Thread.sleep(1000);
        WebElement useText = driver.findElement(By.id("demo-tabpane-use"));
        System.out.println("\nUse Tab Text:\n" + useText.getText());

        // More tab
       driver.findElement(By.id("demo-tab-more")).click();
        Thread.sleep(1000);
        WebElement moreText = driver.findElement(By.id("demo-tabpane-more"));
        System.out.println("\nMore Tab Text:\n" + moreText.getText());

		
		driver.close();
		
	}

}
