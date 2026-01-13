package PracticeWebElement;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import java.time.Duration;

	public class Practice_RadioButton {
	    public static void main(String[] args) throws InterruptedException {

	        // 1. Set path to your ChromeDriver executable
	        
	        // 2. Launch Chrome browser
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	        // 3. Navigate to the Radio Button page
	        driver.get("https://demoqa.com/radio-button");
	                 
	                // Click using LABEL (correct way)
	        WebElement yesLabel = driver.findElement(By.xpath("//label[@for='yesRadio']"));
	                yesLabel.click();

	                Thread.sleep(1000);

	        WebElement impressiveLabel =
	                        driver.findElement(By.xpath("//label[@for='impressiveRadio']"));
	                impressiveLabel.click();

	                // Verification
	                System.out.println("Yes selected : " +
	                        driver.findElement(By.id("yesRadio")).isSelected());

	                System.out.println("Impressive selected : " +
	                        driver.findElement(By.id("impressiveRadio")).isSelected());

	                Thread.sleep(2000);
	                driver.quit();
	            }
	        }

	        
	        
	        
	        

	        // 4. Select the "Yes" radio button
	     /* 
	      * 
	      * 
	      /******************** NOT WORKING CODE **************************************/
	     /*
	     
	     WebElement yesRadio = driver.findElement(By.id("yesRadio"));
	   
	        if (!yesRadio.isSelected()) {  // check before click
	            	        	yesRadio.click();
	        }

	        // 5. Wait so you can see the selection
	        Thread.sleep(1000);

	        // 6. Select the "Impressive" radio button
	        WebElement impressiveRadio = driver.findElement(By.id("impressiveRadio"));
	        if (!impressiveRadio.isSelected()) {
	            impressiveRadio.click();
	        }

	        // 7. Optional: Print selection status
	        System.out.println("Yes selected: " + yesRadio.isSelected());
	        System.out.println("Impressive selected: " + impressiveRadio.isSelected());

	        // 8. Pause to observe result (optional)
	        Thread.sleep(2000);

	        // 9. Close the browser
	        driver.quit();
	    */
