package PracticeWebElement;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;




public class Practice_WebTable {

	
		    public static void main(String[] args) throws InterruptedException {

		      
		        WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		        driver.get("https://demoqa.com/webtables");

		        // —— ADD NEW RECORD —— //
		        WebElement addButton = driver.findElement(By.id("addNewRecordButton"));
		        addButton.click();

		        Thread.sleep(1000);

		        // Fill in the registration form
		        driver.findElement(By.id("firstName")).sendKeys("John");
		        driver.findElement(By.id("lastName")).sendKeys("Doe");
		        driver.findElement(By.id("userEmail")).sendKeys("john.doe@example.com");
		        driver.findElement(By.id("age")).sendKeys("30");
		        driver.findElement(By.id("salary")).sendKeys("50000");
		        driver.findElement(By.id("department")).sendKeys("QA");

		        driver.findElement(By.id("submit")).click();
		        Thread.sleep(1000);

		        // —— SEARCH FOR RECORD —— //
		        WebElement searchBox = driver.findElement(By.id("searchBox"));
		        searchBox.sendKeys("John");

		        Thread.sleep(1000);

		        // —— VERIFY RECORD EXISTS —— //
		        List<WebElement> rows = driver.findElements(By.cssSelector(".rt-tbody .rt-tr-group"));
		        System.out.println("Matching rows count: " + rows.size());

		        // Print table contents
		        for (WebElement row : rows) {
		            System.out.println(row.getText());
		        }

		        // —— EDIT RECORD —— //
		        WebElement editButton = driver.findElement(By.cssSelector("span[title='Edit']"));
		        editButton.click();

		        Thread.sleep(1000);

		        WebElement ageField = driver.findElement(By.id("age"));
		        ageField.clear();
		        ageField.sendKeys("35");

		        driver.findElement(By.id("submit")).click();
		        Thread.sleep(1000);

		        // —— DELETE RECORD —— //
		        WebElement deleteButton = driver.findElement(By.cssSelector("span[title='Delete']"));
		        deleteButton.click();

		        Thread.sleep(1000);

		        // —— CLEAR SEARCH —— //
		        searchBox.clear();
		        Thread.sleep(500);

		        // Close browser
		        driver.quit();
		    }
		}


