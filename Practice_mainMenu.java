package PracticeWebElements;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	import java.time.Duration;

	public class Practice_mainMenu {

	    public static void main(String[] args) {

	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        driver.get("https://demoqa.com/menu");

	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        Actions actions = new Actions(driver);

	        // Hover Main Item 2
	        WebElement mainItem2 = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Main Item 2']")));

	        actions.moveToElement(mainItem2).perform();
	        System.out.println("Hovered on: Main Item 2");

	        // Hover Sub Item
	        WebElement subItem = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Sub Item']")));

	        actions.moveToElement(subItem).perform();
	        System.out.println("Hovered on: Sub Item");

	        // Hover Sub Sub List
	        WebElement subSubList = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Sub Sub List »']")));

	        actions.moveToElement(subSubList).perform();
	        System.out.println("Hovered on: Sub Sub List");

	        // Hover Sub Sub Item 1
	        WebElement subSubItem1 = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Sub Sub Item 1']")));

	        actions.moveToElement(subSubItem1).perform();
	        System.out.println("Hovered on: Sub Sub Item 1");

	        // Hover Sub Sub Item 2
	        WebElement subSubItem2 = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Sub Sub Item 2']")));

	        actions.moveToElement(subSubItem2).perform();
	        System.out.println("Hovered on: Sub Sub Item 2");

	        driver.quit();
	    }
	}
