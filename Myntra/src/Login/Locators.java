package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shankar\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		
		
		/*
		
		Locators in Selenium
		1. By ID
		2. By name
		3. By Class Name
		4. Link Text
		5. Partial Link Text
		6. XPath
		
		*/
		WebElement email_id = driver.findElement(By.id("email"));
		
		email_id.sendKeys("sravanibudati@gmail.com");		
	}
	
	public void locatorsTypes() {
		/*
		Locators in Selenium
		1. By ID
		2. By name
		3. By Class Name
		4. Link Text
		5. Partial Link Text
		6. XPath
		
		*/
	}
}
		
class Men {
	String name;
	String address;
	String age;
	
	void walk() {
		
	}
	
	void run() {
		
	}
}




