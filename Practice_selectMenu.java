package PracticeWebElement;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;


public class Practice_selectMenu {

	    public static void main(String[] args) {

	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        driver.get("https://demoqa.com/select-menu");

	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        Actions actions = new Actions(driver);

	        // -------- Standard Single Select (Old Style) --------
	        WebElement oldSelectMenu = wait.until(
	                ExpectedConditions.elementToBeClickable(By.id("oldSelectMenu")));
	        Select select = new Select(oldSelectMenu);
	        select.selectByVisibleText("Purple");
	        System.out.println("Selected (old style): " + select.getFirstSelectedOption().getText());

	        // -------- Select Value (React Select) --------
	        WebElement reactSelectValue = driver.findElement(By.xpath("//div[text()='Select Option']"));
	        reactSelectValue.click();
	        WebElement selectValueOption = wait.until(
	                ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Group 2, option 1']")));
	        selectValueOption.click();
	        System.out.println("Selected React Select Value: Group 2, option 1");

	        // -------- Select One (React Single Select) --------
	        WebElement selectOne = driver.findElement(By.xpath("//div[text()='Select...']"));
	        selectOne.click();
	        WebElement selectOneOption = wait.until(
	                ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Dr.']")));
	        selectOneOption.click();
	        System.out.println("Selected One: Dr.");

	        // -------- Old Multi Select --------
	        WebElement multiSelect = driver.findElement(By.id("multiSelectExample"));
	        Select multi = new Select(multiSelect);
	        multi.selectByVisibleText("Volvo");
	        multi.selectByVisibleText("Opel");
	        List<WebElement> selected = multi.getAllSelectedOptions();
	        System.out.println("Multi Selected options:");
	        for (WebElement opt : selected) {
	            System.out.println(" • " + opt.getText());
	        }

	        // -------- React Multi Select (With Ctrl + Click Style) --------
	        WebElement multiReact = driver.findElement(By.xpath("//div[text()='Select...'][@id='selectMenuContainer']//following::div[contains(@class,'css-1hwfws3')]"));
	        multiReact.click();

	        WebElement multiOption1 = wait.until(
	                ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Green']")));
	        multiOption1.click();
	        WebElement multiOption2 = driver.findElement(By.xpath("//div[text()='Black']"));
	        multiOption2.click();
	        System.out.println("React Multi Selected: Green & Black");

	        driver.quit();
	    }
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

