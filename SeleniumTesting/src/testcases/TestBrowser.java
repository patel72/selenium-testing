package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBrowser {

	public static void main(String[] args) {
		/// home/tanisha/Firefoxgeckodrive/chromedriver_linux64/chromedriver
		/// home/tanisha/Firefoxgeckodrive/chromedriver_linux64/chromedriver
		System.setProperty("webdriver.chrome.driver",
				"/home/tanisha/Firefoxgeckodrive/chromedriver_linux64/chromedriver");
		// FirefoxDriver driver = new FirefoxDriver();
		// ChromeDriver driver = new ChromeDriver();

		WebDriver driver = new ChromeDriver();
		// home/tanisha/Firefoxgeckodrive/chromedriver_linux64/chromedriver
		driver.get("https://www.seleniumhq.org/");

	}

}
