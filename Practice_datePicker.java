package PracticeWebElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_datePicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://demoqa.com/date-picker");
	       
            // Click on Date And Time input box
	                driver.findElement(By.id("dateAndTimePickerInput")).click();

	                // ---- Select Month ----
	                driver.findElement(By.className("react-datepicker__month-read-view")).click();
	                List<WebElement> months = driver.findElements(By.className("react-datepicker__month-option"));
	                for (WebElement month : months) {
	                    if (month.getText().equalsIgnoreCase("March")) {
	                        month.click();
	                        break;
	                    }
	                }

	                // ---- Select Year ----
	                driver.findElement(By.className("react-datepicker__year-read-view")).click();
	                List<WebElement> years = driver.findElements(By.className("react-datepicker__year-option"));
	                for (WebElement year : years) {
	                    if (year.getText().equals("2026")) {
	                        year.click();
	                        break;
	                    }
	                }

	                // ---- Select Date ----
	                List<WebElement> dates = driver.findElements(
	                        By.xpath("//div[contains(@class,'react-datepicker__day') and not(contains(@class,'outside-month'))]"));
	                for (WebElement date : dates) {
	                    if (date.getText().equals("15")) {
	                        date.click();
	                        break;
	                    }
	                }

	                // ---- Select Time ----
	                List<WebElement> times = driver.findElements(By.className("react-datepicker__time-list-item"));
	                for (WebElement time : times) {
	                    if (time.getText().equals("14:30")) {
	                        time.click();
	                        break;
	                    }
	                }

	                // Optional: Close browser
	                // driver.quit();
	            }
	        }

	        
		
		
		

