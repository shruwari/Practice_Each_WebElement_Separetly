package PracticeWebElement;

	
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import java.net.HttpURLConnection;
		import java.net.URL;
		import java.util.List;

		public class Practice_BrokenLink {

		    public static void main(String[] args) {

		        // ① Launch Chrome (Selenium Manager handles driver automatically)
		        WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();

		        // ② Open the Broken Links page
		        driver.get("https://demoqa.com/broken");

		        // ③ Find all <a> tag elements (links) on the page
		        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		        System.out.println("Total links found: " + allLinks.size());

		        // ④ Loop through each link and check its HTTP status
		        for (WebElement linkElement : allLinks) {
		            String url = linkElement.getAttribute("href");
		            if (url == null || url.isEmpty()) {
		                System.out.println("Empty or missing href for element: " + linkElement.getText());
		                continue;
		            }
		            checkURLStatus(url);
		        }

		        // ⑤ Close browser
		        driver.quit();
		    }

		    // Method to verify link status
		    public static void checkURLStatus(String linkUrl) {
		        try {
		            URL url = new URL(linkUrl);
		            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		            connection.setConnectTimeout(5000);
		            connection.connect();

		            int statusCode = connection.getResponseCode();
		            String message = connection.getResponseMessage();

		            if (statusCode >= 400) {
		                System.out.println(linkUrl + " → " + statusCode + " " + message + " (BROKEN)");
		            } else {
		                System.out.println(linkUrl + " → " + statusCode + " " + message + " (VALID)");
		            }
		        } catch (Exception e) {
		            System.out.println(linkUrl + " → Exception: " + e.getMessage());
		        }
		    }
		}


