package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GmailDefi {

	WebDriver driver;

	@Given("^open google page$")
	public void open_google_page()   {
	   
	
		System.getProperty("webDriver.chrome.driver", ("C:\\Users\\ShriHari\\Desktop\\Automation\\chromedriver.exe"));

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("http://www.google.com");

	}

	@Then("^click on Gmail button$")
	public void click_on_gmail_button() {

		driver.findElement(By.xpath("//input[@class='gb_g']")).click();

	}

	@When("^Enter userid$")
	public void enter_userid() {

		driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("niti_patel31@yahoo.com");
		driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
	}

	@Then("^Enter password$")
	public void enter_password() {

		driver.findElement(By.xpath("//div[@class='aXBtI I0VJ4d Wic03c']//input[@class='whsOnd zHQkBf']"))
				.sendKeys("nitip31");

	}

	@Then("^click on login button$")
	public void click_on_login_button()   {
	   
	driver.findElement(By.xpath("//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ "
			+ "VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc qIypjc TrZEUc']//div[@class='VfPpkd-RLmnJb']")).click();
	}

	@Then("^close the webdriver$")
	public void close_the_webdriver() {

		driver.close();
	}

}



