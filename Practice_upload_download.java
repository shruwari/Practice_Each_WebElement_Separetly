package PracticeWebElement;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.nio.file.Paths;



public class Practice_upload_download {

	    public static void main(String[] args) throws InterruptedException {

	        // 1️⃣ Launch Chrome (Selenium Manager handles driver)
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        // 2️⃣ Open the Upload & Download page
	        driver.get("https://demoqa.com/upload-download");

	        // —— DOWNLOAD FILE —— //
	        WebElement downloadButton = driver.findElement(By.id("downloadButton"));
	        downloadButton.click();

	        System.out.println("File download initiated...");
	        Thread.sleep(2000); // Wait for download to start

	        // —— UPLOAD FILE —— //
	        WebElement uploadInput = driver.findElement(By.id("uploadFile"));

	        // Provide the full path to your file
	        // Example: Windows: "C:\\Users\\Shruti\\Documen

	
	
}
	    }