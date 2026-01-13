package PracticeWebElement;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	import java.time.Duration;

	public class Practice_toolTip {

	    public static void main(String[] args) {

	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        driver.get("https://demoqa.com/tool-tips");

	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        Actions actions = new Actions(driver);

	        // 1. Tooltip for Button
	        WebElement button = driver.findElement(By.id("toolTipButton"));
	        actions.moveToElement(button).perform();

	        WebElement buttonTooltip = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(By.className("tooltip-inner")));
	        System.out.println("Button Tooltip Text: " + buttonTooltip.getText());

	        // 2. Tooltip for Text Field
	        WebElement textField = driver.findElement(By.id("toolTipTextField"));
	        actions.moveToElement(textField).perform();

	        WebElement textFieldTooltip = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(By.className("tooltip-inner")));
	        System.out.println("Text Field Tooltip Text: " + textFieldTooltip.getText());

	        // 3. Tooltip for Contrary link
	        WebElement contraryLink = driver.findElement(By.linkText("Contrary"));
	        actions.moveToElement(contraryLink).perform();

	        WebElement contraryTooltip = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(By.className("tooltip-inner")));
	        System.out.println("Contrary Link Tooltip Text: " + contraryTooltip.getText());

	        // 4. Tooltip for Section link
	        WebElement sectionLink = driver.findElement(By.linkText("1.10.32"));
	        actions.moveToElement(sectionLink).perform();

	        WebElement sectionTooltip = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(By.className("tooltip-inner")));
	        System.out.println("Section Link Tooltip Text: " + sectionTooltip.getText());

	        driver.quit();
	    }
	}

	
	
