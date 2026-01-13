package PracticeWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_TextBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 // 2️⃣ Launch Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 3️⃣ Navigate to the Text Box page
        driver.get("https://demoqa.com/text-box");

        // 4️⃣ Fill in Text Box fields

        // Full Name
        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.sendKeys("John Doe");

        // Email
        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys("john.doe@example.com");

        // Current Address
        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("123 Main Street, Bangalore");

        // Permanent Address
        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys("456 Secondary Road, Karnataka");

        // 5️⃣ Click Submit
        WebElement submitButton = driver.findElement(By.id("submit"));
        Thread.sleep(200);
        submitButton.click();

        // 6️⃣ Optional: Wait so you can see results
        Thread.sleep(2000);

        // 7️⃣ Close the browser
     //   driver.quit();
    }
}